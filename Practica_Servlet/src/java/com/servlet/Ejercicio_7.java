package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_7", urlPatterns = {"/Ejercicio_7"})
public class Ejercicio_7 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ingrese un numero para generar la matriz caracol</h1>");
            out.println("<form action='Solucion_7' method='post' align='center'>");
            out.println("<label>Numero: </label>");
            out.println("<input type='text' name='numero'>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\" align='right'>Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
