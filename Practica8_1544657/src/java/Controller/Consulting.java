/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * 
 */
public class Consulting extends Conection{
    
    public boolean autenticacion(String usuario, String contraseña){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "select * from users where usuario = ? and password = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if (rs.absolute(1)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("error" + e);
        }finally{
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }
        return false;
    }
    
    public boolean registro(String usuario, String password){
        PreparedStatement pst = null;
        
        try {
            String consulta = "insert into users (usuario, password) values (?, ?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            
            if (pst.executeUpdate() == 1) {
                return true;
            }
            
        } catch (Exception ex) {
            System.err.println("error" + " "+ ex);
        }finally{
            try {
                if (getConection() != null) getConection().close(); 
                if (pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("error" + " " + e);
            }
        }
        return false;
    }
}