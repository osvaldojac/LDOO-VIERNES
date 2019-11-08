/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *

 */
@WebServlet(name = "PostGet", urlPatterns = {"/PostGet"})
public class PostGet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PostGet</title>");          
            out.println("<link href=\"src/java/CSS/business-casual.css\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<body background = Picturs/bikes.jpg>");
            out.printf("<form action=\"PostGet\" method=\"POST\">");
            out.printf("<table bgcolor=\"FFDEAD\" style=\"color:chocolate\">");
            out.println("<tr>");
                out.printf("<th><div>Nombre:</div></th>");
                out.printf("<th><input type=\"text\" name=\"txtName\" value=\"\" /></th>");
            out.println("</tr>");
                out.println("<tr>");
                out.printf("<th><div>Apellido Patreno:</div></th>");
                out.printf("<th><input type=\"text\" name=\"txtApPat\" value=\"\" /></th>");
            out.println("</tr>");
            out.println("<tr>");
                out.println("<tr>");
                out.printf("<th><div>Apellido Materno:</div></th>");
                out.printf("<th><input type=\"text\" name=\"txtApMat\" value=\"\" /></th>");
            out.println("</tr>");
            out.println("<tr>");
                out.println("<tr>");
                out.printf("<th><div>Fecha Nacimiento:</div></th>");
                out.printf("<th><input type=\"date\" name=\"txtDate\" value=\"\" /></th>");
            out.println("</tr>");
            out.println("<tr>");
                out.println("<tr>");
                out.printf("<th><div>Correo Electronico:</div></th>");
                out.printf("<th><input type=\"email\" name=\"txtMail\" value=\"\" /></th>");
            out.println("</tr>");
            out.println("<tr>");
                out.println("<tr>");
                out.printf("<th><div>Contraseña:</div></th>");
                out.printf("<th><input type=\"password\" name=\"txtPass\" value=\"\" /></th>");
            out.println("</th>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<th></th>");
            out.println("</tr>");
            out.println("<tr><th></th><th>");
            out.printf("<input type=\"submit\" value=\"entrar\"></th><th></th></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
                  try (PrintWriter out = response.getWriter()) {
        

          
          }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          try (PrintWriter out = response.getWriter()) {
             String nombre = request.getParameter("txtName");
             String apPaterno = request.getParameter("txtApPat"); 
             String apMaterno = request.getParameter("txtApMat"); 
             String date = request.getParameter("txtDate"); 
             String mail = request.getParameter("txtMail"); 
             String pass = request.getParameter("txtPass");  
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PostGet</title>");            
            out.println("</head>");
            out.println("<body background = Picturs/bikes.jpg>");
                out.println("<table bgcolor=\"FFDEAD\" style=\"color:chocolate\">");
                out.println("<tr> <th>"+ nombre +"</th> </tr>"); 
                out.println("<tr> <th>"+ apPaterno +"</th> </tr>"); 
                out.println("<tr> <th>"+ apMaterno +"</th> </tr>"); 
                out.println("<tr> <th>"+ date +"</th> </tr>"); 
                out.println("<tr> <th>"+ mail +"</th> </tr>"); 
                out.println("<tr> <th>"+ pass +"</th> </tr>"); 
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
          
          }
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
