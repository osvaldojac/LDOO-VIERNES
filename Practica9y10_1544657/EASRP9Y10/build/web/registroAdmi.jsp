<%-- 
    Document   : registroAdmi
    Created on : 12/04/2019, 08:24:48 PM
    Author     : TOÑO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
    </head>
    <body>
        <h1>Registrate Admi</h1>
            <form action="" method="post">
                <input type="text" name="user" placeholder="Nombre de usuario"/><br/>
                <input type="text" name="correo" placeholder="Correo Electronico"/><br/>
                <input type="password" name="contra" placeholder="Contraseña"/><br/>
                <input type="text" name="cumple" placeholder="Fecha de nacimiento"/><br/>
                <input type="text" name="idUs" placeholder="Id Usuario"/><br/>
                <input type="text" name="numEmp" placeholder="Número de empleado"/><br/>
                <input type="text" name="tipo" placeholder="Tipo de usuario"/><br/>
                <input type="submit" value="Iniciar Sesión">
            </form>
    </body>
</html>
