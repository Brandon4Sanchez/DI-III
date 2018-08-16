package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class PosiblesClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>REGISTRO EMPRESA</title>\n");
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
      out.write("    <body>     \n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            Models.clsPosiblesClientes obclsPosiblesClientes=new Models.clsPosiblesClientes();
                                 
            if(request.getAttribute("obclsPosiblesClientes") != null){
                obclsPosiblesClientes =(Models.clsPosiblesClientes) 
                        request.getAttribute("obclsPosiblesClientes");
            }
            
            List<Models.clsPosiblesClientes> lstclsPosiblesClientes
                    = new ArrayList<Models.clsPosiblesClientes>();

            
            
            
            //EXISTENCIA DE LA VARIABLE DE SESION
            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
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
      out.write("                \n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"PosiblesClientesController\" method=\"POST\">\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\" \n");
      out.write("                                           name=\"btnGuardar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Modificar\" class=\"btn btn-primary\" \n");
      out.write("                                           name=\"btnModificar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Cancelar\" class=\"btn btn-primary\" \n");
      out.write("                                           name=\"btnCancelar\"/>\n");
      out.write("                                    <a class=\"btn btn-primary\" href=\"Index.jsp\">Volver</a>\n");
      out.write("                                    <input type=\"text\"\n");
      out.write("                                           name=\"codigoModificar\"\n");
      out.write("                                           id=\"codigoModificar\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getInCodigo());
      out.write("\"\n");
      out.write("                                           hidden=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <h1>Empresa dedicada a ofertas de alojamientos a particulares y turistas</h1>                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"nombreAlojamiento\">nombreAlojamiento</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Nombre Alojamiento\" \n");
      out.write("                                           name=\"txtnombreAlojamiento\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstNombrealojamiento()!= null ?
                                                   obclsPosiblesClientes.getstNombrealojamiento(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblUbicacion\">Ubicacion</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Ubicacion\" \n");
      out.write("                                           name=\"txtUbicacion\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getSubicacion()!= null ?
                                                   obclsPosiblesClientes.getSubicacion(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                              \n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblcantidadDe\">cantidad de</label>\n");
      out.write("                                   <label name=\"lblHuespedes\">Huespedes</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Huespedes\" \n");
      out.write("                                           name=\"txtHuespedes\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstHuesped()!= null ?
                                                   obclsPosiblesClientes.getstHuesped(): "");
      out.write("\"/>\n");
      out.write("                                   \n");
      out.write("                                    <label name=\"lbldormitorio\">Dormitorio</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Dormitorio\" \n");
      out.write("                                           name=\"txtdormitorio\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getStstDormitorioso()!= null ?
                                                   obclsPosiblesClientes.getStstDormitorioso(): "");
      out.write("\"/>\n");
      out.write("                                    <label name=\"lblCamas\">Camas</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Camas\" \n");
      out.write("                                           name=\"txtCamas\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstcamas()!= null ?
                                                   obclsPosiblesClientes.getstcamas(): "");
      out.write("\"/>\n");
      out.write("                                    <label name=\"lblBaños\">Baños</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Baños\" \n");
      out.write("                                           name=\"txtBaños\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstbaños()!= null ?
                                                   obclsPosiblesClientes.getstbaños(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <label name=\"Descrpicion \">Descripciongeneral</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"descripcion generall\" \n");
      out.write("                                           name=\"txtDescripcion\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstDescripcion()!= null ?
                                                   obclsPosiblesClientes.getstDescripcion(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <label name=\"lugar\">El lugar</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Lugar\" \n");
      out.write("                                           name=\"txtlugar\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstLugar()!= null ?
                                           obclsPosiblesClientes.getstLugar(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-md-4\">\n");
      out.write("                                    <label name=\"Atencion\">Atencion a los huepedes</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Atencion a los huepedes\" \n");
      out.write("                                           name=\"txtAtencion\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstAtencion()!= null ?
                                           obclsPosiblesClientes.getstAtencion(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-md-4\">\n");
      out.write("                                    <label name=\"aspectos\">Otros aspectos acpectos destacables</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Lugar\" \n");
      out.write("                                           name=\"txtaspectos\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstotrosAspectos()!= null ?
                                           obclsPosiblesClientes.getstotrosAspectos(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-md-4\">\n");
      out.write("                                    <label name=\"lugar\">servicio que ofrece</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Servicio\" \n");
      out.write("                                           name=\"txtservicio\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstservicioOfrece()!= null ?
                                           obclsPosiblesClientes.getstservicioOfrece(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-md-4\">\n");
      out.write("                                    <label name=\"lugar\">valor noche</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"valor\" \n");
      out.write("                                           name=\"txtvalor\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblesClientes.getstvalorNoche()!= null ?
                                           obclsPosiblesClientes.getstvalorNoche(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">                            \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <b>\n");
      out.write("                                        <i class=\"fa fa-clipboard\"></i>\n");
      out.write("                                    Registros: ");
      out.print( lstclsPosiblesClientes.size());
      out.write("\n");
      out.write("                                    </b>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">                            \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <table class=\"table table-bordered                                            \n");
      out.write("                                           table-responsive\">\n");
      out.write("                                        <!-- FILA -->\n");
      out.write("                                        <tr> \n");
      out.write("                                            <!-- COLUMNA -->\n");
      out.write("                                            <td>Nombre alojamiento</td>\n");
      out.write("                                            <td>Ubicacion</td>\n");
      out.write("                                            <td>huespedes</td>\n");
      out.write("                                            <td>Dormitorios</td>\n");
      out.write("                                            <td>Camas</td>\n");
      out.write("                                            <td>Baños</td>\n");
      out.write("                                            <td>Descripcion general</td>\n");
      out.write("                                            <td>El lugar</td>\n");
      out.write("                                            <td>Atencion a los huespedes</td>\n");
      out.write("                                            <td>Otros aspectos destacables</td>\n");
      out.write("                                            <td>Servicio que ofrece</td>\n");
      out.write("                                            <td>Valor por noche</td>\n");
      out.write("                                           \n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            for (Models.clsPosiblesClientes item : lstclsPosiblesClientes) {
                                               
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print( item.getstNombrealojamiento());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getSubicacion());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstHuesped());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStstDormitorioso());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstcamas());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstbaños());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstDescripcion());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstLugar());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstAtencion());
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print( item.getstHuesped());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstotrosAspectos());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstservicioOfrece());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getstvalorNoche());
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                              \n");
      out.write("                                                \n");
      out.write("                                                <a href=\"PosiblesClientesController?stopcion=M&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <a href=\"PosiblesClientesController?stopcion=E&codigoSelecionado=");
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
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
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
