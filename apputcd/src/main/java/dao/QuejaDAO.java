package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;

import conexion.Conexion;
import entidad.Queja;

// TODO: Agregar los mismo que hay en ArticuloDAO.java

public class QuejaDAO {

	// Para realizar las conexiones, no sé...
	private Conexion con;
	private Connection connection;

	public QuejaDAO(String URL, String USUARIO, String CLAVE) throws SQLException {
		System.out.println(URL);
		con = new Conexion();
	}

	// Para el contador que acumule uno en uno.
	// Contador que ira incrementando el valor del ID el cual genera
	// automaticamente.
	// private static final AtomicLong contadorid = new AtomicLong(104);
	private AtomicInteger contadorid = new AtomicInteger(0);
	// private String activoS = "S";
	// private String inactivoN = "N";
	// Para obtener fecha-hora actual del sistema operativo.
	Long datetime = System.currentTimeMillis();
	Timestamp timestamp = new Timestamp(datetime);

	// PROCEDIMIENTO DE INSERCIÓN
	public boolean insertar(Queja queja, HttpServletRequest request) throws SQLException {
		String sql = "INSERT INTO sys_reclamo_aux (idreclamo, nombre, apellido, telefono, departamento, ciudad, barrio, direccion, correo, referencia, fecha_hora_recepcion) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);

		// CONTADOR PARA INSERTAR EL ID
		int ultimoIdReclamo = obtenerUltimoIdReclamo();
		contadorid.set(ultimoIdReclamo + 1);

		statement.setInt(1, contadorid.get());
		statement.setString(2, queja.getNombre());
		statement.setString(3, queja.getApellido());
		statement.setString(4, queja.getTelefono());
		// statement.setInt(5, queja.getNis());
		statement.setString(5, queja.getDepartamento());
		statement.setString(6, queja.getCiudad());
		statement.setString(7, queja.getBarrio());
		statement.setString(8, queja.getDireccion());
		statement.setString(9, queja.getCorreo());
		statement.setString(10, queja.getReferencia());
		// statement.setString(2, queja.getNumeroReclamo());
		// statement.setString(9, queja.getNumeroMovil());
		// statement.setString(11, queja.getObservacion());

		// Añadir fecha y hora para la recepción de ese reclamo:
		statement.setTimestamp(11, timestamp);

		// Agregar los departamentos, ciudades, y barrios

		// Para obtener e insertar el usuario de sesión.
		/*
		 * String usuarioCreacion = request.getParameter("nombre");
		 * statement.setString(13, usuarioCreacion);
		 */

		boolean rowInserted = statement.executeUpdate() > 0;
		System.out.println("Articulo registrado into QuejaDAO");
		statement.close();
		con.desconectar();
		return rowInserted;
	}

	// LISTAR TODOS LAS QUEJAS
	public List<Queja> listarQuejas() throws SQLException {
		List<Queja> listaQuejas = new ArrayList<>();
		String sql = "SELECT * FROM sys_reclamo_aux";
		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);

