package Servlet.JavaAssigment2.Authorization;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignIn", value = "/SignIn")

public class SignIn extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello, who are you?!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

//        response.sendRedirect("https://www.google.com");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Registration.jsp");
        dispatcher.forward(request,response);
    }
}
