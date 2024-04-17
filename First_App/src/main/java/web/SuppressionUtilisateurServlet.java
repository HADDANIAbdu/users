package web;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "deleteServlet", urlPatterns = {"/deleteUser", "/supprimerUtilisateur"})
public class SuppressionUtilisateurServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String userid = req.getParameter("userId");
		List<utilisateur> utilisateurs = (List<utilisateur>) session.getAttribute("utilisateurs");
		if(userid != null) {
			userid = userid.trim();
			int userNum = Integer.parseInt(userid);
	        utilisateur ut = null;
			for (utilisateur utilisateur : utilisateurs) {
				if(userNum == utilisateur.getnum()){
					System.out.println(utilisateur.getNom());
					 ut = utilisateur;
				}
			}
			if(ut != null) {
				utilisateurs.remove(ut);
			}
		} 	
		req.getRequestDispatcher("View/liste_MisaJour.jsp").forward(req, resp);
	}
}
