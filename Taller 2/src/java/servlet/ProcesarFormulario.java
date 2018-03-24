package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Usuario
 */
@WebServlet(name = "Procesar Formulario", urlPatterns = {"/Login"})
public class ProcesarFormulario extends HttpServlet{
    
     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,IOException{
           try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            String nombre = req.getParameter("nombre");
            out.println("Bienvenido,  " + nombre);
            out.println("</body>");
            out.println("</html>");
           }
     }
}
