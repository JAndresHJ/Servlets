/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nuevo
 */
@WebServlet(name = "Servlet", urlPatterns = {"/usuario"}) //El valor de action debe coincidir con urlPatterns
public class Servlet extends HttpServlet {             //La anotación @WebServlet sustituye el archivo .xml


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String contraseña = request.getParameter("contra");
        String sexo = request.getParameter("genero");
        String [] peliculas = request.getParameterValues("peliculas");
                 //GET Envía datos por medio de la URL
                 //JSP Te evita escribir código HTML de esta manera
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HOLA SERVLET</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hola "+ usuario +"</h1>");
        out.println("<h1>La contraseña es: "+ contraseña +"</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
