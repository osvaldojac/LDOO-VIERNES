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
public abstract class UserAbstract {
    protected String nombreusu;
    protected String email;
    protected String password;
    protected String cumple;
    protected String tipousu;
    protected int idusu;
    
    public UserAbstract(){
    }
    
    public UserAbstract (String nombreusu, String email, String password, String cumple, int idusu){
        setNombreUsu(nombreusu);
        setEmail(email);
        setPassword(password);
        setCumple(cumple);
        setIdUsu(idusu);
    }

    public String getNombreUsu() {
        return nombreusu;
    }

    public void setNombreUsu(String nombreusu) {
        this.nombreusu = nombreusu;
    }

     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public int getIdUsu() {
        return idusu;
    }

    public void setIdUsu(int idusu) {
        this.idusu = idusu;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public String getTipoUsu() {
        return tipousu;
    }

    public abstract void setTipoUsu(String tipousu);
}
