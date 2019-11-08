package Clases;

public class Empleado {
    private String nombre = null;
    private String sexo = null;
    private String fechaNacim = null;
    private String email = null;
    private String password = null;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
       public String getSexo(){
        return sexo;
    }
    
    public void setFechaNacim(String fechaNacim){
        this.fechaNacim = fechaNacim;
    }
    
    public String getFechaNacim(){
        return fechaNacim;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
}
