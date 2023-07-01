package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartamentoDAO;
import entidad.Departamento;
import entidad.Queja;

@WebServlet("/departamento")
public class ServletDepartamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DepartamentoDAO departamentoDAO;

	@Override
	public void init() {
		String jdbcURL = getServletContext().getInitParameter("URL");
		String jdbcUsername = getServletContext().getInitParameter("USUARIO");
		String jdbcPassword = getServletContext().getInitParameter("CLAVE");
		try {
			departamentoDAO = new DepartamentoDAO(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletDepartamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("¡Hola ServletDepartamento.java!");
		String action = request.getParameter("action");
		System.out.println(action);
		try {
			switch (action) {
			case "index":
				index(request, response);
				break;
			case "mostrar":
				mostrar(request, response);
				break;
			case "registrarDepartamentos":
				registrarDepartamentos(request, response);
				break;
			case "register":
				System.out.println("Entrando... Registrando... Departamento...");
				registrar(request, response);
				break;
			case "mostrarDepartamentos":
				System.out.println("Entrando en mostrarDepartamentos en ServletDepartamento.java");
				mostrarDepartamentos(request, response);
				break;
			case "eliminar":
				System.out.println("Eliminar en ServletDepartamento.java");
				eliminar(request, response);
				break;
			case "showedit":
				System.out.println("Editar un elemento en ServletDepartamento.java");
				showEditar(request, response);
				break;
			default:
				break;
			}
		} catch (SQLException e) {
			e.getStackTrace();
		}

	}

	// Muestra la vista de editarDepartamentos.jsp
	private void showEditar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		Departamento departamento = departamentoDAO.obtenerPorId(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("departamento", departamento);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/editarDepartamentos.jsp");
		dispatcher.forward(request, response);
	}

	// Inactiva un elemento del departamento, pero no lo elimina.
	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		Departamento departamento = departamentoDAO.obtenerPorId(Integer.parseInt(request.getParameter("id")));
		System.out.println("id " + departamento);
		departamentoDAO.actualizarInactivar(departamento, request);
		RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
		dispatcher.forward(request, response);
	}

	// Muestra la lista de departamentos dentro de mostrarDepartamentos.jsp.
	private void mostrarDepartamentos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrarDepartamentos.jsp");
		List<Departamento> listaDepartamentos = departamentoDAO.listarDepartamentos();
		request.setAttribute("lista", listaDepartamentos);
		dispatcher.forward(request, response);
		System.out.println(listaDepartamentos);		
	}

	// Literalmente realiza el registro junto a DepartamentoDAO.java
	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		Departamento departamento = new Departamento(0, request.getParameter("nombre"), request.getParameter("observacion"));
		departamentoDAO.insertar(departamento, request);
		request.setAttribute("mensaje", "Los datos se insertaron correctamente en el ServletDepartamento.java");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/insertarDepartamentos.jsp");
		dispatcher.forward(request, response);		
	}

	// Procedimiento que permite visualizar el JSP para insertar un departamento.
	private void registrarDepartamentos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/insertarDepartamentos.jsp");
		dispatcher.forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("¡Hola ServletDepartamento.java!");
		doGet(request, response);
	}

	// El índice principal...
	private void index(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		// mostrar(request, response);
		RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
		dispatcher.forward(request, response);
	}

	// Esto es temporal, pero posiblemente se tenga que borrar. >;3
	private void mostrar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/combo_datos.jsp");
		List<Departamento> listaArticulos = departamentoDAO.listarDepartamentos();
		request.setAttribute("lista", listaArticulos);
		dispatcher.forward(request, response);
	}

}