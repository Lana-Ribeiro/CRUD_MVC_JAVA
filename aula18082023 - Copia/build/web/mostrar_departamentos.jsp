<%-- 
    Document   : mostrar_departamentos
    Created on : 19/10/2023, 23:10:45
    Author     : lanac
--%>

<%@page import="java.util.List"%>
<%@page import="model.Departamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Departamento> departamentos = (List<Departamento>) request.getAttribute("departamentos");
        %>
        <table border='1'>
            <tr>
                <th> Código </th>
                <th> Nome </th>   
                <th> Telefone </th>                 
            </tr>
            <%
                for (Departamento dep : departamentos) {
            %>   
            <tr>
                <td> <%= dep.getIdDep()%> </td>
                <td> <%= dep.getNomeDep()%> </td>
                <td> <%= dep.getTelefoneDep()%> </td>            
            </tr>    
            <%
                }
            %> 
        </table>    
    </body>
</html>
