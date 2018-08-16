<%-- 
    Document   : Llamadas
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
        <title>Llamadas</title>
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
        %>

        <!-- SCRIPTLETS -->
        <%
            if (request.getAttribute("stMensaje") != null) {
        %>     
        <input type="text" hidden="" id="txtMensaje" value="<%=request.getAttribute("stMensaje").toString()%>"/>
        <input type="text" hidden="" id="txtTipo" value="<%=request.getAttribute("stTipo").toString()%>"/>
        <script>
            swal("Mensaje", document.getElementById("txtMensaje").value, document.getElementById("txtTipo").value);
        </script>
        <%
            }
        %>     


        <div class="container">
            <div class="card mx-auto mt-5">
                <div class="card-header">Crear llamada</div>
                <div class="card-body">
                    <b>Llamadas - Registros: (<%=lstclsLlamadas.size()%>)</b>
                    <p>      
                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, 
                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr 
                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus 
                        contactos o posibles clientes a través de un evento.
                    </p>
                </div>

                <form action="LlamadasController" method="POST">
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
                                           id="codigoModificar"
                                           value="<%= obclsLlamadas.getInCodigo()%>"
                                           hidden=""/>
                            </div>
                        </div>
                    </div>
                    <!-- FILA -->
                    <div class="form-group">
                        <div class="form-row">
                            <h1>Información sobre la llamada</h1>                                
                        </div>
                    </div>
                    <!-- FILA -->
                    <div class="form-group">
                        <div class="form-row">
                            <!-- COLUMNA -->
                            <div class="col-md-6">
                                <label name="lblNombreContacto">Nombre de contacto</label>
                                <input type="text" placeholder="Nombre de contacto" name="txtNombreContacto" 
                                       class="form-control"
                                         value="<%= obclsLlamadas.getStContacto()!= null ?
                                                   obclsLlamadas.getStContacto(): ""%>"/>
                            </div>
                            <!-- COLUMNA -->
                            <div class="col-md-6">
                                <label name="lblAsunto">Asunto</label>
                                <input type="text" placeholder="Asunto" name="txtAsunto" 
                                       class="form-control"
                                       value="<%= obclsLlamadas.getStAsunto()!= null ?
                                                   obclsLlamadas.getStAsunto(): ""%>"/>
                            </div>
                        </div>
                    </div>
                    <!-- FILA -->
                    <div class="form-group">
                        <div class="form-row">
                            <!-- COLUMNA -->
                            <div class="col-md-6">
                                <label name="lblProposito">Proposito de la llamada</label>
                                <select class="form-control" name="ddlProposito">
                                    <option value="-1"<%= obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == -1 ? "selected" : "" : "" %>>Seleccione</option>
                                    <option value="1"<%= obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 1 ? "selected" : "" : "" %>>Ninguno</option>
                                    <option value="2"<%= obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 2 ? "selected" : "" : "" %>>Posible</option>
                                    <option value="3"<%= obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 3 ? "selected" : "" : "" %>>Administrativo</option>
                                    <option value="4"<%= obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 4 ? "selected" : "" : "" %>>Negociacion</option>
                                    <option value="5"<%= obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 5 ? "selected" : "" : "" %>>Demostracion</option>
                                    <option value="6"<%= obclsLlamadas.getObclsProposito()!= null ? obclsLlamadas.getObclsProposito().getInCodigo() == 6 ? "selected" : "" : "" %>>Proyecto</option>
                                </select>
                            </div>
                            <!-- COLUMNA -->
                            <div class="col-md-6">
                                <label name="lblRelacionadoCon">Relacionado con</label>
                                <select name="ddlRelacionadoCon" class="form-control">
                                    <option value="-1"<%= obclsLlamadas.getObclsRelacionadoCon()!= null ? obclsLlamadas.getObclsRelacionadoCon().getInCodigo() == -1 ? "selected" : "" : "" %>>Seleccione</option>
                                    <option value="1"<%= obclsLlamadas.getObclsRelacionadoCon()!= null ? obclsLlamadas.getObclsRelacionadoCon().getInCodigo() == 1 ? "selected" : "" : "" %>>Posible cliente</option>
                                    <option value="2"<%= obclsLlamadas.getObclsRelacionadoCon()!= null ? obclsLlamadas.getObclsRelacionadoCon().getInCodigo() == 2 ? "selected" : "" : "" %>>Contacto</option>
                                    <option value="3"<%= obclsLlamadas.getObclsRelacionadoCon()!= null ? obclsLlamadas.getObclsRelacionadoCon().getInCodigo() == 3 ? "selected" : "" : "" %>>Otros</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <!-- FILA -->
                    <div class="form-group">
                        <div class="form-row">
                            <!-- COLUMNA -->
                            <div class="col-md-6">
                                <label name="lblTipo">Tipo de llamada</label><br/>
                                <input type="radio" name="rbTipo" value="1"/>Llamada actual<br/>
                                <input type="radio" name="rbTipo" value="2"/>Llamada completada<br/>
                                <input type="radio" name="rbTipo" value="3"/>Programar llamada<br/>
                                              
                            </div>
                            <!-- COLUMNA -->
                            <div class="col-md-6">
                                <label name="lblDetalles">Detalles de la llamada</label>                                   
                                <input type="text" placeholder="Detalles de la llamada" name="txtDetalles" 
                                       class="form-control"      
                                        value="<%= obclsLlamadas.getStDetalles()!= null ?
                                                   obclsLlamadas.getStDetalles(): ""%>"/>
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
                                        value="<%= obclsLlamadas.getStFecha()!= null ?
                                                   obclsLlamadas.getStFecha(): ""%>"/>
                            </div>
                            <!-- COLUMNA -->
                            <div class="col-md-6">
                                <label name="lblDuracion">Duración (Minutos)</label>                                   
                                <input type="text" placeholder="Duración (Minutos)" required="" name="txtDuracion"
                                       class="form-control"
                                       value="<%= obclsLlamadas.getInDuracion()%>"/>
                            </div>
                        </div>
                    </div> 
                    <!-- FILA -->
                    <div class="form-group">
                        <div class="form-row">
                            <div class="col-md-12">
                                <label name="lblDescripcion">Descripción</label>
                                <input type="text" placeholder="Descripcion" name="txtDescripcion" 
                                       class="form-control"
                                        value="<%= obclsLlamadas.getStDescripcion()!= null ?
                                                   obclsLlamadas.getStDescripcion(): ""%>"/>
                            </div>
                        </div>
                    </div>
                    <!-- FILA -->
                    <div class="form-group">
                        <div class="form-row">
                            <div class="col-md-12">
                                <label name="lblResultado">Resultado de la llamada</label>
                                <input type="text" placeholder="Resultado de la llamada" name="txtResultado" 
                                       class="form-control"
                                        value="<%= obclsLlamadas.getStResultado()!= null ?
                                                   obclsLlamadas.getStResultado(): ""%>"/>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="form-row">
                            <div class="col-md-12">

                                <table class="table table-bordered table-responsive
                                      
                                       table-responsive
                                       " >

                                    <tr>
                                         <td>Codigo </td>
                                        <td>NombreContacto </td>
                                        <td>Asunto </td>
                                        <td>ddlProposito </td>
                                        <td>lblRelacionadoCon </td>
                                        <td>rbTipo </td>
                                        <td>Detalles </td>
                                        <td>Fecha </td>
                                        <td>Duracion </td>
                                        <td>Descripcion</td>
                                        <td>Resultado</td>
                                    </tr>

                                    <%
                                   for (Models.clsLlamadas item : lstclsLlamadas) {
   
                                           
                                    %>
                                    <tr>

                                        <td><%=item.getInCodigo()%></td>
                                        <td><%=item.getStContacto()%></td>
                                        <td><%=item.getStAsunto()%></td>
                                        <td><%=item.getObclsProposito().getStDescripcion()%></td>
                                        <td><%=item.getObclsRelacionadoCon().getStDescripcion()%></td>
                                        <td><%=item.getObclsTipoLlamada()%></td>
                                        <td><%=item.getStDetalles()%></td>
                                        <td><%=item.getStFecha()%></td>
                                        <td><%=item.getInDuracion()%></td>
                                        <td><%=item.getStDescripcion()%></td>
                                        <td><%=item.getStResultado()%></td>
                                        <td>           


                                              <a href="LlamadasController?stopcion=M&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-success btn-sm">Modificar</a>


                                                <a href="LlamadasController?stopcion=E&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-danger btn-sm">Eliminar</a>

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