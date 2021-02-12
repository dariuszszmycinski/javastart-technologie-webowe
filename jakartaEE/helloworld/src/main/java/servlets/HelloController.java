package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello")
public class HelloController extends HttpServlet {
    public HelloController() {
        System.out.println("Konstruktor");
    }

    public void init() throws ServletException{
        System.out.println("Metoda init");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print("Cześć "+firstName+" "+lastName);
    }

    public void destroy(){
        System.out.println("Metoda destroy");
    }

}