package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;

public final class Tarea_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("     <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Tareas</title>\n");
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

            if (request.getAttribute("stMensaje") != null) {
        
      out.write("\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtMensaje\" \n");
      out.write("               value=\"");
      out.print( request.getAttribute("stMensaje"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtTipo\" \n");
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
      out.write("        ");

            
 Models.clsTareas obclsTareas =  new Models.clsTareas();
                                 
            if(request.getAttribute("obclsTareas") != null){
                obclsTareas =(Models.clsTareas) 
                        request.getAttribute("obclsTareas");
            }  

//INSTANCIO LSITA DE OBJETO
            List<Models.clsTareas> lstclsTareas = new ArrayList<Models.clsTareas>();

            //VALIDO QUE LA VARIABLE DE SESION CONTENGA VALORES
            if (session.getAttribute("session_lstclsTareas") != null) {
                //REALIZO CAST PARA DEFINIR QUE TIPO DE OBJETO ALMACENA LA VARIABLE DE SESION
                //ASIGNO VARIABLE DE SESION A OBJETO
                lstclsTareas = (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Crear Tareas</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <b>Tareas - Registros: (");
      out.print(lstclsTareas.size());
      out.write(")</b>\n");
      out.write("                    <p>      \n");
      out.write("                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, \n");
      out.write("                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr \n");
      out.write("                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus \n");
      out.write("                        contactos o posibles clientes a través de un evento.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"TareasController\" method=\"POST\">\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\" name=\"btnGuardar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Modificar\" class=\"btn btn-primary\" name=\"btnModificar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Cancelar\" class=\"btn btn-primary\" name=\"btnCancelar\"/>\n");
      out.write("                                    <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <h1>Informacion sobre la tarea</h1>                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblTitular\">Titular de la tarea</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Titular de la tarea\" name=\"txtTitular\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsTareas.getStTitular()!= null ?
                                                   obclsTareas.getStTitular(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblAsunto\">Asunto</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Asunto\" name=\"txtAsunto\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsTareas.getStAsunto()!= null ?
                                                   obclsTareas.getStAsunto(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblFechaVencimiento\">Fecha de vencimiento</label>\n");
      out.write("                                    <input type=\"date\" name=\"txtFechaVencimiento\" class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsTareas.getStFechaVencimiento()!= null ?
                                                   obclsTareas.getStFechaVencimiento(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblContacto\">Contacto</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Contacto\" name=\"txtContacto\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsTareas.getStContacto()!= null ?
                                                   obclsTareas.getStContacto(): "");
      out.write("\"/>\n");
      out.write("                                           \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblCuenta\">Cuenta</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Cuenta\" name=\"txtCuenta\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsTareas.getStCuenta()!= null ?
                                                   obclsTareas.getStCuenta(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblEstado\">Estado</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlEstado\">\n");
      out.write("                                        <option value=\"-1\"");
      out.print( obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                        <option value=\"1\"");
      out.print( obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">No iniciado</option>\n");
      out.write("                                        <option value=\"2\"");
      out.print( obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Aplazados</option>\n");
      out.write("                                        <option value=\"3\"");
      out.print( obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">En curso</option>\n");
      out.write("                                        <option value=\"4\"");
      out.print( obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Completado</option>\n");
      out.write("                                        <option value=\"5\"");
      out.print( obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">En espera de entrada</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblPrioridad\">Prioridad</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlPrioridad\">\n");
      out.write("                                        <option value=\"-1\"");
      out.print( obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                        <option value=\"1\"");
      out.print( obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Alto</option>\n");
      out.write("                                        <option value=\"2\"");
      out.print( obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Mas alto</option>\n");
      out.write("                                        <option value=\"3\"");
      out.print( obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Bajo</option>\n");
      out.write("                                        <option value=\"4\"");
      out.print( obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Mas bajo</option>\n");
      out.write("                                        <option value=\"5\"");
      out.print( obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Normal</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblEnviarMensaje\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"chkEnviarMensaje\"\n");
      out.write("                           ");
      out.print( obclsTareas.getChEnviarMensaje()== 'S' ? "checked" : ""  );
      out.write("/>                     \n");
      out.write("                                               Enviar mensaje de correo electronico de notificacion\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblRepetir\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"chkRepetir\"\n");
      out.write("                                               ");
      out.print( obclsTareas.getChRepetir()== 'S' ? "checked" : ""  );
      out.write("/>\n");
      out.write("                                               Repetir\n");
      out.write("                                    </label>\n");
      out.write("                                </div>                              \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label name=\"lblDescripcion\">Informacion de la descripcion</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Informacion de la descripcion\" \n");
      out.write("                                           name=\"txtDescripcion\" class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsTareas.getStDescripcion()!= null ?
                                                   obclsTareas.getStDescripcion(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                                    <table class=\"table table-bordered table-responsive\" >\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Codigo </td>\n");
      out.write("                                            <td>Titular </td>\n");
      out.write("                                            <td>Asunto </td>\n");
      out.write("                                            <td>FechaVencimiento</td>\n");
      out.write("                                            <td>contacto </td>\n");
      out.write("                                            <td>Cuenta </td>\n");
      out.write("                                            <td>ddlEstado</td>\n");
      out.write("                                            <td>ddlPrioridad</td>\n");
      out.write("                                            <td>chkEnviarMensaje</td>\n");
      out.write("                                            <td>chkRepetir</td>\n");
      out.write("                                            <td>Descripcion</td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                            for (Models.clsTareas item : lstclsTareas) {
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("\n");
      out.write("                                            <td>");
      out.print(item.getInCodigo());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStTitular());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStAsunto());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStFechaVencimiento());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStCuenta());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getObclsEstadoTarea().getStDescripcion() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getObclsPrioridad().getStDescripcion() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getChEnviarMensaje());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getChRepetir());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStDescripcion());
      out.write("</td>\n");
      out.write("                                            <td>           \n");
      out.write("\n");
      out.write("                                                  <a href=\"TareasController?stopcion=M&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <a href=\"TareasController?stopcion=E&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-danger btn-sm\">Eliminar</a>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>  \n");
      out.write("                            </div>  \n");
      out.write("                        </div>  \n");
      out.write("\n");
      out.write("\n");
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
