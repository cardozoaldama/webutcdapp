package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	// Listar los departamentos
	public List<Departamento> listarDepartamentos() throws SQLException {

		List<Departamento> listaArticulos = new ArrayList<>();
		String sql = "SELECT iddepartamento, nombre, observacion FROM sys_departamento";
		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);

		while (resulSet.next()) {
			Integer iddepartamento = resulSet.getInt("iddepartamento");
			String nombre = resulSet.getString("nombre");
			String observacion = resulSet.getString("observacion");
			Departamento departamento = new Departamento(iddepartamento, nombre, observacion);
			listaArticulos.add(departamento);
		}
		con.desconectar();
		return listaArticulos;
	}

}
