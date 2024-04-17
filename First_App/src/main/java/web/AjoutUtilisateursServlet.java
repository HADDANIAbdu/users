package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.env.IModule.IService;

import com.oracle.wls.shaded.org.apache.bcel.generic.RETURN;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "addServlet", urlPatterns = {"/Ajoututilisateur","/addUser"})
public class AjoutUtilisateursServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("View/AjoutUtilisateur.jsp").forward(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        if(nom.equals("")||(prenom.equals(""))||(email.equals(""))||(age.equals(""))) {
        	request.setAttribute("message", "Veuillez remplir tous les champs du formulaire !");
            request.getRequestDispatcher("View/AjoutUtilisateur.jsp").forward(request, response);
        }
        else {
        	utilisateur newUtilisateur = new utilisateur(nom, prenom, email, Integer.parseInt(age));
        	HttpSession session = request.getSession(true);
            List<utilisateur> utilisateurs = (List<utilisateur>) session.getAttribute("utilisateurs");
            if (utilisateurs == null) {
                utilisateurs = new ArrayList<>();
                session.setAttribute("utilisateurs", utilisateurs);
            }
            utilisateurs.add(newUtilisateur);
        	response.sendRedirect("./addUser");
        }
	}
}
