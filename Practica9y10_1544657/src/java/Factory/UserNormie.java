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
public class UserNormie extends UserAbstract{
    private String nombrecomp;
    private String tiposuscrip;
    private String domicilio;
    
    public UserNormie(){
        
    }
    
    public UserNormie(String nombreusu, String email, String password, String cumple, int idusu, String nombrecomp, String tiposuscrip, String domicilio){
        setNombreUsu(nombreusu);
        setEmail(email);
        setPassword(password);
        setCumple(cumple);
        setIdUsu(idusu);
        setNombreComp(nombrecomp);
        setTipoSuscrip(tiposuscrip);
        setDomicilio(domicilio);
        setTipoUsu("normie");
    }
    
    public String getNombreComp() {
        return nombrecomp;
    }

    public void setNombreComp(String nombrecomp) {
        this.nombrecomp = nombrecomp;
    }
    
    public String getTipoSuscrip() {
        return tiposuscrip;
    }


    public void setTipoSuscrip(String tiposuscrip) {
        this.tiposuscrip = tiposuscrip;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
    @Override
    public void setTipoUsu(String tipousu){
        this.tipousu = tipousu;
    }
}

