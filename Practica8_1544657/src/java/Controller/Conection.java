/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 
 */
public class Conection {
    private String username = "root";
    private String password = "root";
    private String host = "localhost";
    private String port = "3306";
    private String database = "login_ldoo";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+host+":"+port+"/"+database;
    private Connection con;
    
    public Conection(){
        try{
            Class.forName(classname);
            con = DriverManager.getConnection(url, username, password);
        }catch (ClassNotFoundException e){
            System.err.println("error" + " " + e);
        }catch (SQLException e){
            System.err.println("error" + " " + e);
        }
    }
    
    public Connection getConection(){
       return con;
    }
}
