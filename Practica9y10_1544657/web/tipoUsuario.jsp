<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elegir tipo de usuario</title>
    </head>
    <body>
        <h1>Seleccione el tipo de usuario que desea registrar</h1>
         <form action="TipoUsuarios" method="post">
            <select name="tipousuario">
                <option value="admi">Administrador</option>
                <option value="normie">Normal</option>
                <option value="invi">Invitado</option>
            </select>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
