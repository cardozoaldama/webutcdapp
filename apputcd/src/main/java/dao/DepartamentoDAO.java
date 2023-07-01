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
import entidad.Departamento;

// En DAO se hacen las operaciones básicas...

public class DepartamentoDAO {

	private Conexion con;
	private Connection connection;

	public DepartamentoDAO(String URL, String USUARIO, String CLAVE) throws SQLException {
		System.out.println(URL);
		con = new Conexion();
	}
	
	// Para el contador que acumule uno en uno.
		// Contador que ira incrementando el valor del ID el cual genera
		// automaticamente.
		// private static final AtomicLong contadorid = new AtomicLong(104);
		private AtomicInteger contadorid = new AtomicInteger(0);
		private String activoS = "S";
		private String inactivoN = "N";
		// Para obtener fecha-hora actual del sistema operativo.
		Long datetime = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(datetime);
		
		// REALIZAR PROCEDIMIENTO DE INSERTAR DEPARTAMENTO.
		public boolean insertar(Departamento departamento, HttpServletRequest request) throws SQLException {
			String sql = "INSERT INTO sys_departamento (iddepartamento, nombre, observacion, activo, codigo, fecha_hora_recepcion, usuario_modificacion, usuario_creacion) VALUES (?,?,?,?,?,?,?,?);";
			con.conectar();
			connection = con.getJdbcConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			
			// CONTADOR PARA INSERTAR EL ID
			int ultimoIdDepartamento = obtenerUltimoIdDepartamento();
			contadorid.set(ultimoIdDepartamento + 1);
			statement.setInt(1, contadorid.get());
			statement.setString(2, departamento.getNombre());
			statement.setString(3, departamento.getObservacion());
			// Activarlo por defecto:
			statement.setString(4, activoS);
			// Agregar un código aleatorio...
			statement.setString(5, "ABC");
			// Añadir fecha y hora para la recepción de ese departamento:
			statement.setTimestamp(6, timestamp);
			// Para colocar el usuario quien modificó. Arroja NULL...
			String usuarioModificacion = request.getParameter("nombre");
			statement.setString(7, usuarioModificacion);
			// Para obtener e insertar el usuario de sesión
		    String usuarioCreacion = request.getParameter("nombre");
		    statement.setString(8, usuarioCreacion);
		    
		    boolean rowInserted = statement.executeUpdate() > 0;
			System.out.println("Departamento registrado en DepartamentoDAO");
			statement.close();
			con.desconectar();
			return rowInserted;
		}
		
		 // Este método está relacionado con el contador para insertar el ID.
		private int obtenerUltimoIdDepartamento() throws SQLException {
				String sql = "SELECT MAX(iddepartamento) FROM sys_departamento";
				try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
					if (resultSet.next()) {
						return resultSet.getInt(1);
					}
				}
				// Si no hay registros en la tabla, retorna un valor predeterminado.
			return 0;
		}
		
		// OBTENER POR ID:
		public Departamento obtenerPorId(int iddepartamento) throws SQLException {
			Departamento departamento = null;
			String sql = "SELECT * FROM sys_departamento WHERE iddepartamento=?";
			con.conectar();
			connection = con.getJdbcConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, iddepartamento);
			ResultSet res = statement.executeQuery();
			if(res.next()) {
				departamento = new Departamento(res.getInt("iddepartamento"), res.getString("nombre"), res.getString("observacion"));
			}
			res.close();
			con.desconectar();
			
			return departamento;
		}
		
		// Actualizar Departamentos
		public boolean actualizar(Departamento departamento, HttpServletRequest request) throws SQLException {
			boolean rowActualizar = false;
			String sql = "UPDATE sys_departamento SET nombre=?, observacion=?, fecha_hora_recepcion=?, usuario_modificacion=?, WHERE iddepartamento=?";
			con.conectar();
			connection = con.getJdbcConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, departamento.getNombre());
			statement.setString(2, departamento.getObservacion());
			statement.setTimestamp(3, timestamp);
			String usuarioModificacion = request.getParameter("nombre");
			statement.setString(4, usuarioModificacion);
			statement.setInt(5, departamento.getIddepartamento());
			statement.close();
			con.desconectar();
			return rowActualizar;
		}
		
		// INACTIVACIÓN DEL DEPARTAMENTO
		public boolean actualizarInactivar(Departamento departamento, HttpServletRequest request) throws SQLException {
			boolean rowInactivar = false;
			String sql = "UPDATE sys_departamento SET activo=?, usuario_modificacion=?, fecha_hora_recepcion=? WHERE iddepartamento=?";
			con.conectar();
			connection = con.getJdbcConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement. setString(1, inactivoN);
			String usuarioModificacion = request.getParameter("nombre");
			statement.setString(2, usuarioModificacion);
			statement.setTimestamp(3, timestamp);
			statement.setInt(4, departamento.getIddepartamento());
			rowInactivar = statement.executeUpdate() > 0;
			statement.close();
			con.desconectar();
			return rowInactivar;
		}
		
	// Listar los departamentos
	public List<Departamento> listarDepartamentos() throws SQLException {
		List<Departamento> listaDepartamentos = new ArrayList<>();
		String sql = "SELECT iddepartamento, nombre, observacion FROM sys_departamento WHERE activo='S'";
		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);

		while (resulSet.next()) {
			Integer iddepartamento = resulSet.getInt("iddepartamento");
			String nombre = resulSet.getString("nombre");
			String observacion = resulSet.getString("observacion");
			Departamento departamento = new Departamento(iddepartamento, nombre, observacion);
			listaDepartamentos.add(departamento);
		}
		con.desconectar();
		return listaDepartamentos;
	}

}
