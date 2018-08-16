package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;

public final class Campañas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Campanas</title>\n");
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
      out.write("    <body>\n");
      out.write("        ");

            Models.clsCampanas obclsCampanas = 
                    new Models.clsCampanas();
            
            if(request.getAttribute("obclsCampanas") != null){
                obclsCampanas =(Models.clsCampanas) 
                        request.getAttribute("obclsCampanas");
            }
            
            List<Models.clsCampanas> lstclsCampanas = new ArrayList<Models.clsCampanas>();

            //EXISTENCIA DE LA VARIABLE DE SESION
            if (session.getAttribute("session_lstclsCampanas") != null) {
                //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION
                lstclsCampanas = (List<Models.clsCampanas>) session.getAttribute("session_lstclsCampanas");
            }

            if (request.getAttribute("stMensaje") != null
                    && request.getAttribute("stTipo") != null) {
        
      out.write("\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtMensaje\"\n");
      out.write("               value=\"");
      out.print( request.getAttribute("stMensaje"));
      out.write("\"/>\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtTipo\"\n");
      out.write("               value=\"");
      out.print( request.getAttribute("stTipo"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var mensaje = document.getElementById(\"txtMensaje\").value;\n");
      out.write("            var tipo = document.getElementById(\"txtTipo\").value;\n");
      out.write("\n");
      out.write("            swal(\"Mensaje\", mensaje, tipo);\n");
      out.write("        </script>\n");
      out.write("        ");

            }    
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <b>Campañas - Registros: (");
      out.print(lstclsCampanas.size());
      out.write(")</b>\n");
      out.write("                    <p>\n");
      out.write("                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, \n");
      out.write("                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr \n");
      out.write("                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus \n");
      out.write("                        contactos o posibles clientes a traves de un evento.\n");
      out.write("                    </p>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"CampanasController\" method=\"POST\">\n");
      out.write("                        <input type=\"text\" hidden=\"\" name=\"txtCodigo\"/>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\" name=\"btnGuardar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Modificar\" class=\"btn btn-primary\" name=\"btnModificar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Cancelar\" class=\"btn btn-primary\" name=\"btnCancelar\"/>\n");
      out.write("                                    <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver</a>\n");
      out.write("                                     <input type=\"text\"\n");
      out.write("                                   name=\"codigoModificar\"\n");
      out.write("                                   value=\"");
      out.print( obclsCampanas.getInCodigo()!= 0 ?
                                       obclsCampanas.getInCodigo(): "");
      out.write("\" hidden=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <h1>Informacion sobre la campaña</h1>                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTipo\">Tipo</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlTipo\">\n");
      out.write("                                        <option value=\"-1\"");
      out.print( obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                        <option value=\"1\"");
      out.print( obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Ninguno</option>\n");
      out.write("                                        <option value=\"2\"");
      out.print( obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Conferencia</option>\n");
      out.write("                                        <option value=\"3\"");
      out.print( obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Seminario web</option>\n");
      out.write("                                        <option value=\"4\"");
      out.print( obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Exposicion comercial</option>\n");
      out.write("                                        <option value=\"5\"");
      out.print( obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Relaciones publicas</option>\n");
      out.write("                                        <option value=\"6\"");
      out.print( obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 6 ? "selected" : "" : "" );
      out.write(">Socios</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNombre\">Nombre de campaña</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Nombre de campaña\" name=\"txtNombre\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsCampanas.getStNombre() != null ?
                                                       obclsCampanas.getStNombre() : "" );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblEstado\">Estado</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlEstado\">\n");
      out.write("                                        <option value=\"-1\"");
      out.print( obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                        <option value=\"1\"");
      out.print( obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Ninguno</option>\n");
      out.write("                                        <option value=\"2\"");
      out.print( obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Planificacion</option>\n");
      out.write("                                        <option value=\"3\"");
      out.print( obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Activo</option>\n");
      out.write("                                        <option value=\"4\"");
      out.print( obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Inactivo</option>\n");
      out.write("                                        <option value=\"5\"");
      out.print( obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Completos</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFechaInicio\">Fecha de inicio</label>\n");
      out.write("                                    <input type=\"date\" placeholder=\"Fecha de inicio\" name=\"txtFechaInicio\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsCampanas.getStFechaInicio()!= null ?
                                                       obclsCampanas.getStFechaInicio() : "" );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFechaFinalizacion\">Fecha de finalizacion</label>\n");
      out.write("                                    <input type=\"date\" placeholder=\"Fecha de finalizacion\" name=\"txtFechaFinalizacion\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsCampanas.getStFechaFinalizacion()!= null ?
                                                       obclsCampanas.getStFechaFinalizacion() : "" );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblIngresosEsperados\">Ingresos esperados</label>\n");
      out.write("                                    <input type=\"number\" placeholder=\"Ingresos esperados\" name=\"txtIngresosEsperados\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( 
                                                       obclsCampanas.getDbIngresosEsperados());
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCostePresupuestado\">Coste presupuestado</label>\n");
      out.write("                                    <input type=\"number\" placeholder=\"Coste presupuestado\" name=\"txtCostePresupuestado\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( 
                                                       obclsCampanas.getDbCostePresupuestado());
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCosteReal\">Coste real</label>\n");
      out.write("                                    <input type=\"number\" placeholder=\"Coste real\" name=\"txtCosteReal\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( 
                                                       obclsCampanas.getDbCosteReal());
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblRespuestaEsperada\">Respuesta esperada</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Respuesta esperada\" name=\"txtRespuestaEsperada\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsCampanas.getStRespuestaEsperada()!= null ?
                                                       obclsCampanas.getStRespuestaEsperada() : "" );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNumerosEnviados\">Numeros enviados</label>\n");
      out.write("                                    <input type=\"number\" placeholder=\"Numeros enviados\" name=\"txtNumerosEnviados\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( 
                                                       obclsCampanas.getInNumerosEnviados());
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblDescripcion\">Descripcion</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Descripcion\" name=\"txtDescripcion\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsCampanas.getStDescripcion()!= null ?
                                                       obclsCampanas.getStDescripcion() : "" );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <table class=\"table table-bordered table-responsive\">\n");
      out.write("                                        <tr><!-- FILA -->\n");
      out.write("                                            <!-- COLUMNA -->\n");
      out.write("                                            <td>Codigo</td>\n");
      out.write("                                            <td>Tipo Campaña</td>\n");
      out.write("                                            <td>Nombre</td>\n");
      out.write("                                            <td>Estado Campaña</td>\n");
      out.write("                                            <td>Fecha Inicio</td>\n");
      out.write("                                            <td>Fecha Finalizacion</td>\n");
      out.write("                                            <td>Ingresos Esperados</td>\n");
      out.write("                                            <td>Coste Presupuestado</td>\n");
      out.write("                                            <td>Coste Real</td>\n");
      out.write("                                            <td>Respuesta Esperada</td>\n");
      out.write("                                            <td>Numeros Enviados</td>\n");
      out.write("                                            <td>Descripcion</td>\n");
      out.write("                                            <td>Opciones</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    ");

                                      for (Models.clsCampanas item : lstclsCampanas){
                                          
                                         
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print( item.getInCodigo() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getObclsTipoCampana().getStDescripcion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getStNombre());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getObclsEstadoCampana().getStDescripcion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getStFechaInicio());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getStFechaFinalizacion());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getDbIngresosEsperados());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getDbCostePresupuestado());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getDbCosteReal());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getStRespuestaEsperada());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getInNumerosEnviados());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( item.getStDescripcion());
      out.write("</td>\n");
      out.write("                                        <td>\n");
      out.write("                                           \n");
      out.write("                                              <a href=\"CampanasController?stopcion=M&codigoSelecionado=");
      out.print(item.getInCodigo());
      out.write("\" class=\"btn btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <a href=\"CampanasController?stopcion=E&codigoSelecionado=");
      out.print(item.getInCodigo());
      out.write("\" class=\"btn btn-danger btn-sm\">Eliminar</a>\n");
      out.write("\n");
      out.write("                                            </td> \n");
      out.write("                                    </tr> \n");
      out.write("                                    \n");
      out.write("                                    ");

                                        }
                                    
      out.write(" \n");
      out.write("                                    </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
