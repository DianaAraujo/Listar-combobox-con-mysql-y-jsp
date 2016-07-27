<%-- 
    Document   : index
    Created on : 27-jun-2016, 11:07:11
    Author     : Evolution
--%>

<%@page import="modelo.Conexion1"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%
             Conexion1 conex = new Conexion1();
             ResultSet rs = null;
             
              %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <link rel="stylesheet" href="css/bootstrap.min.css">
	 <link rel="stylesheet" href="css/styles.css">

    </head>
    <body>
        <div id="container">
	<form  action="modelo.jsp" method="post">
	<label for="">PRUEBAAAAA</label>
	<label for="nombre">Nombre: </label>
	<input type="text" name="nombre" id=""><br>
	<label for="apellido">Apellido</label>
        <input type="text" name="apellido" id=""><br>
        <label for="direccion">Direccion: </label>
        <label for="direccion">Departamento: </label>
        
       
        <select name="depto" id="depto">
            <option>- No Seleccionado </option>
            <%
             try{         
              String sql="select * from depto";
              rs= conex.consultar(sql);
              while(rs.next()){
                    out.println("<option value='"+rs.getString("id_depto")+"'>"+rs.getString("dept")+" </option>");      
                 }
                             }
                catch(SQLException e){
                  e.printStackTrace();
                }
 
             %>
            
        </select> <br>
        <label for="Genero">Género: </label>
        <select name="Genero" id="Genero" >
            <option>No Seleccionado</option>
            <option value="F">F</option>
            <option value="M">M</option>

        </select> <br><br>

        <label for="Estado civil:">Estado Civil: </label><br>
        <%
        try{
            
        
            String sqlCheck= "select * from Ecivil";
        ResultSet rsCheck= conex.consultar(sqlCheck);
        while(rsCheck.next()){
                
        out.println("<input type='radio' name='Ecivil' value='"+rsCheck.getString("id_Ecivil")+"'> "+rsCheck.getString("Estado")+"<br>");
        
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
                %>

	
</form>
	</div>
        
         <script src="js/jquery.js"></script>
	 <script src="js/main.js"></script>
    </body>
</html>
