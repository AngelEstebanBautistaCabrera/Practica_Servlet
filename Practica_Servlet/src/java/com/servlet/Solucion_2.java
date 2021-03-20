package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Solucion_2", urlPatterns = {"/Solucion_2"})
public class Solucion_2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String num = request.getParameter("numero");
        int numero = Integer.parseInt(num);
        int resultado = 1;
        
        for(int i = 1; i <= numero; i++){
            resultado = resultado * i;
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Solucion_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El Factorial es: </h1>");
            out.println("<p>"+ resultado +"</p>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Ejercicio_2'\">Atras</button>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
