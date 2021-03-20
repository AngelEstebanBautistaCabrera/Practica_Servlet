package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Main</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Escoja la opción de la cual desea tener su solución</h1>");
            out.println("<ol>");
            out.println("<li>Usando servlets mostrar la edad de una persona a partir del año de nacimiento.");
            out.println("El formulario debe solicitar nombre y año de nacimiento.</li>");
            out.println("<button onclick=\"location.href='Ejercicio_1'\">Solución</button>");
            out.println("<li>Con servlets crear un programa para leer un número y calcular su factorial.</li>");
            out.println("<button onclick=\"location.href='Ejercicio_2'\">Solución</button>");
            out.println("<li>Utilizando un solo Servlet calcular la edad de una persona a partir de su año de nacimiento "
                    + "doGet(HttpServletRequest request, HttpServletResponse response).</li>");
            out.println("<button onclick=\"location.href='Ejercicio_3'\">Solución</button>");
            out.println("<li>Usando servlet realizar un programa que permita realizar el cambio te Bolivianos a Dólares"
                    + " y viceversa.</li>");
            out.println("<button onclick=\"location.href='Ejercicio_4'\">Solución</button>");
            out.println("<li>Crear un servlet para solicitar dos números y un operador (suma, resta, producto, división"
                    + " en un cuadro desplegable ComboBox y un botón con el texto “Procesar”. "
                    + "Al pulsar el botón debe aparecer el resultado de la operación.</li>");
            out.println("<button onclick=\"location.href='Ejercicio_5'\">Solución</button>");
            out.println("<li>Crear un programa utilizando Servlets para simular el juego con dos dados. "
                    + "(Regla principal si la suma es 7 u 11 gana otro número pierde).</li>");
            out.println("<button onclick=\"location.href='Ejercicio_6'\">Solución</button>");
            out.println("<li>Programar un servlet que solicite un valor y pulsando el botón “Procesar” "
                    + "genere la matriz caracol. Ejemplo 5:</li>");
            out.println("<button onclick=\"location.href='Ejercicio_7'\">Solución</button>");
            out.println("</ol>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
