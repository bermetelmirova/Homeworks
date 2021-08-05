package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
@WebServlet("/time")

public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date  = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("'Time:' hh:mm:ss ', Date:' yyyy.MM.dd");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<h1>" + dateFormat.format(date) + "</h1>");
    }
}
