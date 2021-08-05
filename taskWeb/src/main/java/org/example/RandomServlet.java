package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/randomsum")
public class RandomServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        PrintWriter printWriter = resp.getWriter();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        printWriter.print("<h1>" + a + "+" + b + "=" + (a + b) + "</h1>");
    }
}
