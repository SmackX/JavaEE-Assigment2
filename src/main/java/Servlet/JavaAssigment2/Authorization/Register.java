package Servlet.JavaAssigment2.Authorization;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Register", value = "/Register")

public class Register extends HttpServlet {
    private String surname;
    private String name;
    private String password;

    public void init() {
        surname = "Hello World!";
        name = "Hello World!";
        password = "Hello World!";
    }
    public void DoPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

        doGet(request,response);
        surname = request.getParameter("surname");
        name = request.getParameter("name");
        password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + surname + "</h1>");
        out.println("<h1>" + name + "</h1>");
        out.println("<h1>" + password + "</h1>");
        out.println("</body></html>");
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");


    }

}