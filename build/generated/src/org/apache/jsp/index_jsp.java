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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");

             Conexion1 conex = new Conexion1();
             ResultSet rs = null;
             
              
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("       <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\t <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/Estilo.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("   <header>\r\n");
      out.write("       <div class=\"menu_bar\">\r\n");
      out.write("         <a href=\"#\" class=\"bt-menu\"><span class=\"icon-menu\"></span>Menu</a>\r\n");
      out.write("       </div>\r\n");
      out.write("      <nav>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"#\"><span class=\"icon-home3\"></span>Inicio</a></li>\r\n");
      out.write("          <li><a href=\"#\"><span class=\"icon-profile\"></span>Registrate</a></li>\r\n");
      out.write("          <li><a href=\"#\"><span class=\"icon-rocket\"></span>Proyectos </a></li>\r\n");
      out.write("          <li><a href=\"#\"><span class=\"icon-envelop\"></span>Contáctanos</a></li>\r\n");
      out.write("          <li><a href=\"#\"><span class=\"icon-cross\"></span>Buscar</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("  <section id=formRegistro>  \r\n");
      out.write("  <div id=\"conte.Form\" class=form-group>\r\n");
      out.write("  \t<form class=\"form-group\" id=\"formPersona\"  action=\"\" method=\"post\"  >\r\n");
      out.write("      \r\n");
      out.write("         <div id=\"titulo\"> <h2>Registrate </h2> </div>\r\n");
      out.write("        \t<div class=\"estilo\"><input type=\"text\" class=\"form-control\" id=\"texbox\" name=\"nombre\" placeholder=\"Nombre\" id=\"\"></div>\r\n");
      out.write("        \t<div class=\"estilo\"><input type=\"text\" class=\"form-control\" id=\"texbox\" name=\"apellido\" placeholder=\"Apellido\" id=\"\"></div>\r\n");
      out.write("          <div class=\"estilo\"><input type=\"text\" class=\"form-control\" id=\"texbox\" name=\"e-mail\" placeholder=\"ejemplo@gmail.com\" id=\"\"></div>\r\n");
      out.write("           <!--select departamento --> \r\n");
      out.write("         <div class=\"estilo\"> <label for=\"direccion\">Ubicación: </label>\r\n");
      out.write("           \r\n");
      out.write("              <select class=\"form-control\" id=\"sel1\" name=\"depto\" id=\"depto\">\r\n");
      out.write("                <option>- No Seleccionado </option>\r\n");
      out.write("                ");

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
     
                 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("              </select>  </div>\r\n");
      out.write("           <!--select genero --> \r\n");
      out.write("           <div class=\"estilo\">  <label for=\"Genero\">Género: </label>\r\n");
      out.write("                <select class=\"form-control\" id=\"sel1\" name=\"Genero\" id=\"Genero\" >\r\n");
      out.write("                    <option>No Seleccionado</option>\r\n");
      out.write("                    <option value=\"F\">F</option>\r\n");
      out.write("                    <option value=\"M\">M</option>\r\n");
      out.write("\r\n");
      out.write("                </select> \r\n");
      out.write("            </div>\r\n");
      out.write("             <!--radio estado civil --> \r\n");
      out.write("          <div class=\"estilo\"><label for=\"Estado civil:\">Estado Civil:</label><br>\r\n");
      out.write("                    ");

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
                        
                     
      out.write("  \r\n");
      out.write("           </div>\r\n");
      out.write("\r\n");
      out.write("\t         <div  class=\"estilo\"><button id=\"boton\" class=\"btn btn-primary btn-lg\">Enviar</button></div>\r\n");
      out.write("       \r\n");
      out.write("  </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  </section>\r\n");
      out.write("</div>  \r\n");
      out.write("        \r\n");
      out.write("   <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
