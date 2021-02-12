package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.util.Enumeration;

@WebServlet("/browser")
public class BrowserCheckController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        printUserAgent(request);
        System.out.println("-----");
        printAllHeaders(request);
    }

    private void printUserAgent(HttpServletRequest request){
        String userAgent = request.getHeader("user-agent");
        System.out.println("Przeglądarka klienta: "+ userAgent);
    }

    private void printAllHeaders(HttpServletRequest request){
        System.out.println("Wszystkie nagłówki:");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String nextHeaderName = headerNames.nextElement();
            System.out.println(nextHeaderName+" "+request.getHeader(nextHeaderName));
        }
    }

}