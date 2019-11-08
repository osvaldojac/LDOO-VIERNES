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
public class UserAdmi extends UserAbstract{
    private int numemple;
    
    public UserAdmi(){
        
    }
    
    public UserAdmi (String nombreusu, String email, String password, String cumple, int idusu, int numemple){
        setNombreUsu(nombreusu);
        setEmail(email);
        setPassword(password);
        setCumple(cumple);
        setIdUsu(idusu);
        setNumEmple(numemple);
        setTipoUsu("admi");
    }

    public int getNumEmple() {
        return numemple;
    }

    public void setNumEmple(int numemple) {
        this.numemple = numemple;
    }
    
    @Override
    public void setTipoUsu(String tipousu){
        this.tipousu = tipousu;
    }
}

