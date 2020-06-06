
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio1", urlPatterns = {"/Ejercicio1"})
public class Ejercicio1 extends HttpServlet {
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicio1:desplegar nombre, correo, telefono </h1>");
            out.println("<h3>adicionar en la URL -> ?nombre=# &correo=# &telefono=# </h3>");
            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String telefono = request.getParameter("telefono");
            if (nombre != null || correo != null || telefono != null){
                out.println("nombre es:<strong>" + nombre + "</strong><br>");
                out.println("correo es:<strong>" + correo + "</strong><br>");
                out.println("telefono es:<strong>" + telefono + "</strong><br>");
            }else {
                out.println("Ponga los parametros en la URL");
            }
            out.println("</body>");
            out.println("</html>");
        }finally {
            out.close();
        }
      
    }
}
