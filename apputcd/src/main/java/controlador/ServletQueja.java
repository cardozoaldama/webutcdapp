package controlador;

// IMPORTS
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.QuejaDAO;
import entidad.Queja;

public class ServletQueja extends HttpServlet {
	private static final long serialVersionUID = 1L;
	QuejaDAO quejaDAO;
	
	public void init() {
		String jbdcURL = getServletContext().getInitParameter("URL");
		String jbdcUsername = getServletContext().getInitParameter("USUARIO");
		String jbdcPassword = getServletContext().getInitParameter("CLAVE");
		
		try {
			quejaDAO = new QuejaDAO(jbdcURL, jbdcUsername, jbdcPassword);
		} catch (Exception e) {
			// TODO: Handle exception
		}
	}
	public ServletQueja() {
		super();
		// TODO: Not Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello Servlet into ServletQueja.java!");
		String action = request.getParameter("action");
		System.out.println(action);
		switch(action) {
		case "index":
			index(request, response);
			break;
		case "nuevo":
			nuevo(request, response);
			break;
		case "register":
			System.out.println("Entrando... Registrando...");
			registrar(request, response);
			break;
		case "mostrar":
			mostrar(request,response);
			break;
		case "showedit":
			showEditar(request, response);
			break;
		case "editar":
			editar(request, response);
			break;
		case "eliminar":
			eliminar(request, response);
			break;
		case "example":
			ejemplo(request, response);
			break;
		case "registrarArticulos":
			registrarArticulos(request, response);
			break;
		case "comboDepartamento":
			comboDepartamento(request, response);
			break;
		default:
			break;
		}
	}
	private void comboDepartamento(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void registrarArticulos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void ejemplo(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void eliminar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void editar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void showEditar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void mostrar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void registrar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void nuevo(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void index(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello doPost from ServletQueja.java");
		String action = request.getParameter("action");
		
		if (action != null && action.equals("ComboCiudad")) {
			try {
				comboCiudad(request, response);
			} catch (SQLException | IOException | ServletException e) {
				e.printStackTrace();
			}
		} else {
			// I don't know, honest...
		}
		doGet(request, response);
	}
	*/
	
}
