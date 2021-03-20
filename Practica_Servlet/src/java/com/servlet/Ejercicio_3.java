package com.servlet;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_3", urlPatterns = {"/Ejercicio_3"})
public class Ejercicio_3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='1' align='center' cellspacing='0' cellpadding='4'>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<h1 align='center'>CALCULADORA DE EDAD</h1>");
            out.println("<form action='Ejercicio_3' method='post' align='center'>");
            out.println("<label>Ingrese su Año de Nacimiento</label>");
            out.println("<br><br>");
            out.println("<input type='number' name='fecha'>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            Calendar fechaActual = new GregorianCalendar();
            int fechaActual1 = fechaActual.get(Calendar.YEAR);
            
            String fecha=request.getParameter("fecha");
            int fechas = Integer.parseInt(fecha);
            int edad = Math.abs(fechas-fechaActual1);
            
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Solucion Ejercicio 3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>Tu Edad</h1>");
            out.println("<p align='center'>Tu edad es: " + edad + "</p>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }     
    }
}
