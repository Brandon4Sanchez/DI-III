<%-- 
    Document   : PosiblesClientes
    Created on : 7/03/2018, 11:16:01 PM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Consulta Posibles Clientes</title>
        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <link href="css/sweetalert.css" rel="stylesheet" type="text/css" />
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
    </head>
    <body>   
        <%
            String stEmpresa = "";
            String stNombre = "";
            String stApellidos = "";
            String stTitulo = "";
            String stCorreoElectronico = "";
            String stTelefono = "";
            String stFax = "";
            String stMovil = "";
            String stSitioWeb = "";
            String stFuentePosibleCliente = "";
            String stEstadoPosibleCliente = "";
            String stSector = "";

            int inCantidadEmpleados = 0;
            double dbIngresosAnuales = 0;
            String stCalificacion = "";
            String stNoParticipacionCorreoElectronico = "";

            String stIdSkype = "";
            String stTwitter = "";
            String stCorreoElectronicoSecundario = "";

            //CAMPOS DE TEXTO
            stEmpresa = request.getParameter("txtEmpresa") != null//CONDICION
                    ? request.getParameter("txtEmpresa").toString()//SI SE CUMPLE
                    : "";//SI NO SE CUMPLE

            stNombre = request.getParameter("txtNombre") != null
                    ? request.getParameter("txtNombre").toString()
                    : "";

            stApellidos = request.getParameter("txtApellidos") != null
                    ? request.getParameter("txtApellidos").toString()
                    : "";

            stTitulo = request.getParameter("txtTitulo") != null
                    ? request.getParameter("txtTitulo").toString()
                    : "";

            stCorreoElectronico = request.getParameter("txtCorreoElectronico") != null
                    ? request.getParameter("txtCorreoElectronico").toString()
                    : "";

            stTelefono = request.getParameter("txtTelefono") != null
                    ? request.getParameter("txtTelefono").toString()
                    : "";

            stFax = request.getParameter("txtFax") != null
                    ? request.getParameter("txtFax").toString()
                    : "";

            stMovil = request.getParameter("txtMovil") != null
                    ? request.getParameter("txtMovil").toString()
                    : "";

            stSitioWeb = request.getParameter("txtWeb") != null
                    ? request.getParameter("txtWeb").toString()
                    : "";

            stFuentePosibleCliente = request.getParameter("ddlFuentePosibleCliente") != null
                    ? request.getParameter("ddlFuentePosibleCliente").toString()
                    : "";

            stEstadoPosibleCliente = request.getParameter("ddlEstadoPosibleCliente") != null
                    ? request.getParameter("ddlEstadoPosibleCliente").toString()
                    : "";

            stSector = request.getParameter("ddlSector") != null
                    ? request.getParameter("ddlSector").toString()
                    : "";

            inCantidadEmpleados = request.getParameter("txtCantidadEmpleados") != null
                    ? Integer.parseInt(request.getParameter("txtCantidadEmpleados"))//CONVERSION ENTERO
                    : 0;

            dbIngresosAnuales = request.getParameter("txtIngresosAnuales") != null
                    ? Double.parseDouble(request.getParameter("txtIngresosAnuales"))//CONVERSION DOUBLE
                    : 0;

            stCalificacion = request.getParameter("ddlCalificacion") != null
                    ? request.getParameter("ddlCalificacion").toString()
                    : "";

            stNoParticipacionCorreoElectronico = request.getParameter("chkNoParticipacionCorreoElectronico") != null
                    ? request.getParameter("chkNoParticipacionCorreoElectronico").toString()
                    : "";

            stIdSkype = request.getParameter("txtIDSkype") != null
                    ? request.getParameter("txtIDSkype").toString()
                    : "";

            stTwitter = request.getParameter("txtTwitter") != null
                    ? request.getParameter("txtTwitter").toString()
                    : "";

            stCorreoElectronicoSecundario = request.getParameter("txtCorreoElectronicoSecundario") != null
                    ? request.getParameter("txtCorreoElectronicoSecundario").toString()
                    : "";
        %>


        <div class="container">
            <div class="card mx-auto mt-5">
                <div class="card-header">Crear Posibles Clientes</div>
                <div class="card-body">
                    <form>                       
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Informacion de Posible cliente</h1>                                
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblEmpresa">Empresa</label>
                                    <input type="text" 
                                           placeholder="Empresa" 
                                           name="txtEmpresaConsulta" 
                                           class="form-control" 
                                           required=""
                                           value="<%= stEmpresa %>"
                                           readonly="" />
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblNombre">Nombre</label>
                                    <input type="text" 
                                           placeholder="Nombre" 
                                           name="txtNombreConsulta" 
                                           class="form-control" 
                                           required=""
                                           value="<%= stNombre %>" 
                                           readonly="" />
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblApellidos">Apellidos</label>
                                    <input type="text" 
                                           placeholder="Apellidos" 
                                           name="txtApellidosConsulta" 
                                           class="form-control" 
                                           required=""
                                           value="<%= stApellidos %>"
                                           readonly=""
                                           />
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblTitulo">Titulo</label>
                                    <input type="text" 
                                           placeholder="Titulo" 
                                           name="txtTituloConsulta" 
                                           class="form-control"
                                           value="<%= stTitulo %>"
                                           readonly=""/>
                                </div>
                            </div>
                        </div>

                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblCorreoElectronico">Correo electronico</label>
                                    <input type="email" 
                                           placeholder="Correo electronico" 
                                           name="txtCorreoElectronicoConsulta" 
                                           class="form-control" 
                                           required=""  
                                           value="<%= stCorreoElectronico %>"
                                           readonly=""/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblTelefono">Telefono</label>
                                    <input type="text" 
                                           placeholder="Telefono" 
                                           name="txtTelefonoConsulta" 
                                           class="form-control"
                                           value="<%= stTelefono %>"
                                           readonly=""/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblFax">Fax</label>
                                    <input type="text" 
                                           placeholder="Fax" 
                                           name="txtFaxConsulta" 
                                           class="form-control"
                                           value="<%= stFax %>"
                                           readonly=""/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblMovil">Movil</label>
                                    <input type="text" 
                                           placeholder="Movil" 
                                           name="txtMovilConsulta" 
                                           class="form-control"
                                           value="<%= stMovil %>"
                                           readonly=""/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-3">
                                    <label name="lblSitioWeb">Sitio web</label>
                                    <input type="text" 
                                           placeholder="Sitio web" 
                                           name="txtSitioWebConsulta" 
                                           class="form-control"
                                           value="<%= stSitioWeb %>"
                                           readonly=""/>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblFuentePosibleCliente">Fuente de posible cliente</label>
                                    <select class="form-control" name="ddlFuentePosibleClienteConsulta" disabled="">
                                        <option value="1" <%= stFuentePosibleCliente.equals("1") ? "selected" : "" %> >
                                            None
                                        </option>
                                        <option value="2" <%= stFuentePosibleCliente.equals("2") ? "selected" : "" %> >Aviso</option>
                                        <option value="3" <%= stFuentePosibleCliente.equals("3") ? "selected" : "" %> >Llamada no solicitada</option>
                                        <option value="4" <%= stFuentePosibleCliente.equals("4") ? "selected" : "" %> >Recomendacion de empleado</option>
                                        <option value="5" <%= stFuentePosibleCliente.equals("5") ? "selected" : "" %> >Recomendacion externa</option>
                                        <option value="6" <%= stFuentePosibleCliente.equals("6") ? "selected" : "" %> >Tienda en linea</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblEstadoPosibleCliente">Estado de posible cliente</label>
                                    <select class="form-control" name="ddlEstadoPosibleClienteConsulta" disabled="" > 
                                        <option value="1" <%= stEstadoPosibleCliente.equals("1") ? "selected" : "" %> >None</option>
                                        <option value="2" <%= stEstadoPosibleCliente.equals("2") ? "selected" : "" %> >Intento de contacto</option>
                                        <option value="3" <%= stEstadoPosibleCliente.equals("3") ? "selected" : "" %> >Contactar en el futuro</option>
                                        <option value="4" <%= stEstadoPosibleCliente.equals("4") ? "selected" : "" %> >Contactado</option>
                                        <option value="5" <%= stEstadoPosibleCliente.equals("5") ? "selected" : "" %> >Posible cliente no solicitado</option>
                                        <option value="6" <%= stEstadoPosibleCliente.equals("6") ? "selected" : "" %> >Posible cliente perdido</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblSector">Sector</label>
                                    <select class="form-control" name="ddlSectorConsulta" disabled="" >
                                        <option value="1" <%= stSector.equals("1") ? "selected" : "" %> >None</option>
                                        <option value="2" <%= stSector.equals("2") ? "selected" : "" %> >APS (Proveedor de servicios de aplicaciones)</option>
                                        <option value="3" <%= stSector.equals("3") ? "selected" : "" %> >OEM de datos</option>
                                        <option value="4" <%= stSector.equals("4") ? "selected" : "" %> >ERP (Planificacion de recursos de empresa)</option>
                                        <option value="5" <%= stSector.equals("5") ? "selected" : "" %> >Gobierno/Ejercito</option>
                                        <option value="6" <%= stSector.equals("6") ? "selected" : "" %> >Empresa grande</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-3">
                                    <label name="lblCantidadEmpleados">Cantidad de empleados</label>
                                    <input type="number" 
                                           placeholder="Cantidad de empleados" 
                                           name="txtCantidadEmpleadosConsulta" 
                                           class="form-control"
                                           value="<%= inCantidadEmpleados %>"
                                           readonly=""/>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblIngresosAnuales">Ingresos anuales</label>
                                    <input type="number" 
                                           placeholder="Ingresos anuales" 
                                           name="txtIngresosAnualesConsulta" 
                                           class="form-control"
                                           value="<%= dbIngresosAnuales %>"
                                           readonly=""/>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblCalificacion">Calificacion</label>
                                    <select class="form-control" name="ddlCalificacionConsulta" disabled="" >
                                        <option value="1" <%= stCalificacion.equals("1") ? "selected" : "" %> >None</option>
                                        <option value="2" <%= stCalificacion.equals("2") ? "selected" : "" %> >Adquirido</option>
                                        <option value="3" <%= stCalificacion.equals("3") ? "selected" : "" %> >Activo</option>
                                        <option value="4" <%= stCalificacion.equals("4") ? "selected" : "" %> >Contactado</option>
                                        <option value="5" <%= stCalificacion.equals("5") ? "selected" : "" %> >Fallo de mercado</option>
                                        <option value="6" <%= stCalificacion.equals("6") ? "selected" : "" %> >Proyecto cancelado</option>
                                        <option value="7" <%= stCalificacion.equals("7") ? "selected" : "" %> >Apagar</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblNoParticipacionCorreoElectronico">
                                        <input type="checkbox" 
                                               name="chkNoParticipacionCorreoElectronicoConsulta"
                                               <%= stNoParticipacionCorreoElectronico.equals("on") ? "checked" : "" %>
                                               disabled=""/>    
                                        No participacion correo electronico
                                    </label>                                    
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-3">
                                    <label name="lblIDSkype">ID de Skype</label>
                                    <input type="text" 
                                           placeholder="ID de Skype" 
                                           name="txtIDSkypeConsulta" 
                                           class="form-control"
                                           value="<%= stIdSkype %>"
                                           readonly=""/>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblTwitter">Twitter</label>
                                    <input type="text" 
                                           placeholder="Twitter" 
                                           name="txtTwitterConsulta" 
                                           class="form-control"
                                           value="<%= stTwitter %>"
                                           readonly=""/>
                                </div>
                                <div class="col-md-6">
                                    <label name="lblCalificacion">Correo electronico secundario</label>
                                    <input type="email" 
                                           placeholder="Correo electronico secundario" 
                                           name="txtCorreoElectronicoSecundarioConsulta" 
                                           class="form-control"
                                           value="<%= stCorreoElectronicoSecundario %>"
                                           readonly=""/>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>                
            </div>
        </div>
    </body>
</html>
