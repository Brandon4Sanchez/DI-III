package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;

public final class Eventos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Eventos</title>\n");
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
      out.write("\n");
      out.write("        ");

            Models.clsEventos obclsEventos = new Models.clsEventos();

            if (request.getAttribute("obclsEventos") != null) {
                obclsEventos= (Models.clsEventos) request.getAttribute("obclsEventos");
            }

            List<Models.clsEventos> lstclsEventos   = new ArrayList<Models.clsEventos>();

            //EXISTENCIA DE LA VARIABLE DE SESION
            if (session.getAttribute("session_lstclsEventos") != null) {
                //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
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
      out.write("                    <b>Eventos - Registros: (");
      out.print(lstclsEventos.size());
      out.write(")</b>\n");
      out.write("                    <p>\n");
      out.write("                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, \n");
      out.write("                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr \n");
      out.write("                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus \n");
      out.write("                        contactos o posibles clientes a través de un evento.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"EventosController\" method=\"POST\">\n");
      out.write("                        <input type=\"text\" hidden=\"\" name=\"txtCodigo\"/> \n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\" name=\"btnGuardar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Modificar\" class=\"btn btn-primary\" name=\"btnModificar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Cancelar\" class=\"btn btn-primary\" name=\"btnCancelar\"/>\n");
      out.write("                                    <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver</a>\n");
      out.write("                                    <input type=\"text\"\n");
      out.write("                                   name=\"codigoModificar\"\n");
      out.write("                                   value=\"");
      out.print( obclsEventos.getInCodigo()!= 0 ?
                                       obclsEventos.getInCodigo(): "");
      out.write("\" hidden=\"\"/>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <h1>Información sobre el evento</h1>                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label name=\"lblNombre\">Nuevo evento</label>\n");
      out.write("                                    <input type=\"text\"placeholder=\"Nuevo evento\" name=\"txtNombre\" \n");
      out.write("                                         class=\"form-control\"\n");
      out.write("                                          value=\"");
      out.print( obclsEventos.getStNombre()!= null
                                                   ? obclsEventos.getStNombre(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label name=\"lblUbicacion\">Ubicación</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Ubicación\" name=\"txtUbicacion\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsEventos.getStUbicacion() != null
                                                   ? obclsEventos.getStUbicacion() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label name=\"lblParticipantes\">Participantes</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Participantes\" name=\"txtParticipantes\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsEventos.getStParticipantes() != null
                                                   ? obclsEventos.getStParticipantes() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label name=\"lblTodoDia\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"chkTodoDia\"/>\n");
      out.write("                                        ");
      out.print( obclsEventos.getChTodoDia() == 'S' ? "checked" : "");
      out.write("/>    \n");
      out.write("\n");
      out.write("                                        Todo el dia\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblFecha\">Fecha</label>\n");
      out.write("                                    <input type=\"date\" name=\"txtFecha\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsEventos.getStFecha() != null
                                                   ? obclsEventos.getStFecha() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblRelacionadoCon\">Relacionado con</label>\n");
      out.write("                                    <select name=\"ddlRelacionadoCon\" class=\"form-control\">\n");
      out.write("                                        <option value=\"-1\"");
      out.print( obclsEventos.getObclsRelacionadoCon() != null ? obclsEventos.getObclsRelacionadoCon().getInCodigo() == -1 ? "selected" : "" : "");
      out.write(">Seleccione</option>\n");
      out.write("                                        <option value=\"1\"");
      out.print( obclsEventos.getObclsRelacionadoCon() != null ? obclsEventos.getObclsRelacionadoCon().getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">Posible cliente</option>\n");
      out.write("                                        <option value=\"2\"");
      out.print( obclsEventos.getObclsRelacionadoCon() != null ? obclsEventos.getObclsRelacionadoCon().getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">Contacto</option>\n");
      out.write("                                        <option value=\"3\"");
      out.print( obclsEventos.getObclsRelacionadoCon() != null ? obclsEventos.getObclsRelacionadoCon().getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">Otros</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label name=\"lblDescripcion\">Informacion de la descripcion</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Informacion de la descripcion\" name=\"txtDescripcion\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsEventos.getStDescripcion() != null
                                                   ? obclsEventos.getStDescripcion() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                                    <table class=\"table table-bordered\" >\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("\n");
      out.write("                                            <td>Codigo </td>\n");
      out.write("                                            <td>Nombre </td>\n");
      out.write("                                            <td>Ubicacion </td>\n");
      out.write("                                            <td>Participante </td>\n");
      out.write("                                            <td>Todo el dia </td>\n");
      out.write("                                            <td>Fecha </td>\n");
      out.write("                                            <td>RelacionadoCon</td>\n");
      out.write("                                            <td>Descripcion </td>\n");
      out.write("                                            <td>Opciones</td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                            for (Models.clsEventos item : lstclsEventos) {
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("\n");
      out.write("                                            <td>");
      out.print(item.getInCodigo());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStNombre());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStUbicacion());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStParticipantes());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getChTodoDia());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStFecha());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getObclsRelacionadoCon().getStDescripcion());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStDescripcion());
      out.write("</td>\n");
      out.write("                                            <td>         \n");
      out.write("\n");
      out.write("                                                  <a href=\"EventosController?stopcion=M&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <a href=\"EventosController?stopcion=E&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-danger btn-sm\">Eliminar</a>\n");
      out.write("\n");
      out.write("                                            </td> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                            }

                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
