package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/simplenumber")
public class NumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> numbers = new ArrayList<>();
        int count = 0;
        for (int i = 2; numbers.size() != 100; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                if ((numbers.size() +1) % 8 == 0)
                    numbers.add(i + " </tr><tr>");
                else
                    numbers.add(i + "");
            }
        }
        req.setAttribute("numbers", numbers);
        req.getRequestDispatcher("/numbers.jsp").forward(req, resp);
    }
}
