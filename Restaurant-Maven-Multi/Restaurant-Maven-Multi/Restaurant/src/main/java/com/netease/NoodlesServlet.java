package com.netease;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netease.Kitchen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NoodlesServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(NoodlesServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String vegetable = request.getParameter("vegetable");
        if (vegetable==null){
            logger.error(vegetable);
            //vegetable = "Tomato";

        }else {
            logger.error(vegetable);
        }
        writer.println("<html><body>");
        writer.println("<h1> Noodles with " + vegetable + "</h1>");
        writer.println("</body></html>");
    }
}
