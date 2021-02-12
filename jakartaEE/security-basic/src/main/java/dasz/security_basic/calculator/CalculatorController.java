package dasz.security_basic.calculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double first = Double.parseDouble(request.getParameter("first"));
        double second = Double.parseDouble(request.getParameter("second"));
        String operator = request.getParameter("operator");
        Result result = Calculator.calculate(first, second, operator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }

}