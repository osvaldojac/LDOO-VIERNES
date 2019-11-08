<%-- 

--%>

<%@page import="Servlets.EmpleadoController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background = Picturs/bikes.jpg> 


    <center>
        <table bgcolor ="FFDEAD" style="color:chocolate">
           <tr><img src="Picturs/bikes.jpg" width="500" height="400"><th>
            <tr>
                <td>Nombre:</td>
                <td> <input style="color:chocolate" type="texto" name="txtNombre" value="<c:out value="${Nombre}"/>"></td>
            </tr>
            <tr>
                <td>Sexo:</td>
                <td><input style="color:chocolate" type="texto" name="txtSexo" value="<c:out value="${Sexo}"/>"></td>
            </tr>
            <tr>
                <td>Date:</td>
                <td><input style="color:chocolate" type="texto" name="txtDate" value="<c:out value="${Fecha}"/>"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input style="color:chocolate" type="texto" name="txtEmail" value="<c:out value="${Email}"/>"></td>
            </tr>
        </table>
    </center>
</body> 
</html>
