/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ACWIN7C140
 */
@WebFilter(filterName = "FiltroAutenticacion", urlPatterns =  {"/index.html","/ProcesarFormulario"})
public class FiltroAutenticacion implements Filter {
    
 
    
    public FiltroAutenticacion() {
    }    
   

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
            HttpServletResponse resp = (HttpServletResponse)response;
            HttpServletRequest req = (HttpServletRequest)request;
         if (req.getParameter("name").equals(req.getParameter("password"))) {
                //((HttpServletResponse)response).sendRedirect("login.html");
                chain.doFilter(req, resp);
                
        }else{
             //chain.doFilter(request, response);
                ((HttpServletResponse)response).sendRedirect("Error.html");
            }            
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {        
    }

    @Override
    public void init(FilterConfig filterConfig)throws ServletException{        
      
    }  
}
