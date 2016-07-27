package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Conexion1;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");

             Conexion1 conex = new Conexion1();
             ResultSet rs = null;
             
              
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("\t<form  action=\"modelo.jsp\" method=\"post\">\n");
      out.write("\t\n");
      out.write("\t<label for=\"nombre\">Nombre: </label>\n");
      out.write("\t<input type=\"text\" name=\"nombre\" id=\"\"><br>\n");
      out.write("\t<label for=\"apellido\">Apellido</label>\n");
      out.write("        <input type=\"text\" name=\"apellido\" id=\"\"><br>\n");
      out.write("        <label for=\"direccion\">Direccion: </label>\n");
      out.write("        <label for=\"direccion\">Departamento: </label>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <select name=\"depto\" id=\"depto\">\n");
      out.write("            <option>- No Seleccionado </option>\n");
      out.write("            ");

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
 
             
      out.write("\n");
      out.write("            \n");
      out.write("        </select> <br>\n");
      out.write("        <label for=\"Genero\">Género: </label>\n");
      out.write("        <select name=\"Genero\" id=\"Genero\" >\n");
      out.write("            <option>No Seleccionado</option>\n");
      out.write("            <option value=\"F\">F</option>\n");
      out.write("            <option value=\"M\">M</option>\n");
      out.write("\n");
      out.write("        </select> <br><br>\n");
      out.write("\n");
      out.write("        <label for=\"Estado civil:\">Estado Civil: </label>\n");
      out.write("        ");

        try{
            
        
            String sqlCheck= "select * from Ecivil";
        ResultSet rsCheck= conex.consultar(sqlCheck);
        while(rsCheck.next()){
                
        out.println("<input type='checkbox' name='Ecivil' value='"+rsCheck.getString("id_Ecivil")+"'> "+rsCheck.getString("Estado")+"<br>");
        
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
                
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</form>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("         <script src=\"js/jquery.js\"></script>\n");
      out.write("\t <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
