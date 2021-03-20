package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Solucion_7", urlPatterns = {"/Solucion_7"})
public class Solucion_7 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String num = request.getParameter("numero");
        int numero = Integer.parseInt(num);
        int contador = 1;
        int matriz[][] = new int[numero+1][numero+1];
        
        for (int a = 1; a <= (numero / 2); a++) {
            for(int i = a; i <= (numero - a); i++){
                matriz [a][i] = contador;
                contador++;
            }
            for(int i = a; i <= (numero - a); i++){
                matriz [i][(numero - a)+1] = contador;
                contador++;
            }
            for (int i = (numero - a) + 1; i >= (a + 1); i--) {
                matriz[(numero - a) + 1][i] = contador;
                contador++;
            }
            for (int i = (numero - a) + 1; i >= (a + 1); i--) {
                matriz[i][a] = contador;
                contador++;
            }
        }
        
        if (numero % 2 == 1) {
            matriz[numero / 2 + 1][numero / 2 + 1] = contador;
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Solucion Ejercicio 7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>La Matriz Caracol</h1>");
            out.println("<table align='center' border='2' cellspacing='0' cellpadding='2'>");
            for (int i = 1; i <= numero; i++) {
                out.println("<tr>");
                for (int j = 1; j <= numero; j++) {
                    out.print("<td>    " + matriz[i][j] + "    </td>");
                }
                out.println("</tr> ");
            }
            out.println("</table>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Ejercicio_7'\">Atras</button>");
            out.println("<br><br>");
            out.println("<button onclick=\"location.href='Main'\">Menu Principal</button>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
