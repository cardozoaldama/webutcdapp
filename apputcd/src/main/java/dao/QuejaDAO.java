package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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
	// Contador que ira incrementando el valor del ID el cual genera automaticamente.
	//private static final AtomicLong contadorid = new AtomicLong(104);
	private AtomicInteger contadorid = new AtomicInteger(0);
	private String activoS = "S";
	private String inactivoN = "N";
	// Para obtener fecha-hora actual del sistema operativo.
	Long datetime = System.currentTimeMillis();
	Timestamp timestamp = new Timestamp(datetime);
	
	// PROCEDIMIENTO DE INSERCIÓN	
	public void insertar(Queja queja, HttpServletRequest request) throws SQLException {
		String sql = "INSERT INTO sys_reclamo (id_reclamo, numero_reclamo, nis, telefono, apellido, direccion, referencia, numero_movil, correo, observacion, fecha_hora_recepcion, asignacion_usuario, id_departamento, id_ciudad, id_barrio, id_cuenta) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		
		// CONTADOR PARA INSERTAR EL ID
		int ultimoIdReclamo = obtenerUltimoIdReclamo();
		contadorid.set(ultimoIdReclamo + 1);
		
	}

	public List<Queja> listarQuejas() {
		// TODO Auto-generated method stub
		return null;
	}

	// Este método está relacionado con el contador para insertar el ID.
	private int obtenerUltimoIdReclamo() throws SQLException {
		String sql = "SELECT MAX(id_reclamo) FROM sys_reclamo";
	    try (Statement statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(sql)) {
	        if (resultSet.next()) {
	            return resultSet.getInt(1);
	        }
	    }
	    // Si no hay registros en la tabla, retorna un valor predeterminado
	    return 0;
	}

	public Queja obtenerPorId(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public void actualizar(Queja queja) {
		// TODO Auto-generated method stub
		
	}

	public void actualizarInactivar(Queja queja, HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}
	

}
