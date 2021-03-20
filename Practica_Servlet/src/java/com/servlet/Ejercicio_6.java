package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_6", urlPatterns = {"/Ejercicio_6"})
public class Ejercicio_6 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>JUEGO DE LOS DADOS</h1>");
            out.println("<form align='center'>");
            out.println("<p>Si la Sumatoria de los Dados es 7 u 11 tu pierdes</p>");
            out.println("<a href='Solucion_6' align='center'>Haga Click aqui para jugar</a>");
            out.println("</form>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\" align='right'>Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
