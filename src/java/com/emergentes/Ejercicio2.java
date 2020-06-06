
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio2", urlPatterns = {"/Ejercicio2"})
public class Ejercicio2 extends HttpServlet {
       
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicio2 </h1>");
            out.println("<h2>Cambio de Moneda </h2>");
            out.println("<form action='' method='post'>");
            out.println("Cambio");
            out.println("<select  name='selectPro'>");
            out.println("<option value='1'>Bolivianos a $us</option>");
            out.println("<option value='2'>Dolares a Bs</option>");
            out.println("</select>");
            out.println("introducir monto");
            out.println("<input type='text' name='cambio' required>");
            out.println("<input type='submit' value='Enviar'>");
            out.println("<br>");
            out.println("<br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
        }finally {
            out.close();
        }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int cambio1 = Integer.parseInt(request.getParameter("cambio"));
        int select = Integer.parseInt(request.getParameter("selectPro"));
        double cambioX;
        double cambioY;
       
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();    
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cambio De Moneda</h1>");
           // String numCad = select+"";
            DecimalFormat f2 = new DecimalFormat("#.00");
            if (select == 1 ){
                out.println("<h2>Cambio a Dolares</h2><br>");
                cambioY = cambio1 / 6.98;
                out.println(""+ f2.format(cambioY) +"$us");    
            }
            if (select == 2) {
                out.println("<h2>Cambio a Bolivianos</h2><br>");
                cambioX = cambio1 * 6.98;
                out.println(""+ f2.format(cambioX)+"Bs" );
            }
           
            out.println("</body>");
            out.println("</html>");
            
        }finally {
            out.close();
        }
        
    }
}
