package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "listServlet", urlPatterns = {"/utilisateurs","/users"})
public class listeUtilisateursServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		List<utilisateur> utilisateurs = (List<utilisateur>) session.getAttribute("utilisateurs");
		req.getRequestDispatcher("View/listeUtilisateurs.jsp").forward(req, resp);
	}
}
