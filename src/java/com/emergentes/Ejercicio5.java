
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio5", urlPatterns = {"/Ejercicio5"})
public class Ejercicio5 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicio5 </h1>");
            out.println("<h2>Matriz Caracol</h2>");
            out.println("<form action='' method='post' >");
            out.println("Introducir numero");
            out.println("<input type='text' name='numero' required>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
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
        int dim = Integer.parseInt(request.getParameter("numero"));
        int Mat2[][] = new int[dim][dim]; 
        int f=0;
        int dim2=dim-1;
        int aux=1;
        
        
        
        
           try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicio5 </h1>");
            out.println("<h3>llenando matriz</h3>");
            
          for(int i=0 ; i <= Mat2.length ; i++){
              //llenamos la fila superior
            for(int c = f ; c <= dim2  ; c++){
                    Mat2[f][c] = aux;
                    aux++;
                    
                }
             //llenamos la columna extremo derecho 
            for(int c = f +1 ; c <= dim2  ; c++){
                    Mat2[c][dim2] = aux;
                    aux++;
                }
             //llenamos la fila inferior de derecha a izquierda
            for(int c = dim2-1 ; c >= f  ; c--){
                    Mat2[dim2][c] = aux;
                    aux++;
                }
             //llenamos la columna del extremo izquierdo de abajo hacia arriba
            for(int c = dim2-1 ; c >= f +1 ; c--){
                    Mat2[c][f] = aux;
                    aux++;
                }
            f++; 
            dim2--;
            }//fin del proceso
          
          out.println("<h3>Imprimiendo matriz</h3>");
          out.println("<table border >");
           for(int i=0 ; i < Mat2.length ;i++){
                for(int c=0 ; c <Mat2.length ; c++){
                   
                        out.println("<td>"+Mat2[i][c]+"</td>");
                    }
                out.println("<tr></tr>");
           }
        
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

}
