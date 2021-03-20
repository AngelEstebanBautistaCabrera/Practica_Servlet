package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_5", urlPatterns = {"/Ejercicio_5"})
public class Ejercicio_5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>CALCULADORA</h1>");
            out.println("<form action='Solucion_5' method='post'>");
            out.println("<label>Introduzca el Primer Número: </label>");
            out.println("<input type='number' name='numero1' value='0'>");           
            out.println("<br>");
            out.println("<label>Introduzca el Segundo Número: </label>");
            out.println("<input type='number' name='numero2' value='0'>");           
            out.println("<br>");
            out.println("<label>Seleccione Tipo de Operación: ");
            out.println("<select name='operacion' id='op'>");
    	    out.println("<option value='suma'>Suma</option>");
    	    out.println("<option value='resta'>Resta</option>");
    	    out.println("<option value='producto'>Producto</option>");
    	    out.println("<option value='division'>División</option>");
    	    out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
