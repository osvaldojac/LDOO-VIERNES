/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Consulting;
import Factory.UserAdmi;
import Factory.UserInvi;
import Factory.UserNormie;
import Factory.UsersFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 *
 */
@WebServlet(name = "Registro", urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        UsersFactory factori = UsersFactory.getFactory();
        factori.agregarUsu(request.getParameter("nombreusu"), request.getParameter("password"), request.getParameter("cumple"), request.getParameter("email"), request.getParameter("type"), Integer.parseInt(request.getParameter("idusu")), Integer.parseInt(request.getParameter("numemple")), request.getParameter("nombrecomp"), request.getParameter("tiposuscrip"), request.getParameter("domicilio"), request.getParameter("fecharegistro"));

        String nombreusu = factori.obtenerUsu(request.getParameter("nombreusu")).getNombreUsu();
        String password = factori.obtenerUsu(request.getParameter("nombreusu")).getPassword();
        String cumple = factori.obtenerUsu(request.getParameter("nombreusu")).getCumple();
        String email = factori.obtenerUsu(request.getParameter("nombreusu")).getEmail();
        String type = factori.obtenerUsu(request.getParameter("nombreusu")).getTipoUsu();
        int idusu = factori.obtenerUsu(request.getParameter("nombreusu")).getIdUsu();
        int numemp = 0;
        String nombrecomp = null;
        String tiposuscrip = null;
        String domicilio = null;
        String fecharegistro = null;
        
        if (type.equals("admi")){
            numemp = ((UserAdmi)factori.obtenerUsu(request.getParameter("nombreusu"))).getNumEmple();
        }else if (type.equals("normie")) {
            nombrecomp = ((UserNormie)factori.obtenerUsu(request.getParameter("nombreusu"))).getNombreComp();
            tiposuscrip = ((UserNormie)factori.obtenerUsu(request.getParameter("nombreusu"))).getTipoSuscrip();
            domicilio = ((UserNormie)factori.obtenerUsu(request.getParameter("nombreusu"))).getDomicilio();
        }else if (type.equals("invi")) {
            nombrecomp = ((UserInvi)factori.obtenerUsu(request.getParameter("nombreusu"))).getNombreComp();
            fecharegistro = ((UserInvi)factori.obtenerUsu(request.getParameter("nombreusu"))).getFechaRegistro();
        }
        
        Consulting co = new Consulting();
        if(co.registrar(nombreusu, email, password, cumple, type, idusu, numemp, nombrecomp, tiposuscrip, domicilio, fecharegistro)){
            response.sendRedirect("menu.jsp");
        }else{
            response.sendRedirect("error.jsp");
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
        processRequest(request, response);
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
