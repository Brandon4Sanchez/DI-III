<%-- 
    Document   : Tareas
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
        <title>Tareas</title>
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
            if (request.getAttribute("stMensaje") != null) {
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
        <%
            
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
        %>

        <div class="container">
            <div class="card mx-auto mt-5">
                <div class="card-header">Crear Tareas</div>
                <div class="card-body">
                    <b>Tareas - Registros: (<%=lstclsTareas.size()%>)</b>
                    <p>      
                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, 
                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr 
                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus 
                        contactos o posibles clientes a través de un evento.
                    </p>
                </div>

                <div class="card-body">
                    <form action="TareasController" method="POST">
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
                                           value="<%= obclsTareas.getInCodigo()%>"
                                           hidden=""/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Informacion sobre la tarea</h1>                                
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblTitular">Titular de la tarea</label>
                                    <input type="text" placeholder="Titular de la tarea" name="txtTitular" 
                                           class="form-control"
                                            value="<%= obclsTareas.getStTitular()!= null ?
                                                   obclsTareas.getStTitular(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblAsunto">Asunto</label>
                                    <input type="text" placeholder="Asunto" name="txtAsunto" 
                                           class="form-control"
                                           value="<%= obclsTareas.getStAsunto()!= null ?
                                                   obclsTareas.getStAsunto(): ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblFechaVencimiento">Fecha de vencimiento</label>
                                    <input type="date" name="txtFechaVencimiento" class="form-control"
                                           value="<%= obclsTareas.getStFechaVencimiento()!= null ?
                                                   obclsTareas.getStFechaVencimiento(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblContacto">Contacto</label>
                                    <input type="text" placeholder="Contacto" name="txtContacto" 
                                           class="form-control"
                                            value="<%= obclsTareas.getStContacto()!= null ?
                                                   obclsTareas.getStContacto(): ""%>"/>
                                           
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblCuenta">Cuenta</label>
                                    <input type="text" placeholder="Cuenta" name="txtCuenta" 
                                           class="form-control"
                                            value="<%= obclsTareas.getStCuenta()!= null ?
                                                   obclsTareas.getStCuenta(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblEstado">Estado</label>
                                    <select class="form-control" name="ddlEstado">
                                        <option value="-1"<%= obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == -1 ? "selected" : "" : "" %>>Seleccione</option>
                                        <option value="1"<%= obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 1 ? "selected" : "" : "" %>>No iniciado</option>
                                        <option value="2"<%= obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 2 ? "selected" : "" : "" %>>Aplazados</option>
                                        <option value="3"<%= obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 3 ? "selected" : "" : "" %>>En curso</option>
                                        <option value="4"<%= obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 4 ? "selected" : "" : "" %>>Completado</option>
                                        <option value="5"<%= obclsTareas.getObclsEstadoTarea()!= null ? obclsTareas.getObclsEstadoTarea().getInCodigo() == 5 ? "selected" : "" : "" %>>En espera de entrada</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <label name="lblPrioridad">Prioridad</label>
                                    <select class="form-control" name="ddlPrioridad">
                                        <option value="-1"<%= obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == -1 ? "selected" : "" : "" %>>Seleccione</option>
                                        <option value="1"<%= obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 1 ? "selected" : "" : "" %>>Alto</option>
                                        <option value="2"<%= obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 2 ? "selected" : "" : "" %>>Mas alto</option>
                                        <option value="3"<%= obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 3 ? "selected" : "" : "" %>>Bajo</option>
                                        <option value="4"<%= obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 4 ? "selected" : "" : "" %>>Mas bajo</option>
                                        <option value="5"<%= obclsTareas.getObclsPrioridad()!= null ? obclsTareas.getObclsPrioridad().getInCodigo() == 5 ? "selected" : "" : "" %>>Normal</option>
                                    </select>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-6"></div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label name="lblEnviarMensaje">
                                        <input type="checkbox" name="chkEnviarMensaje"
                           <%= obclsTareas.getChEnviarMensaje()== 'S' ? "checked" : ""  %>/>                     
                                               Enviar mensaje de correo electronico de notificacion
                                    </label>
                                </div>
                                <div class="col-md-6">
                                    <label name="lblRepetir">
                                        <input type="checkbox" name="chkRepetir"
                                               <%= obclsTareas.getChRepetir()== 'S' ? "checked" : ""  %>/>
                                               Repetir
                                    </label>
                                </div>                              
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">
                                    <label name="lblDescripcion">Informacion de la descripcion</label>
                                    <input type="text" placeholder="Informacion de la descripcion" 
                                           name="txtDescripcion" class="form-control"
                                            value="<%= obclsTareas.getStDescripcion()!= null ?
                                                   obclsTareas.getStDescripcion(): ""%>"/>
                                </div>
                            </div>
                        </div>


                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">

                                    <table class="table table-bordered table-responsive" >

                                        <tr>
                                            <td>Codigo </td>
                                            <td>Titular </td>
                                            <td>Asunto </td>
                                            <td>FechaVencimiento</td>
                                            <td>contacto </td>
                                            <td>Cuenta </td>
                                            <td>ddlEstado</td>
                                            <td>ddlPrioridad</td>
                                            <td>chkEnviarMensaje</td>
                                            <td>chkRepetir</td>
                                            <td>Descripcion</td>
                                        </tr>

                                        <%
                                            for (Models.clsTareas item : lstclsTareas) {
                                        %>
                                        <tr>

                                            <td><%=item.getInCodigo()%></td>
                                            <td><%=item.getStTitular()%></td>
                                            <td><%=item.getStAsunto()%></td>
                                            <td><%=item.getStFechaVencimiento()%></td>
                                            <td><%=item.getStCuenta()%></td>
                                            <td><%=item.getObclsEstadoTarea().getStDescripcion() %></td>
                                            <td><%=item.getObclsPrioridad().getStDescripcion() %></td>
                                            <td><%=item.getChEnviarMensaje()%></td>
                                            <td><%=item.getChRepetir()%></td>
                                            <td><%=item.getStDescripcion()%></td>
                                            <td>           

                                                  <a href="TareasController?stopcion=M&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-success btn-sm">Modificar</a>


                                                <a href="TareasController?stopcion=E&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-danger btn-sm">Eliminar</a>


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
