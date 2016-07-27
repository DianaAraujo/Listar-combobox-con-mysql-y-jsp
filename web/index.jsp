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
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>JSP Page</title>
       <link rel="stylesheet" href="css/bootstrap.min.css">
	 <link rel="stylesheet" href="css/style.css">
   <link rel="stylesheet" href="css/Estilo.css">

    </head>
    <body>
        <div id="container">

   <header>
       <div class="menu_bar">
         <a href="#" class="bt-menu"><span class="icon-menu"></span>Menu</a>
       </div>
      <nav>
        <ul>
          <li><a href="#"><span class="icon-home3"></span>Inicio</a></li>
          <li><a href="#"><span class="icon-profile"></span>Registrate</a></li>
          <li><a href="#"><span class="icon-rocket"></span>Proyectos </a></li>
          <li><a href="#"><span class="icon-envelop"></span>Contáctanos</a></li>
          <li><a href="#"><span class="icon-search"></span>Buscar</a></li>
        </ul>
      </nav>
    </header>
    
  	<form  action="modelo.jsp" method="post">
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
                
        out.println("<input type='radio' name='Ecivil' value='"+rsCheck.getString("id_Ecivil")+"'> "+rsCheck.getString("Ecivil")+"<br>");
        
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
