package dasz.el_jstl2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("")
public class PersonController extends HttpServlet {
    @Override
    public void init() {
        getServletContext().setAttribute("people", new ArrayList<Person>());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Gender gender = Gender.valueOf(request.getParameter("gender"));
        int age = Integer.parseInt(request.getParameter("age"));
        Person person = new Person(firstName, lastName, age, gender);
        List<Person> peopleList = (List<Person>) getServletContext().getAttribute("people");
        peopleList.add(person);
        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }
}