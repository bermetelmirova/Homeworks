package org.example.taskWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/name")
public class nameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String result = "Hello, " + req.getParameter("name");
        req.setAttribute("name", result);
        req.getRequestDispatcher("name.jsp").forward(req, resp);
    }
}
