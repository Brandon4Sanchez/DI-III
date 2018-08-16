package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;

public final class Tratos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tratos</title>\n");
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
        
      out.write("    \n");
      out.write("\n");
      out.write("        ");

             Models.clsTratos obclsTratos =  new Models.clsTratos();
                                 
            if(request.getAttribute("obclsTratos") != null){
                obclsTratos =(Models.clsTratos) 
                        request.getAttribute("obclsTratos");
            }  
            
            
            
            //INSTANCIO LSITA DE OBJETO
            List<Models.clsTratos> lstclsTratos = new ArrayList<Models.clsTratos>();

            //VALIDO QUE LA VARIABLE DE SESION CONTENGA VALORES
            if (session.getAttribute("session_lstclsTratos") != null) {
                //REALIZO CAST PARA DEFINIR QUE TIPO DE OBJETO ALMACENA LA VARIABLE DE SESION
                //ASIGNO VARIABLE DE SESION A OBJETO
                lstclsTratos = (List<Models.clsTratos>) session.getAttribute("session_lstclsTratos");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Crear Tratos</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <b>Tratos - Registros: (");
      out.print(lstclsTratos.size());
      out.write(")</b>\n");
      out.write("                    <p>      \n");
      out.write("                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, \n");
      out.write("                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr \n");
      out.write("                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus \n");
      out.write("                        contactos o posibles clientes a través de un evento.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"TratosController\" method=\"POST\">\n");
      out.write("                    <!-- FILA -->\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\" name=\"btnGuardar\"/>\n");
      out.write("                                <input type=\"submit\" value=\"Modificar\" class=\"btn btn-primary\" name=\"btnModificar\"/>\n");
      out.write("                                <input type=\"submit\" value=\"Cancelar\" class=\"btn btn-primary\" name=\"btnCancelar\"/>\n");
      out.write("                                <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver</a>\n");
      out.write("                                \n");
      out.write("                                <input type=\"text\"\n");
      out.write("                                   name=\"codigoModificar\"\n");
      out.write("                                   value=\"");
      out.print( obclsTratos.getInCodigo()!= 0 ?
                                       obclsTratos.getInCodigo(): "");
      out.write("\" hidden=\"\"/>\n");
      out.write("                               \n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <h1>Información sobre el trato</h1>                                \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblImporte\">Importe</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Importe\" name=\"txtImporte\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                        value=\"");
      out.print( obclsTratos.getStImporte()!= null ?
                                                   obclsTratos.getStImporte(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblNombre\">Nombre de trato</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Nombre de trato\" name=\"txtNombre\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                        value=\"");
      out.print( obclsTratos.getStNombre()!= null ?
                                                   obclsTratos.getStNombre(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblFechaCierre\">Fecha de cierre</label>\n");
      out.write("                                <input type=\"date\" name=\"txtFechaCierre\" class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTratos.getStFechaCierre()!= null ?
                                                   obclsTratos.getStFechaCierre(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblNumeroCuenta\">Numero de cuenta</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Numero de cuenta\" name=\"txtNumeroCuenta\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTratos.getStNumeroCuenta()!= null ?
                                                   obclsTratos.getStNumeroCuenta(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblFase\">Fase</label>\n");
      out.write("                                <select class=\"form-control\" name=\"ddlFase\">\n");
      out.write("                                    <option value=\"-1\"");
      out.print( obclsTratos.getObclsFaseTrato()!= null ? obclsTratos.getObclsFaseTrato().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                    <option value=\"1\"");
      out.print( obclsTratos.getObclsFaseTrato()!= null ? obclsTratos.getObclsFaseTrato().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Ninguno</option>\n");
      out.write("                                    <option value=\"2\"");
      out.print( obclsTratos.getObclsFaseTrato()!= null ? obclsTratos.getObclsFaseTrato().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Clasificacion</option>\n");
      out.write("                                    <option value=\"3\"");
      out.print( obclsTratos.getObclsFaseTrato()!= null ? obclsTratos.getObclsFaseTrato().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Necesita analisis</option>\n");
      out.write("                                    <option value=\"4\"");
      out.print( obclsTratos.getObclsFaseTrato()!= null ? obclsTratos.getObclsFaseTrato().getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Propuesta de valor</option>\n");
      out.write("                                    <option value=\"5\"");
      out.print( obclsTratos.getObclsFaseTrato()!= null ? obclsTratos.getObclsFaseTrato().getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Identificar responsables</option>\n");
      out.write("                                    <option value=\"6\"");
      out.print( obclsTratos.getObclsFaseTrato()!= null ? obclsTratos.getObclsFaseTrato().getInCodigo() == 6 ? "selected" : "" : "" );
      out.write(">Cotizacion de propuesta/precio</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblTipo\">Tipo</label>\n");
      out.write("                                <select class=\"form-control\" name=\"ddlTipo\">\n");
      out.write("                                    <option value=\"-1\"");
      out.print( obclsTratos.getObclsTipoTrato()!= null ? obclsTratos.getObclsTipoTrato().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                    <option value=\"1\"");
      out.print( obclsTratos.getObclsTipoTrato()!= null ? obclsTratos.getObclsTipoTrato().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Negocios existentes</option>\n");
      out.write("                                    <option value=\"2\"");
      out.print( obclsTratos.getObclsTipoTrato()!= null ? obclsTratos.getObclsTipoTrato().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Nuevo negocio</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblProbabilidad\">Probabilidad</label>\n");
      out.write("                                <input type=\"number\" placeholder=\"Probabilidad\"  \n");
      out.write("                                       required=\"\"  name=\"txtProbabilidad\" class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblSiguientePaso\">Siguiente paso</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Siguiente paso\" name=\"txtSiguientePaso\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTratos.getStSiguientePaso()!= null ?
                                                   obclsTratos.getStSiguientePaso(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblIngresosEsperados\">Ingresos esperados</label>\n");
      out.write("                                <input type=\"number\" placeholder=\"Ingresos esperados\" \n");
      out.write("                                       required=\"\" name=\"txtIngresosEsperados\" class=\"form-control\"\n");
      out.write("                                        value=\"");
      out.print( obclsTratos.getDbIngresosEsperados());
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblFuentePosibleCliente\">Fuente de posible cliente</label>\n");
      out.write("                                <select class=\"form-control\" name=\"ddlFuentePosibleCliente\">\n");
      out.write("                                    <option value=\"-1\"");
      out.print( obclsTratos.getObclsFuentePosibleCliente()!= null ? obclsTratos.getObclsFuentePosibleCliente().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                    <option value=\"1\"");
      out.print( obclsTratos.getObclsFuentePosibleCliente()!= null ? obclsTratos.getObclsFuentePosibleCliente().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Ninguno</option>\n");
      out.write("                                    <option value=\"2\"");
      out.print( obclsTratos.getObclsFuentePosibleCliente()!= null ? obclsTratos.getObclsFuentePosibleCliente().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Aviso</option>\n");
      out.write("                                    <option value=\"3\"");
      out.print( obclsTratos.getObclsFuentePosibleCliente()!= null ? obclsTratos.getObclsFuentePosibleCliente().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Llamada no solicitada</option>\n");
      out.write("                                    <option value=\"4\"");
      out.print( obclsTratos.getObclsFuentePosibleCliente()!= null ? obclsTratos.getObclsFuentePosibleCliente().getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Recomendacion de empleado</option>\n");
      out.write("                                    <option value=\"5\"");
      out.print( obclsTratos.getObclsFuentePosibleCliente()!= null ? obclsTratos.getObclsFuentePosibleCliente().getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Recomendacion externa</option>\n");
      out.write("                                    <option value=\"6\"");
      out.print( obclsTratos.getObclsFuentePosibleCliente()!= null ? obclsTratos.getObclsFuentePosibleCliente().getInCodigo() == 6 ? "selected" : "" : "" );
      out.write(">Tienda en linea</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblFuenteCampana\">Fuente de campaña</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Fuente de campaña\" name=\"txtFuenteCampana\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTratos.getStFuenteCampaña()!= null ?
                                                   obclsTratos.getStFuenteCampaña(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblNombreContacto\">Nombre de contacto</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Nombre de contacto\" name=\"txtNombreContacto\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTratos.getStNombreContacto()!= null ?
                                                   obclsTratos.getStNombreContacto(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- FILA -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!-- COLUMNA -->\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <label name=\"lblDescripcion\">Descripción</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Descripción\" name=\"txtDescripcion\" class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTratos.getStDescripcion()!= null ?
                                                   obclsTratos.getStDescripcion(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <table class=\"table table-bordered table-responsive\" >\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Codigo </td>\n");
      out.write("                                        <td>Importe </td>\n");
      out.write("                                        <td>Nombre </td>\n");
      out.write("                                        <td>FechaCierre </td>\n");
      out.write("                                        <td>NumeroCuenta </td>\n");
      out.write("                                        <td>ddlFase</td>\n");
      out.write("                                        <td>ddlTipo</td>\n");
      out.write("                                        <td>Probabilidad</td>\n");
      out.write("                                        <td>siguientePaso</td>\n");
      out.write("                                        <td>IngresosEsperados</td>\n");
      out.write("                                        <td>ddlFuentePosibleCliente</td>\n");
      out.write("                                        <td>FuenteCampaña</td>\n");
      out.write("                                        <td>NombreContacto</td>\n");
      out.write("                                        <td>Descripcion</td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                        for (Models.clsTratos item : lstclsTratos) {
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print(item.getInCodigo());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStImporte());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStNombre());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStFechaCierre());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStNumeroCuenta());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getObclsFaseTrato().getStDescripcion() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getObclsTipoTrato().getStDescripcion() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getDbProbabilidad());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStSiguientePaso());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getDbIngresosEsperados());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getObclsFuentePosibleCliente().getStDescripcion() );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStFuenteCampaña());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(item.getStDescripcion());
      out.write("</td>\n");
      out.write("                                        <td>           \n");
      out.write("                                            <a href=\"TratosController?stopcion=M&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <a href=\"TratosController?stopcion=E&codigoSelecionado=");
      out.print( item.getInCodigo());
      out.write("\" class=\"btn btn-danger btn-sm\">Eliminar</a>\n");
      out.write("\n");
      out.write("                                        </td> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                        }

                                    
      out.write("\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>  \n");
      out.write("                    </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>                \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
