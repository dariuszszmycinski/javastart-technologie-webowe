package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/welcome")
public class WelcomeController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Witajcie!");

    }

}