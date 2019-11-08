<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login p8</title>
    </head>
       <body>
        <h1>Inicia sesión</h1>
            <form action="IniciarSesion" method="post">
                <input type="text" name="nombre" placeholder="Nombre de usuario"/><br/>
                <input type="password" name="contra" placeholder="Contraseña"/><br/>
                <input type="submit" value="Iniciar Sesión">
            </form>
        <br>
        Registrate <a href="registro.jsp">aquí</a>
    </body>
</html>
