
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio3", urlPatterns = {"/Ejercicio3"})
public class Ejercicio3 extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicio3 </h1>");
            out.println("<h2>Operaciones Matematicas</h2>");
            out.println("<form action='' method='post'>");
            out.println("Introducir valor1");
            out.println("<input type='text' name='numero1' required>");
            out.println("introducir valor2");
            out.println("<input type='text' name='numero2' required>");
            out.println("<select name='operador'>");
            out.println("<option value='1'>Suma</option>");
            out.println("<option value='2'>Resta</option>");
            out.println("<option value='3'>Producto</option>");
            out.println("<option value='4'>Division</option>");
            out.println("</select><br><br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        int operador = Integer.parseInt(request.getParameter("operador"));
        int Axu;
        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado</h1>");
            
           if (operador == 1){
               Axu = numero1 + numero2;
               out.println("suma :"+Axu);
           }
           if (operador == 2){
               Axu = numero1 - numero2;
               out.println("resta :"+Axu);
           }
           if (operador == 3){
               Axu = numero1 * numero2;
               out.println("producto :"+Axu);
           }
           if (operador == 4){
               Axu = numero1 / numero2;
               out.println("division :"+Axu);
           } 
            out.println("");
            out.println("</body>");
            out.println("</html>");
            
        }finally {
            out.close();
        }
        
    }

}
