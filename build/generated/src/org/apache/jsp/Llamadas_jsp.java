package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;

public final class Llamadas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Llamadas</title>\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

             Models.clsLlamadas obclsLlamadas = new Models.clsLlamadas();
                                 
            if(request.getAttribute("obclsLlamadas") != null){
                obclsLlamadas =(Models.clsLlamadas) 
                        request.getAttribute("obclsLlamadas");
            }
                
            //INSTANCIO LSITA DE OBJETO
            List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();

            //VALIDO QUE LA VARIABLE DE SESION CONTENGA VALORES
            if (session.getAttribute("session_lstclsLlamadas") != null) {
                //REALIZO CAST PARA DEFINIR QUE TIPO DE OBJETO ALMACENA LA VARIABLE DE SESION
                //ASIGNO VARIABLE DE SESION A OBJETO
                lstclsLlamadas = (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- SCRIPTLETS -->\n");
      out.write("        ");

            if (request.getAttribute("stMensaje") != null) {
        
      out.write("     \n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtMensaje\" value=\"");
      out.print(request.getAttribute("stMensaje").toString());
      out.write("\"/>\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtTipo\" value=\"");
      out.print(request.getAttribute("stTipo").toString());
      out.write("\"/>\n");
      out.write("        <script>\n");
      out.write("            swal(\"Mensaje\", document.getElementById(\"txtMensaje\").value, document.getElementById(\"txtTipo\").value);\n");
      out.write("        </script>\n");
      out.write("        ");

            }
        
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Crear llamada</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <b>Llamadas - Registros: (");
      out.print(lstclsLlamadas.size());
      out.write(")</b>\n");
      out.write("                    <p>      \n");
      out.write("                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, \n");
      out.write("                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr \n");
      out.write("                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus \n");
      out.write("                        contactos o posibles clientes a través de un evento.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <form action=\"LlamadasController\" method=\"POST\">\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\" name=\"btnGuardar\"/>\n");
      out.write("                                <input type=\"submit\" value=\"Modificar\" class=\"btn btn-primary\" name=\"btnModificar\"/>\n");
      out.write("                                <input type=\"submit\" value=\"Cancelar\" class=\"btn btn-primary\" name=\"btnCancelar\"/>\n");
      out.write("                                <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <h1>Información sobre la llamada</h1>                                \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblNombreContacto\">Nombre de contacto</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Nombre de contacto\" name=\"txtNombreContacto\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                         value=\"");
      out.print( obclsLlamadas.getStContacto()!= null ?
                                                   obclsLlamadas.getStContacto(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblAsunto\">Asunto</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Asunto\" name=\"txtAsunto\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsLlamadas.getStAsunto()!= null ?
                                                   obclsLlamadas.getStAsunto(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblProposito\">Proposito de la llamada</label>\n");
      out.write("                                <select class=\"form-control\" name=\"ddlProposito\">\n");
      out.write("                                    <option value=\"-1\"");
      out.print( obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                    <option value=\"1\"");
      out.print( obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Ninguno</option>\n");
      out.write("                                    <option value=\"2\"");
      out.print( obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Posible</option>\n");
      out.write("                                    <option value=\"3\"");
      out.print( obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Administrativo</option>\n");
      out.write("                                    <option value=\"4\"");
      out.print( obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Negociacion</option>\n");
      out.write("                                    <option value=\"5\"");
      out.print( obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Demostracion</option>\n");
      out.write("                                    <option value=\"6\"");
      out.print( obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 6 ? "selected" : "" : "" );
      out.write(">Proyecto</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblRelacionadoCon\">Relacionado con</label>\n");
      out.write("                                <select name=\"ddlRelacionadoCon\" class=\"form-control\">\n");
      out.write("                                    <option value=\"-1\"");
      out.print( obclsLlamadas.getObclsRelacionadoCon()!= null ? obclsLlamadas.getObclsRelacionadoCon().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                    <option value=\"1\"");
      out.print( obclsLlamadas.getObclsRelacionadoCon()!= null ? obclsLlamadas.getObclsRelacionadoCon().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Posible cliente</option>\n");
      out.write("                                    <option value=\"2\"");
      out.print( obclsLlamadas.getObclsRelacionadoCon()!= null ? obclsLlamadas.getObclsRelacionadoCon().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Contacto</option>\n");
      out.write("                                    <option value=\"3\"");
      out.print( obclsLlamadas.getObclsRelacionadoCon()!= null ? obclsLlamadas.getObclsRelacionadoCon().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Otros</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblTipo\">Tipo de llamada</label><br/>\n");
      out.write("                                <input type=\"radio\" name=\"rbTipo\" value=\"1\"/>Llamada actual<br/>\n");
      out.write("                                <input type=\"radio\" name=\"rbTipo\" value=\"2\"/>Llamada completada<br/>\n");
      out.write("                                <input type=\"radio\" name=\"rbTipo\" value=\"3\"/>Programar llamada<br/>\n");
      out.write("                                              \n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblDetalles\">Detalles de la llamada</label>                                   \n");
      out.write("                                <input type=\"text\" placeholder=\"Detalles de la llamada\" name=\"txtDetalles\" \n");
      out.write("                                       class=\"form-control\"      \n");
      out.write("                                        value=\"");
      out.print( obclsLlamadas.getStDetalles()!= null ?
                                                   obclsLlamadas.getStDetalles(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>     \n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblFecha\">Fecha</label>\n");
      out.write("                                <input type=\"date\" name=\"txtFecha\" class=\"form-control\"\n");
      out.write("                                        value=\"");
      out.print( obclsLlamadas.getStFecha()!= null ?
                                                   obclsLlamadas.getStFecha(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblDuracion\">Duración (Minutos)</label>                                   \n");
      out.write("                                <input type=\"text\" placeholder=\"Duración (Minutos)\" required=\"\" name=\"txtDuracion\"\n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsLlamadas.getInDuracion());
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <label name=\"lblDescripcion\">Descripción</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Descripcion\" name=\"txtDescripcion\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                        value=\"");
      out.print( obclsLlamadas.getStDescripcion()!= null ?
                                                   obclsLlamadas.getStDescripcion(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <label name=\"lblResultado\">Resultado de la llamada</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Resultado de la llamada\" name=\"txtResultado\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                        value=\"");
      out.print( obclsLlamadas.getStResultado()!= null ?
                                                   obclsLlamadas.getStResultado(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                                <table class=\"table table-bordered table-responsive\n");
      out.write("                                      \n");
      out.write("                                       table-responsive\n");
      out.write("                                       \" >\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                         <td>Codigo </td>\n");
      out.write("                                        <td>NombreContacto </td>\n");
      out.write("                                        <td>Asunto </td>\n");
      out.write("                                        <td>ddlProposito </td>\n");
      out.write("                                        <td>lblRelacionadoCon </td>\n");
      out.write("                                        <td>rbTipo </td>\n");
      out.write("                                        <td>Detalles </td>\n");
      out.write("                                        <td>Fecha </td>\n");
      out.write("                                        <td>Duracion </td>\n");
      out.write("                                        <td>Descripcion</td>\n");
      out.write("                                        <td>Resultado</td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                   for (Models.clsLlamadas item : lstclsLlamadas) {
   
                                           
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print(item.getInCodigo());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStContacto());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStAsunto());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getObclsProposito().getStDescripcion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getObclsRelacionadoCon().getStDescripcion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getObclsTipoLlamada());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStDetalles());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStFecha());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getInDuracion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStDescripcion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStResultado());
      out.write("</td>\n");
      out.write("                                        <td>           \n");
      out.write("\n");
      out.write("\n");
      out.write("                                              <a href=\"LlamadasController?stopcion=M&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <a href=\"LlamadasController?stopcion=E&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-danger btn-sm\">Eliminar</a>\n");
      out.write("\n");
      out.write("                                            </td> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                        }

                                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>                \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
