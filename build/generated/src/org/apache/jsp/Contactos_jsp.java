package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;

public final class Contactos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contactos</title>\n");
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
      out.write("         <!-- SCRIPTLETS -->\n");
      out.write("       \n");
      out.write("          ");

          Models.clsContactos obclsContactos =  new Models.clsContactos();
                                 
            if(request.getAttribute("obclsContactos") != null){
                obclsContactos =(Models.clsContactos) 
                        request.getAttribute("obclsContactos");
            }  
            

         //INSTANCIO LSITA DE OBJETO
            List<Models.clsContactos> lstclsContactos = new ArrayList<Models.clsContactos>();

            //VALIDO QUE LA VARIABLE DE SESION CONTENGA VALORES
            if (session.getAttribute("session_lstclsContactos") != null) {
                //REALIZO CAST PARA DEFINIR QUE TIPO DE OBJETO ALMACENA LA VARIABLE DE SESION
                //ASIGNO VARIABLE DE SESION A OBJETO
                lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");
            }
        
      out.write("\n");
      out.write("         \n");
      out.write("         ");

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
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <b>Contactos - Registros: (");
      out.print(lstclsContactos.size());
      out.write(")</b>\n");
      out.write("                    <p>\n");
      out.write("                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, \n");
      out.write("                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr \n");
      out.write("                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus \n");
      out.write("                        contactos o posibles clientes a través de un evento.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"card-header\">Crear Contacto</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"ContactosController\" method=\"POST\">\n");
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
      out.write("                                <h1>Información sobre el contacto</h1>                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFuentePosibleCliente\">Fuente de posible cliente</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlFuentePosibleCliente\">\n");
      out.write("                                        <option value=\"-1\"");
      out.print( obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == -1 ? "selected" : "" : "" );
      out.write(">Seleccione</option>\n");
      out.write("                                        <option value=\"1\"");
      out.print( obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">Ninguno</option>\n");
      out.write("                                        <option value=\"2\"");
      out.print( obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Aviso</option>\n");
      out.write("                                        <option value=\"3\"");
      out.print( obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Llamada no solicitada</option>\n");
      out.write("                                        <option value=\"4\"");
      out.print( obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Recomendacion de empleado</option>\n");
      out.write("                                        <option value=\"5\"");
      out.print( obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Recomendacion externa</option>\n");
      out.write("                                        <option value=\"6\"");
      out.print( obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 6 ? "selected" : "" : "" );
      out.write(">Tienda en linea</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNombre\">Nombre</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Nombre\" name=\"txtNombre\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStNombres()!= null ?
                                                   obclsContactos.getStNombres(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblApellidos\">Apellidos</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Apellidos\" name=\"txtApellidos\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStApellidos()!= null ?
                                                   obclsContactos.getStApellidos(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNumeroCuenta\">Numero de cuenta</label>\n");
      out.write("                                    <input type=\"text\"  placeholder=\"Numero de cuenta\" name=\"txtNumeroCuenta\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStNumeroCuenta()!= null ?
                                                   obclsContactos.getStNumeroCuenta(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTitulo\">Titulo</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Titulo\" name=\"txtTitulo\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStTitulo()!= null ?
                                                   obclsContactos.getStTitulo(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCorreoElectronico\">Correo electronico</label>\n");
      out.write("                                    <input type=\"email\" required=\"\" placeholder=\"Correo electronico\" name=\"txtCorreoElectronico\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStCorreo()!= null ?
                                                   obclsContactos.getStCorreo(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblDepartamento\">Departamento</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Departamento\" name=\"txtDepartamento\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStDepartamento()!= null ?
                                                   obclsContactos.getStDepartamento(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTelefono\">Telefono</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Telefono\" name=\"txtTelefono\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStTelefono()!= null ?
                                                   obclsContactos.getStTelefono(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTelefonoParticular\">Telefono particular</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Telefono particular\" name=\"txtTelefonoParticular\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStTelefonoParticular()!= null ?
                                                   obclsContactos.getStTelefonoParticular(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblOtroTelefono\">Otro telefono</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Otro telefono\" name=\"txtOtroTelefono\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStOtroTelefono()!= null ?
                                                   obclsContactos.getStOtroTelefono(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFax\">Fax</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Fax\" name=\"txtFax\" class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStFax()!= null ?
                                                   obclsContactos.getStFax(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblMovil\">Movil</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Movil\" name=\"txtMovil\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStMovil()!= null ?
                                                   obclsContactos.getStMovil(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFechaNacimiento\">Fecha de nacimiento</label>\n");
      out.write("                                    <input type=\"date\" name=\"txtFechaNacimiento\" class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStFechaNacimiento()!= null ?
                                                   obclsContactos.getStFechaNacimiento(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblAsistente\">Asistente</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Asistente\" name=\"txtAsistente\" class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStAsistente()!= null ?
                                                   obclsContactos.getStAsistente(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTelefonoAsistente\">N° de telefono del asistente</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"N° de telefono del asistente\" name=\"txtTelefonoAsistente\"\n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStTelefonoAsistente()!= null ?
                                                   obclsContactos.getStTelefonoAsistente(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblRespondeA\">Responde a</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Responde a\" name=\"txtRespondeA\" class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStRespondeA()!= null ?
                                                   obclsContactos.getStRespondeA(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA -->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNoParticipacionCorreoElectronico\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"chkNoParticipacionCorreoElectronico\"\n");
      out.write("                                                ");
      out.print( obclsContactos.getChNoParticipacionCorreo()== 'S' ? "checked" : ""  );
      out.write("/> \n");
      out.write("                                        No participacion correo electronico\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblIDSkype\">ID de Skype</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"ID de Skype\" name=\"txtIDSkype\" class=\"form-control\"\n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStIdSkype()!= null ?
                                                   obclsContactos.getStIdSkype(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- COLUMNA -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCorreoElectronicoSecundario\">Correo electronico secundario</label>\n");
      out.write("                                    <input type=\"email\" required=\"\"placeholder=\"Correo electronico secundario\" name=\"txtCorreoElectronicoSecundario\" \n");
      out.write("                                           class=\"form-control\" \n");
      out.write("                                            value=\"");
      out.print( obclsContactos.getStCorreoSecundario()!= null ?
                                                   obclsContactos.getStCorreoSecundario(): "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-goup\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <table class=\"table table-bordered table-responsive\">\n");
      out.write("                                        <tr> <!--fila--> \n");
      out.write("                                        <td>Codigo</td>\n");
      out.write("                                        <td>Fuente Posibles Clientes</td>\n");
      out.write("                                        <td>Nombres</td>    \n");
      out.write("                                        <td>Apellidos</td>\n");
      out.write("                                        <td>NumeroCuenta</td>\n");
      out.write("                                        <td>Titulo</td>\n");
      out.write("                                        <td>Correo</td>\n");
      out.write("                                        <td>Departamento</td> \n");
      out.write("                                        <td>Telefono</td>\n");
      out.write("                                        <td>TelefonoParticular</td>\n");
      out.write("                                        <td>OtroTelefono</td>\n");
      out.write("                                        <td>Fax</td>\n");
      out.write("                                        <td>Movil</td>\n");
      out.write("                                        <td>FechaNacimiento</td>\n");
      out.write("                                        <td>Asistente</td>\n");
      out.write("                                        <td>TelefonoAsistente</td>\n");
      out.write("                                        <td>RespondeA</try>\n");
      out.write("                                        <td>ParticipacionCorreo</td>\n");
      out.write("                                        <td>IdSkype</td>\n");
      out.write("                                        <td>CorreoSecundario</td>\n");
      out.write("\n");
      out.write("                                        </tr> <!--columna-->\n");
      out.write("\n");
      out.write("                                        ");

                                            for (Models.clsContactos item :lstclsContactos) {
                                                
                                        
      out.write(" \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(item.getInCodigo());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getObclsFuentePosibleCliente().getStDescripcion() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStNombres());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStApellidos());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStNumeroCuenta());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStTitulo());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStCorreo());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStDepartamento());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStTelefono());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStTelefonoParticular());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStOtroTelefono());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStFax());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStMovil());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStFechaNacimiento());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStAsistente());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStTelefonoAsistente());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStRespondeA());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getChNoParticipacionCorreo());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStIdSkype());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(item.getStCorreoSecundario());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"ContactosController?stopcion=M&codigoSelecionado=");
      out.print(item.getInCodigo());
      out.write("\" class=\"btn btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                           \n");
      out.write("                                                <a href=\"ContactosController?stopcion=E&codigoSelecionado=");
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
      out.write("                                    </table>\n");
      out.write("                                    \n");
      out.write("                                </div>                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
