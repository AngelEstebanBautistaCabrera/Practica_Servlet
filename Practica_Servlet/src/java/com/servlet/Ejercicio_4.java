package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_4", urlPatterns = {"/Ejercicio_4"})
public class Ejercicio_4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>Introduzca valores de Bolivianos y Dolares para Convertir</h1>");
            out.println("<form action='Ejercicio_4' method='post' align='center'>");
            out.println("<label>Monto en Bolivianos</label>");
            out.println("<input type='number' name='bolivianos' value='0'>");
            out.println("<br><br>");
            out.println("<label>Monto en Dolares</label>");
            out.println("<input type='number' name='dolares' value='0'>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Procesar' align='center'>");
            out.println("</form>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String bolivianos=request.getParameter("bolivianos");
        int boliviano = Integer.parseInt(bolivianos);
        String dolares=request.getParameter("dolares");
        int dolar = Integer.parseInt(dolares);
        double taza1 = 6.91 , taza2 = 0.144;
        double cambio1 = boliviano * taza2;
        double cambio2 = dolar * taza1;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Solucion Ejercicio 4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>Sus Valores Convertidos en Bolivianos y Dolares</h1>");
            out.println("<p align='center'>Su Monto convertido de Bolivianos a Dolares es: "+cambio1+"</p>");
            out.println("<p align='center'>Su Monto convertido de Dolares a Bolivianos es: "+cambio2+"</p>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }    
    }

}
