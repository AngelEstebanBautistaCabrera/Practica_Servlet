package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Solucion_5", urlPatterns = {"/Solucion_5"})
public class Solucion_5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String num1 = request.getParameter("numero1");
        String num2 = request.getParameter("numero2");
        String op=request.getParameter("operacion");
        
        int numero_1=Integer.parseInt(num1);
        int numero_2=Integer.parseInt(num2);
        double resultado;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Salida5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>RESULTADO DE LA OPERACIÓN</h1>");
            switch(op){
                case "suma":
                    resultado = numero_1 + numero_2;
                    out.println("<p>El resultado de la suma es: "+resultado+"</p>");
                    break;
                case "resta":
                    resultado = numero_1 - numero_2;
                    out.println("<p>El resultado de la suma es: "+resultado+"</p>");
                    break;
                case "producto":
                    resultado = numero_1 * numero_2;
                    out.println("<p>El resultado de la suma es: "+resultado+"</p>");
                    break;
                case "division":
                    resultado = numero_1 / numero_2;
                    out.println("<p>El resultado de la suma es: "+resultado+"</p>");
                    break;
            }
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Ejercicio_5'\">Atras</button>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
