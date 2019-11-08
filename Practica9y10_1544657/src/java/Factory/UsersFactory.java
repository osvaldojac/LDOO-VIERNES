/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.HashMap;

/**
 *
 *
 */
public class UsersFactory {
    private static UsersFactory factory;
    private HashMap<String, UserAbstract> userHashMap = new HashMap();
    
    private UsersFactory(){
    }
    
    public static UsersFactory getFactory(){
        if (factory==null){
            factory = new UsersFactory();
        }
        return factory;
    }
    
    public void agregarUsu(String type, String nombreusu, String email, String password, String cumple, int idusu, int numemple, String nombrecomp, String tiposuscrip, String domicilio, String fecharegistro){
        userHashMap.put(nombreusu, nuevoUsu(type, nombreusu, email, password, cumple, idusu, numemple, nombrecomp, tiposuscrip, domicilio, fecharegistro));
    }
    
    public UserAbstract quitarUsu(String nombreusu){
        return userHashMap.get(nombreusu);
    }
    
        public static UserAbstract nuevoUsu(String type, String nombreusu, String email, String password, String cumple, int idusu, int numemple, String nombrecomp, String tiposuscrip, String domicilio, String fecharegistro){
        if(type.equals("admi")){
            return new UserAdmi(nombreusu, email, password, cumple, idusu, numemple);
        }else if (type.equals("normie")){
            return new UserNormie(nombreusu, email, password, cumple, idusu, nombrecomp, tiposuscrip, domicilio);
        }
        return new UserInvi(nombreusu, email, password, cumple, idusu, nombrecomp, fecharegistro);
    } 
    
        public UserAbstract obtenerUsu (String nombreusu){
            return userHashMap.get(nombreusu);
        }
}

