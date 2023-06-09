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

// TODO: Agregar lo mismo que hay en ServletArticulo.java
@WebServlet("/queja")
public class ServletQueja extends HttpServlet {
	private static final long serialVersionUID = 1L;
	QuejaDAO quejaDAO;

	@Override
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

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello Servlet into ServletQueja.java!");
		String action = request.getParameter("action");
		System.out.println(action);
		try {
			switch (action) {
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
				mostrar(request, response);
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
			case "mostrarQuejas":
				mostrarQuejas(request, response);
				break;
			case "registrarQuejas":
				registrarQuejas(request, response);
				break;
			case "comboDepartamento":
				comboDepartamento(request, response);
				break;
			default:
				break;
			}
		} catch (SQLException e) {
			e.getStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hola ServletQueja.java ...");
		doGet(request, response);
	}

	private void index(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
		dispatcher.forward(request, response);
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		Queja queja = new Queja(0, request.getParameter("nombre"), request.getParameter("apellido"),
				request.getParameter("telefono"), request.getParameter("departamento"), request.getParameter("ciudad"),
				request.getParameter("barrio"), request.getParameter("direccion"), request.getParameter("correo"),
				request.getParameter("referencia"));
		quejaDAO.insertar(queja, request);
		request.setAttribute("mensaje", "Los datos se insertaron correctamente en el ServletQueja.java");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/quejas.jsp");
		dispatcher.forward(request, response);
	}

	private void nuevo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/register.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrar.jsp");
		List<Queja> listaQuejas = quejaDAO.listarQuejas();
		request.setAttribute("lista", listaQuejas);
		dispatcher.forward(request, response);
	}

	private void showEditar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		Queja queja = quejaDAO.obtenerPorId(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("queja", queja);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/editarQuejas.jsp");
		dispatcher.forward(request, response);
	}

	private void editar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		Queja queja = new Queja(Integer.parseInt(request.getParameter("id")), request.getParameter("nombre"),
				request.getParameter("apellido"), request.getParameter("telefono"),
				request.getParameter("departamento"), request.getParameter("ciudad"), request.getParameter("barrio"),
				request.getParameter("direccion"), request.getParameter("correo"), request.getParameter("referencia"));
		quejaDAO.actualizar(queja, request);
		index(request, response);
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		Queja queja = quejaDAO.obtenerPorId(Integer.parseInt(request.getParameter("id")));
		System.out.println("id " + queja);
		quejaDAO.actualizarInactivar(queja, request);
		RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
		dispatcher.forward(request, response);
	}


	private void ejemplo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/example.jsp");
		List<Queja> listaQuejas = quejaDAO.listarQuejas();
		request.setAttribute("lista", listaQuejas);
		dispatcher.forward(request, response);
	}

	private void mostrarQuejas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrarQuejas.jsp");
		List<Queja> listaQuejas = quejaDAO.listarQuejas();
		request.setAttribute("lista", listaQuejas);
		dispatcher.forward(request, response);
		System.out.println(listaQuejas);
	}

	// Se ha cambiado totalmente del original ServletArticulo.java
	private void registrarQuejas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/quejas.jsp");
		dispatcher.forward(request, response);
	}

	private void comboDepartamento(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

}
