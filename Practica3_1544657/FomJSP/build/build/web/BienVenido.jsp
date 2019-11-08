<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background = Picturs/bikes.jpg> 
        <%!
            String nombre; 
            String sexo;
            String fechaNacimiento;
            String email;
            String password;
        %>
        
        <%  
            nombre= request.getParameter("txtNombre"); 
            sexo= request.getParameter("Sexo"); 
            fechaNacimiento= request.getParameter("txtFechaNacim"); 
            email = request.getParameter("txtEmail"); 
            password = request.getParameter("txtPassword");  
        %> 
        
        <center>
            <table bgcolor ="FFDEAD" style="color:chocolate">
                <tr><th><img src="Picturs/bikes.jpg" width="500" height="400"> <tr><th>
                <tr><th><%= nombre%> </th></tr>
                <tr><th><%= sexo%> </th></tr>
                <tr><th><%= fechaNacimiento%> </th></tr>
                <tr><th><%= email%> </th></tr>
            </table>
        </center>
    </body> 
</html>
