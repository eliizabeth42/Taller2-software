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
@WebServlet(name = "ProcesarFormulario", urlPatterns = {"/ProcesarFormulario"})
    public class ProcesarFormulario extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,IOException{
        resp.setContentType("text/html;charset=UTF-8");
           try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            String nombre = req.getParameter("nombre");
            out.println("<h1>Bienvenido(a) " + req.getParameter("nombre") + "</h1>");
            out.println("</body>");
            out.println("</html>");
           }
     }
}
