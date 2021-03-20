package com.servlet;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Solucion_1", urlPatterns = {"/Solucion_1"})
public class Solucion_1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Calendar fecha_sis = new GregorianCalendar();
        int año_actual = fecha_sis.get(Calendar.YEAR);

        
        String nombre=request.getParameter("nombre");
        String fecha=request.getParameter("fecha");
        int fechas = Integer.parseInt(fecha);
        
        int respuesta = año_actual - fechas;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>datos del usuario</h1>");
            out.println("<p>Nombre: "+nombre+"</p>");
            out.println("<p>Año de Nacimiento: "+fechas+"</p>");
            out.println("<p>Edad:" + respuesta + "</p>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Ejercicio_1'\">Atras</button>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
