/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Factory.UsersFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * 
 */
public class Consulting extends Conection{
    public boolean autenticacion (String nombreusu, String password){
        UsersFactory factori = UsersFactory.getFactory();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = null;
            if (factori.obtenerUsu(nombreusu).getTipoUsu().equals("admi")) {
                consulta = "select * from administradores where user = ? and password = ?";
            }
            else if (factori.obtenerUsu(nombreusu).getTipoUsu().equals("normie")) {
                consulta = "select * from normales where user = ? and password = ?";
            }
            else if (factori.obtenerUsu(nombreusu).getTipoUsu().equals("invi")) {
                consulta = "select * from invitados where user = ? and password = ?";
            }
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, nombreusu);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("error" + e);
        }finally{
            try {
                if (getConection() != null) {
                    getConection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
        }
        return false;
    }
    
    
    public boolean registrar(String type, String nombreusu, String email, String password, String cumple, int idusu, int numemple, String nombrecomp, String tiposuscrip, String domicilio, String fecharegistro) {

        PreparedStatement pst = null;
        try {
        if(type.equals("admi")){
            String consulta = "insert into administradores (type, nombreusu, email, password, cumple, idusu, numemple) values(?,?,?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, nombreusu);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.setString(4, cumple);
            pst.setString(5, type);
            pst.setInt(6, idusu);
            pst.setInt(7, numemple);
        }else if(type.equals("normie")){
            String consulta = "insert into normales (type, nombreusu, email, password, cumple, idusu, nombrecomp, tiposuscrip, domicilio) values(?,?,?,?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, nombreusu);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.setString(4, cumple);
            pst.setString(5, type);
            pst.setInt(6, idusu);
            pst.setString(7, nombrecomp);
            pst.setString(8, tiposuscrip);
            pst.setString(9, domicilio);
        }else if(type.equals("invi")){
            String consulta = "insert into invitados (type, nombreusu, email, password, cumple, idusu, nombrecomp, fecharegistro) values(?,?,?,?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, nombreusu);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.setString(4, cumple);
            pst.setString(5, type);
            pst.setInt(6, idusu);
            pst.setString(7, nombrecomp);
            pst.setString(8, fecharegistro);
        }

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception ex) {
            System.err.println("Error" + ex);
        } finally {
            try {
                if (getConection() != null) {
                    getConection().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }

        return false;
    }
    

}
