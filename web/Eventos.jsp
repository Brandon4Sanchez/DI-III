<%-- 
    Document   : Eventos
    Created on : 7/03/2018, 11:16:01 PM
    Author     : David
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Eventos</title>
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
        %>
        <input type="text" hidden="" id="txtMensaje"
               value="<%= request.getAttribute("stMensaje")%>"/>
        <input type="text" hidden="" id="txtTipo"
               value="<%= request.getAttribute("stTipo")%>"/>

        <script>
            var mensaje = document.getElementById("txtMensaje").value;
            var tipo = document.getElementById("txtTipo").value;

            swal("Mensaje", mensaje, tipo);
        </script>
        <%
            }
        %>
        <div class="container">
            <div class="card mx-auto mt-5">
                <div class="card-header">
                    <b>Eventos - Registros: (<%=lstclsEventos.size()%>)</b>
                    <p>
                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, 
                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr 
                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus 
                        contactos o posibles clientes a través de un evento.
                    </p>
                </div>
                <div class="card-body">
                    <form action="EventosController" method="POST">
                        <input type="text" hidden="" name="txtCodigo"/> 
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <input type="submit" value="Guardar" class="btn btn-primary" name="btnGuardar"/>
                                    <input type="submit" value="Modificar" class="btn btn-primary" name="btnModificar"/>
                                    <input type="submit" value="Cancelar" class="btn btn-primary" name="btnCancelar"/>
                                    <a href="Index.jsp" class="btn btn-primary">Volver</a>
                                    <input type="text"
                                   name="codigoModificar"
                                   value="<%= obclsEventos.getInCodigo()!= 0 ?
                                       obclsEventos.getInCodigo(): ""%>" hidden=""/>
                                    
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Información sobre el evento</h1>                                
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-12">
                                    <label name="lblNombre">Nuevo evento</label>
                                    <input type="text"placeholder="Nuevo evento" name="txtNombre" 
                                         class="form-control"
                                          value="<%= obclsEventos.getStNombre()!= null
                                                   ? obclsEventos.getStNombre(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-12">
                                    <label name="lblUbicacion">Ubicación</label>
                                    <input type="text" placeholder="Ubicación" name="txtUbicacion" 
                                           class="form-control"
                                           value="<%= obclsEventos.getStUbicacion() != null
                                                   ? obclsEventos.getStUbicacion() : ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-12">
                                    <label name="lblParticipantes">Participantes</label>
                                    <input type="text" placeholder="Participantes" name="txtParticipantes" 
                                           class="form-control"
                                           value="<%= obclsEventos.getStParticipantes() != null
                                                   ? obclsEventos.getStParticipantes() : ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-12">
                                    <label name="lblTodoDia">
                                        <input type="checkbox" name="chkTodoDia"/>
                                        <%= obclsEventos.getChTodoDia() == 'S' ? "checked" : ""%>/>    

                                        Todo el dia
                                    </label>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblFecha">Fecha</label>
                                    <input type="date" name="txtFecha" class="form-control"
                                           value="<%= obclsEventos.getStFecha() != null
                                                   ? obclsEventos.getStFecha() : ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblRelacionadoCon">Relacionado con</label>
                                    <select name="ddlRelacionadoCon" class="form-control">
                                        <option value="-1"<%= obclsEventos.getObclsRelacionadoCon() != null ? obclsEventos.getObclsRelacionadoCon().getInCodigo() == -1 ? "selected" : "" : ""%>>Seleccione</option>
                                        <option value="1"<%= obclsEventos.getObclsRelacionadoCon() != null ? obclsEventos.getObclsRelacionadoCon().getInCodigo() == 1 ? "selected" : "" : ""%>>Posible cliente</option>
                                        <option value="2"<%= obclsEventos.getObclsRelacionadoCon() != null ? obclsEventos.getObclsRelacionadoCon().getInCodigo() == 2 ? "selected" : "" : ""%>>Contacto</option>
                                        <option value="3"<%= obclsEventos.getObclsRelacionadoCon() != null ? obclsEventos.getObclsRelacionadoCon().getInCodigo() == 3 ? "selected" : "" : ""%>>Otros</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">
                                    <label name="lblDescripcion">Informacion de la descripcion</label>
                                    <input type="text" placeholder="Informacion de la descripcion" name="txtDescripcion" 
                                           class="form-control"
                                           value="<%= obclsEventos.getStDescripcion() != null
                                                   ? obclsEventos.getStDescripcion() : ""%>"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">

                                    <table class="table table-bordered" >

                                        <tr>

                                            <td>Codigo </td>
                                            <td>Nombre </td>
                                            <td>Ubicacion </td>
                                            <td>Participante </td>
                                            <td>Todo el dia </td>
                                            <td>Fecha </td>
                                            <td>RelacionadoCon</td>
                                            <td>Descripcion </td>
                                            <td>Opciones</td>
                                        </tr>

                                        <%
                                            for (Models.clsEventos item : lstclsEventos) {
                                        %>
                                        <tr>

                                            <td><%=item.getInCodigo()%></td>
                                            <td><%=item.getStNombre()%></td>
                                            <td><%=item.getStUbicacion()%></td>
                                            <td><%=item.getStParticipantes()%></td>
                                            <td><%=item.getChTodoDia()%></td>
                                            <td><%=item.getStFecha()%></td>
                                            <td><%=item.getObclsRelacionadoCon().getStDescripcion()%></td>
                                            <td><%=item.getStDescripcion()%></td>
                                            <td>         

                                                  <a href="EventosController?stopcion=M&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-success btn-sm">Modificar</a>


                                                <a href="EventosController?stopcion=E&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-danger btn-sm">Eliminar</a>

                                            </td> 


                                        </tr>

                                        <%
                                            }

                                        %>

                                    </table>
                                </div>
                            </div>
                        </div>




                    </form>
                </div>                
            </div>
        </div>
    </body>
</html>

