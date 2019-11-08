

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="src/java/estiloCss/estilo.css" rel="stylesheet"> 
            
    </head> 
    <body background = Picturs/bikes.jpg> 
        <form action="EmpleadoController" method="POST" >   
            <table bgcolor="FFDEAD" style="color:chocolate"> 
           <tr> 
                <td>Nombre:</td>
                <td><input type="text" name="txtNombre" value="" /></td>
           </tr>    
           <tr>
                <td>Sexo:</td> 
                <td>Masculino<input type="radio" name="Sexo" value="Masculino" />
                    Femenino <input type="radio" name="Sexo" value="Femenino" />  </td>
           </tr>
           <tr>
               <td>Fecha Nacimiento</td> 
               <td><input type="date" name="txtFechaNacim" value="" /></td>
           </tr>
           <tr>
               <td>Email</td>
               <td><input type="email" name="txtEmail" value="" /> </td>
           </tr>
           <tr>
               <td>Password</td>
               <td><input type="password" name="txtPassword" value="" /></td>
           </tr>    
           <tr>
               <td><input type="submit" value="ACEPTAR" name="btnAceptar" /></td> 
           </tr>
           </table> 
        </form>
    </body>
</html>
