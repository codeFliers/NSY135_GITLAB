package Controllers;

import Models.TestsJdbc;
import Models.TestsJpa;

import javax.persistence.EntityManager;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Jpa", value = "/Jpa")
public class Jpa extends HttpServlet {
    private static final String VUES = "/Views/Jpa/";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maVue = "";

        String action = request.getParameter("action");
        TestsJpa testsJpa;

        try {
            testsJpa = new TestsJpa();

            if(action.equals("connexion")) {

                if (TestsJpa.getEntityManager().isOpen()) {
                    maVue = VUES + "connexion.jsp";
                }
            }/*else if() {

            }
             */
        }catch(Exception e) {
            maVue = VUES + "exception.jsp";
            request.setAttribute("message", e.getMessage());
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
