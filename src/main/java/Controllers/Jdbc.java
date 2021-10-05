package Controllers;

import Models.TestsJdbc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Jdbc
 */
@WebServlet("/jdbc")
public class Jdbc extends HttpServlet {

    private static final String SERVER="localhost", BD="webscope",
            LOGIN="orm", PASSWORD="orm", VUES="/Views/Jdbc/";

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        // On devrait récupérer l'action requise par l'utilisateur
        String action = request.getParameter("action");
        // Notre objet modèle: accès à MySQL
        TestsJdbc jdbc;
        // La vue par défaut
        String maVue = VUES + "index.jsp";

        try {
            jdbc = new TestsJdbc();

            if (action == null) {
                // Rien à faire
            } else if (action.equals("connexion")) {
                // Action + vue test de connexion
                jdbc.connect(SERVER, BD, LOGIN, PASSWORD);
                maVue = VUES + "connexion.jsp";
            } else if (action.equals("requeteA")) {
                // Etc...
            }
        } catch (Exception e) {
            maVue = VUES + "exception.jsp";
            request.setAttribute("message", e.getMessage());
        }

        // On transmet à la vue
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
        dispatcher.forward(request, response);
    }
}