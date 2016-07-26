<%-- 
    Document   : index
    Created on : 27-jun-2016, 11:07:11
    Author     : Evolution
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="modelo.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <link rel="stylesheet" href="css/bootstrap.min.css">
	 <link rel="stylesheet" href="css/styles.css">
         <%
             conexion conex = new conexion();
              Connection conn = conex.AbrirConexion();
              Statement st;
              %>
    </head>
    <body>
        <div id="container">
	<form  action="modelo.jsp" method="post">
	
	<label for="nombre">Nombre: </label>
	<input type="text" name="nombre" id=""><br>
	<label for="apellido">Apellido</label>
        <input type="text" name="apellido" id=""><br>
        <label for="direccion">Direccion: </label>
        <label for="direccion">Departamento: </label>
        
        <select>
            <option>- No Seleccionado </option>
            <%
             try{         
              String sql="select * from Depto";
              st = conn.createStatement();
              ResultSet rs= st.executeQuery(sql);
              while(rs.next()){
               %>
               
               <option value="<%rs.getString(1);%>"> <%rs.getString(2); %></option>
                   
                   
                <%
                                       
                 }
                  conn.close();
                  st.close();
                }
                catch(SQLException e){
                  e.printStackTrace();
                }
 
             %>
            
        </select>
	
</form>
	</div>
        
         <script src="js/jquery.js"></script>
	 <script src="js/main.js"></script>
    </body>
</html>
