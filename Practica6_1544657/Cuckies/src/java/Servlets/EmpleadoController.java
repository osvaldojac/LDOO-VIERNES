/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
@WebServlet(name = "EmpleadoController", urlPatterns = {"/EmpleadoController"})
public class EmpleadoController extends HttpServlet {

    Empleado empleado = new Empleado();

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
            Cookie cookie[] = new Cookie[6];
            for(int i = 0; i<= 6; i++) {
            
            cookie[i]= new Cookie("", "");   
            response.addCookie(cookie[i]);
            }
                        
           // session.setAttribute("usuario", empleado);
            request.getRequestDispatcher("index.jsp").forward(request, response);

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
        //   processRequest(request, response);
        // Session sesssion = new Session() {};  
        /* TODO output your page here. You may use following sample code. */
        empleado.setNombre(request.getParameter("txtNombre"));
        empleado.setSexo(request.getParameter("Sexo"));
        empleado.setFechaNacim(request.getParameter("txtFechaNacim"));
        empleado.setEmail(request.getParameter("txtEmail"));
        empleado.setPassword(request.getParameter("txtPassword"));
        String user = "Javier";
        String password = "12345";
        if (user.equals(empleado.getNombre()) && password.equals(empleado.getPassword())) {
         
            //////////////////
            //HttpSession session = request.getSession();
            //String cookies[]= new String[6];
            
            Cookie cookie[] = new Cookie[6];
            cookie[1]= new Cookie("nombre", empleado.getNombre());   
            response.addCookie(cookie[1]);
            cookie[2]= new Cookie("sexo", empleado.getSexo());   
            response.addCookie(cookie[2]);
            cookie[3]= new Cookie("date", empleado.getFechaNacim());   
            response.addCookie(cookie[3]);
            cookie[4]= new Cookie("email", empleado.getEmail());   
            response.addCookie(cookie[4]);
            cookie[5] = new Cookie("password", empleado.getPassword());   
            response.addCookie(cookie[5]); 
                        
           // session.setAttribute("usuario", empleado);
            request.getRequestDispatcher("Session").forward(request, response);

        } else {
            request.getRequestDispatcher("UsuarioDenegado.jsp").forward(request, response);
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
