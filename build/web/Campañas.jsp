<%-- 
    Document   : CampaÃ±as
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
        <title>Campanas</title>
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
                    <b>Campañas - Registros: (<%=lstclsCampanas.size()%>)</b>
                    <p>
                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, 
                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr 
                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus 
                        contactos o posibles clientes a traves de un evento.
                    </p>
                <div class="card-body">
                    <form action="CampanasController" method="POST">
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
                                   value="<%= obclsCampanas.getInCodigo()!= 0 ?
                                       obclsCampanas.getInCodigo(): ""%>" hidden=""/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Informacion sobre la campaña</h1>                                
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblTipo">Tipo</label>
                                    <select class="form-control" name="ddlTipo">
                                        <option value="-1"<%= obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == -1 ? "selected" : "" : "" %>>Seleccione</option>
                                        <option value="1"<%= obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 1 ? "selected" : "" : "" %>>Ninguno</option>
                                        <option value="2"<%= obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 2 ? "selected" : "" : "" %>>Conferencia</option>
                                        <option value="3"<%= obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 3 ? "selected" : "" : "" %>>Seminario web</option>
                                        <option value="4"<%= obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 4 ? "selected" : "" : "" %>>Exposicion comercial</option>
                                        <option value="5"<%= obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 5 ? "selected" : "" : "" %>>Relaciones publicas</option>
                                        <option value="6"<%= obclsCampanas.getObclsTipoCampana()!= null ? obclsCampanas.getObclsTipoCampana().getInCodigo() == 6 ? "selected" : "" : "" %>>Socios</option>
                                    </select>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblNombre">Nombre de campaña</label>
                                    <input type="text" placeholder="Nombre de campaña" name="txtNombre" class="form-control"
                                           value="<%= obclsCampanas.getStNombre() != null ?
                                                       obclsCampanas.getStNombre() : "" %>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblEstado">Estado</label>
                                    <select class="form-control" name="ddlEstado">
                                        <option value="-1"<%= obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == -1 ? "selected" : "" : "" %>>Seleccione</option>
                                        <option value="1"<%= obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 1 ? "selected" : "" : "" %>>Ninguno</option>
                                        <option value="2"<%= obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 2 ? "selected" : "" : "" %>>Planificacion</option>
                                        <option value="3"<%= obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 3 ? "selected" : "" : "" %>>Activo</option>
                                        <option value="4"<%= obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 4 ? "selected" : "" : "" %>>Inactivo</option>
                                        <option value="5"<%= obclsCampanas.getObclsEstadoCampana()!= null ? obclsCampanas.getObclsEstadoCampana().getInCodigo() == 5 ? "selected" : "" : "" %>>Completos</option>
                                    </select>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblFechaInicio">Fecha de inicio</label>
                                    <input type="date" placeholder="Fecha de inicio" name="txtFechaInicio" 
                                           class="form-control"
                                           value="<%= obclsCampanas.getStFechaInicio()!= null ?
                                                       obclsCampanas.getStFechaInicio() : "" %>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblFechaFinalizacion">Fecha de finalizacion</label>
                                    <input type="date" placeholder="Fecha de finalizacion" name="txtFechaFinalizacion" class="form-control"
                                           value="<%= obclsCampanas.getStFechaFinalizacion()!= null ?
                                                       obclsCampanas.getStFechaFinalizacion() : "" %>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblIngresosEsperados">Ingresos esperados</label>
                                    <input type="number" placeholder="Ingresos esperados" name="txtIngresosEsperados" class="form-control"
                                           value="<%= 
                                                       obclsCampanas.getDbIngresosEsperados()%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblCostePresupuestado">Coste presupuestado</label>
                                    <input type="number" placeholder="Coste presupuestado" name="txtCostePresupuestado" class="form-control"
                                           value="<%= 
                                                       obclsCampanas.getDbCostePresupuestado()%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblCosteReal">Coste real</label>
                                    <input type="number" placeholder="Coste real" name="txtCosteReal" class="form-control"
                                           value="<%= 
                                                       obclsCampanas.getDbCosteReal()%>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblRespuestaEsperada">Respuesta esperada</label>
                                    <input type="text" placeholder="Respuesta esperada" name="txtRespuestaEsperada" class="form-control"
                                           value="<%= obclsCampanas.getStRespuestaEsperada()!= null ?
                                                       obclsCampanas.getStRespuestaEsperada() : "" %>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblNumerosEnviados">Numeros enviados</label>
                                    <input type="number" placeholder="Numeros enviados" name="txtNumerosEnviados" class="form-control"
                                           value="<%= 
                                                       obclsCampanas.getInNumerosEnviados()%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblDescripcion">Descripcion</label>
                                    <input type="text" placeholder="Descripcion" name="txtDescripcion" class="form-control"
                                           value="<%= obclsCampanas.getStDescripcion()!= null ?
                                                       obclsCampanas.getStDescripcion() : "" %>"/>
                                </div>
                            </div>
                        </div> 
                        <!-- FILA -->
                        
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">
                                    <table class="table table-bordered table-responsive">
                                        <tr><!-- FILA -->
                                            <!-- COLUMNA -->
                                            <td>Codigo</td>
                                            <td>Tipo Campaña</td>
                                            <td>Nombre</td>
                                            <td>Estado Campaña</td>
                                            <td>Fecha Inicio</td>
                                            <td>Fecha Finalizacion</td>
                                            <td>Ingresos Esperados</td>
                                            <td>Coste Presupuestado</td>
                                            <td>Coste Real</td>
                                            <td>Respuesta Esperada</td>
                                            <td>Numeros Enviados</td>
                                            <td>Descripcion</td>
                                            <td>Opciones</td>
                                        </tr>
                                    <%
                                      for (Models.clsCampanas item : lstclsCampanas){
                                          
                                         
                                    %>
                                    <tr>
                                        <td><%= item.getInCodigo() %></td>
                                        <td><%= item.getObclsTipoCampana().getStDescripcion()%></td>
                                        <td><%= item.getStNombre()%></td>
                                        <td><%= item.getObclsEstadoCampana().getStDescripcion()%></td>
                                        <td><%= item.getStFechaInicio()%></td>
                                        <td><%= item.getStFechaFinalizacion()%></td>
                                        <td><%= item.getDbIngresosEsperados()%></td>
                                        <td><%= item.getDbCostePresupuestado()%></td>
                                        <td><%= item.getDbCosteReal()%></td>
                                        <td><%= item.getStRespuestaEsperada()%></td>
                                        <td><%= item.getInNumerosEnviados()%></td>
                                        <td><%= item.getStDescripcion()%></td>
                                        <td>
                                           
                                              <a href="CampanasController?stopcion=M&codigoSelecionado=<%=item.getInCodigo()%>" class="btn btn-success btn-sm">Modificar</a>


                                                <a href="CampanasController?stopcion=E&codigoSelecionado=<%=item.getInCodigo()%>" class="btn btn-danger btn-sm">Eliminar</a>

                                            </td> 
                                    </tr> 
                                    
                                    <%
                                        }
                                    %> 
                                    </table>
                    </form>
                </div>                
            </div>
        </div>
    </body>
</html>




