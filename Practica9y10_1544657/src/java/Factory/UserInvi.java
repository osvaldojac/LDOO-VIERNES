/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 *
 */
public class UserInvi extends UserAbstract{
    private String nombrecomp;
    private String fecharegistro;
    
    public UserInvi(){
        
    }
    
    public UserInvi(String nombreusu, String email, String password, String cumple, int idusu, String nombrecomp, String fecharegistro){
        setNombreUsu(nombreusu);
        setEmail(email);
        setPassword(password);
        setCumple(cumple);
        setIdUsu(idusu);
        setNombreComp(nombrecomp);
        setFechaRegistro(fecharegistro);
        setTipoUsu("invi");
    }

    public String getNombreComp() {
        return nombrecomp;
    }

    public void setNombreComp(String nombrecomp) {
        this.nombrecomp = nombrecomp;
    }

    public String getFechaRegistro() {
        return fecharegistro;
    }

    public void setFechaRegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    
    @Override
    public void setTipoUsu(String tipousu){
        this.tipousu = tipousu;
    }
}