		while (resulSet.next()) {
			int idreclamo = resulSet.getInt("idreclamo");
			String nombre = resulSet.getString("nombre");
			String apellido = resulSet.getString("apellido");
			String telefono = resulSet.getString("telefono");
			// int nis = resulSet.getInt("nis");
			String departamento = resulSet.getString("departamento");
			String ciudad = resulSet.getString("ciudad");
			String barrio = resulSet.getString("barrio");
			String direccion = resulSet.getString("direccion");
			String correo = resulSet.getString("correo");
			String referencia = resulSet.getString("referencia");
			// String numero_reclamo = resulSet.getString("numero_reclamo");
			// String numero_movil = resulSet.getString("numero_movil");
			// String observacion = resulSet.getString("observacion");
			// Queja queja = new Queja(idreclamo, numero_reclamo, nis, telefono, nombre,
			// apellido, direccion, referencia, numero_movil, correo, observacion,
			// departamento, ciudad, barrio);
			// TODO: Take an eye with this:
			Queja queja = new Queja(idreclamo, nombre, apellido, telefono, departamento, ciudad, barrio, direccion,
					correo, referencia);
			listaQuejas.add(queja);
		}
		con.desconectar();
		return listaQuejas;
	}

	// Este método está relacionado con el contador para insertar el ID.
	private int obtenerUltimoIdReclamo() throws SQLException {
		String sql = "SELECT MAX(idreclamo) FROM sys_reclamo_aux";
		try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
			if (resultSet.next()) {
				return resultSet.getInt(1);
			}
		}
		// Si no hay registros en la tabla, retorna un valor predeterminado
		return 0;
	}

	// OBTENER POR ID:
	public Queja obtenerPorId(int idreclamo) throws SQLException {
		Queja queja = null;
		String sql = "SELECT * FROM sys_reclamo_aux WHERE idreclamo=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, idreclamo);
		ResultSet res = statement.executeQuery();

		if (res.next()) {
			// queja = new Queja(res.getInt("idreclamo"), res.getString("numero_reclamo"),
			// res.getInt("nis"), res.getString("telefono"), res.getString("nombre"),
			// res.getString("apellido"), res.getString("direccion"),
			// res.getString("referencia"), res.getString("numero_movil"),
			// res.getString("correo"), res.getString("observacion"),
			// res.getString("departamento"), res.getString("ciudad"),
			// res.getString("barrio"));
			queja = new Queja(res.getInt("idreclamo"), res.getString("nombre"), res.getString("apellido"),
					res.getString("telefono"), res.getString("departamento"), res.getString("ciudad"),
					res.getString("barrio"), res.getString("direccion"), res.getString("correo"),
					res.getString("referencia"));
		}
		res.close();
		con.desconectar();

		return queja;
	}

	public boolean actualizar(Queja queja) throws SQLException {
		boolean rowActualizar = false;
		// String sql = "UPDATE sys_reclamo_aux SET
		// numero_reclamo=?,nis=?,telefono=?,nombre=?,apellido=?,direccion=?,referencia=?,numero_movil=?,correo=?,observacion=?,departamento=?,ciudad=?,barrio=?
		// WHERE idreclamo=?";
		String sql = "UPDATE sys_reclamo_aux SET telefono=?,nombre=?,apellido=?,direccion=?,referencia=?,correo=?,departamento=?,ciudad=?,barrio=? WHERE idreclamo=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		// statement.setString(1, queja.getNumeroReclamo());
		// statement.setInt(2, queja.getNis());
		statement.setString(1, queja.getTelefono());
		statement.setString(2, queja.getNombre());
		statement.setString(3, queja.getApellido());
		statement.setString(4, queja.getDireccion());
		statement.setString(5, queja.getReferencia());
		// statement.setString(8, queja.getNumeroMovil());
		statement.setString(6, queja.getCorreo());
		// statement.setString(10, queja.getObservacion());
		statement.setString(7, queja.getDepartamento());
		statement.setString(8, queja.getCiudad());
		statement.setString(9, queja.getBarrio());
		statement.setInt(10, queja.getIdReclamo());
		rowActualizar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowActualizar;
	}

	// Por ahora hace la eliminación y no inactivación
	public boolean actualizarInactivar(Queja queja, HttpServletRequest request) throws SQLException {
		boolean rowInactivar = false;
		String sql = "DELETE FROM sys_reclamo_aux WHERE idreclamo=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, queja.getIdReclamo());

		rowInactivar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();

		return rowInactivar;
	}

	// ELIMINAR RECLAMOS
	public boolean eliminar(Queja queja) throws SQLException {
		boolean rowEliminar = false;
		String sql = "DELETE FROM sys_reclamo_aux WHERE idreclamo=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		// statement.setInt(1, articulo.getIdarticulo());
		statement.setInt(1, queja.getIdReclamo());
		rowEliminar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowEliminar;
	}

}
// XD