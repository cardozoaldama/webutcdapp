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
}
