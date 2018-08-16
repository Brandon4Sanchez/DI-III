<%-- 
    Document   : Contactos
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
        <title>Contactos</title>
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
         <!-- SCRIPTLETS -->
       
          <%
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
        %>
         
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
                <div class="card-header">
                    <b>Contactos - Registros: (<%=lstclsContactos.size()%>)</b>
                    <p>
                        Los eventos establecen los foros para dar a conocer las tendencias influencian el futuro, 
                        reforzar habilidades en sesiones de trabajo, conocer los principales proveedores y lograr 
                        contactos con otros usuarios, compañeros del entorno y colegas estrechando lazos con sus 
                        contactos o posibles clientes a través de un evento.
                    </p>
                </div>
                
                
                <div class="card-header">Crear Contacto</div>
                <div class="card-body">
                    <form action="ContactosController" method="POST">
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
                                           value="<%= obclsContactos.getInCodigo()%>"
                                           hidden=""/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Información sobre el contacto</h1>                                
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblFuentePosibleCliente">Fuente de posible cliente</label>
                                    <select class="form-control" name="ddlFuentePosibleCliente">
                                        <option value="-1"<%= obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == -1 ? "selected" : "" : "" %>>Seleccione</option>
                                        <option value="1"<%= obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 1 ? "selected" : "" : "" %>>Ninguno</option>
                                        <option value="2"<%= obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 2 ? "selected" : "" : "" %>>Aviso</option>
                                        <option value="3"<%= obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 3 ? "selected" : "" : "" %>>Llamada no solicitada</option>
                                        <option value="4"<%= obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 4 ? "selected" : "" : "" %>>Recomendacion de empleado</option>
                                        <option value="5"<%= obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 5 ? "selected" : "" : "" %>>Recomendacion externa</option>
                                        <option value="6"<%= obclsContactos.getObclsFuentePosibleCliente()!= null ? obclsContactos.getObclsFuentePosibleCliente().getInCodigo() == 6 ? "selected" : "" : "" %>>Tienda en linea</option>
                                    </select>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblNombre">Nombre</label>
                                    <input type="text" placeholder="Nombre" name="txtNombre" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStNombres()!= null ?
                                                   obclsContactos.getStNombres(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblApellidos">Apellidos</label>
                                    <input type="text" placeholder="Apellidos" name="txtApellidos" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStApellidos()!= null ?
                                                   obclsContactos.getStApellidos(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblNumeroCuenta">Numero de cuenta</label>
                                    <input type="text"  placeholder="Numero de cuenta" name="txtNumeroCuenta" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStNumeroCuenta()!= null ?
                                                   obclsContactos.getStNumeroCuenta(): ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblTitulo">Titulo</label>
                                    <input type="text" placeholder="Titulo" name="txtTitulo" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStTitulo()!= null ?
                                                   obclsContactos.getStTitulo(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblCorreoElectronico">Correo electronico</label>
                                    <input type="email" required="" placeholder="Correo electronico" name="txtCorreoElectronico" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStCorreo()!= null ?
                                                   obclsContactos.getStCorreo(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblDepartamento">Departamento</label>
                                    <input type="text" placeholder="Departamento" name="txtDepartamento" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStDepartamento()!= null ?
                                                   obclsContactos.getStDepartamento(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblTelefono">Telefono</label>
                                    <input type="text" placeholder="Telefono" name="txtTelefono" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStTelefono()!= null ?
                                                   obclsContactos.getStTelefono(): ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblTelefonoParticular">Telefono particular</label>
                                    <input type="text" placeholder="Telefono particular" name="txtTelefonoParticular" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStTelefonoParticular()!= null ?
                                                   obclsContactos.getStTelefonoParticular(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblOtroTelefono">Otro telefono</label>
                                    <input type="text" placeholder="Otro telefono" name="txtOtroTelefono" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStOtroTelefono()!= null ?
                                                   obclsContactos.getStOtroTelefono(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblFax">Fax</label>
                                    <input type="text" placeholder="Fax" name="txtFax" class="form-control"
                                            value="<%= obclsContactos.getStFax()!= null ?
                                                   obclsContactos.getStFax(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblMovil">Movil</label>
                                    <input type="text" placeholder="Movil" name="txtMovil" 
                                           class="form-control"
                                            value="<%= obclsContactos.getStMovil()!= null ?
                                                   obclsContactos.getStMovil(): ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblFechaNacimiento">Fecha de nacimiento</label>
                                    <input type="date" name="txtFechaNacimiento" class="form-control"
                                            value="<%= obclsContactos.getStFechaNacimiento()!= null ?
                                                   obclsContactos.getStFechaNacimiento(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblAsistente">Asistente</label>
                                    <input type="text" placeholder="Asistente" name="txtAsistente" class="form-control"
                                            value="<%= obclsContactos.getStAsistente()!= null ?
                                                   obclsContactos.getStAsistente(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblTelefonoAsistente">N° de telefono del asistente</label>
                                    <input type="text" placeholder="N° de telefono del asistente" name="txtTelefonoAsistente"
                                           class="form-control"
                                            value="<%= obclsContactos.getStTelefonoAsistente()!= null ?
                                                   obclsContactos.getStTelefonoAsistente(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblRespondeA">Responde a</label>
                                    <input type="text" placeholder="Responde a" name="txtRespondeA" class="form-control"
                                            value="<%= obclsContactos.getStRespondeA()!= null ?
                                                   obclsContactos.getStRespondeA(): ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblNoParticipacionCorreoElectronico">
                                        <input type="checkbox" name="chkNoParticipacionCorreoElectronico"
                                                <%= obclsContactos.getChNoParticipacionCorreo()== 'S' ? "checked" : ""  %>/> 
                                        No participacion correo electronico
                                    </label>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblIDSkype">ID de Skype</label>
                                    <input type="text" placeholder="ID de Skype" name="txtIDSkype" class="form-control"
                                            value="<%= obclsContactos.getStIdSkype()!= null ?
                                                   obclsContactos.getStIdSkype(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblCorreoElectronicoSecundario">Correo electronico secundario</label>
                                    <input type="email" required=""placeholder="Correo electronico secundario" name="txtCorreoElectronicoSecundario" 
                                           class="form-control" 
                                            value="<%= obclsContactos.getStCorreoSecundario()!= null ?
                                                   obclsContactos.getStCorreoSecundario(): ""%>"/>
                                </div>
                            </div>
                        </div>


                        <div class="form-goup">
                            <div class="form-row">
                                <div class="col-md-12">
                                    <table class="table table-bordered table-responsive">
                                        <tr> <!--fila--> 
                                        <td>Codigo</td>
                                        <td>Fuente Posibles Clientes</td>
                                        <td>Nombres</td>    
                                        <td>Apellidos</td>
                                        <td>NumeroCuenta</td>
                                        <td>Titulo</td>
                                        <td>Correo</td>
                                        <td>Departamento</td> 
                                        <td>Telefono</td>
                                        <td>TelefonoParticular</td>
                                        <td>OtroTelefono</td>
                                        <td>Fax</td>
                                        <td>Movil</td>
                                        <td>FechaNacimiento</td>
                                        <td>Asistente</td>
                                        <td>TelefonoAsistente</td>
                                        <td>RespondeA</try>
                                        <td>ParticipacionCorreo</td>
                                        <td>IdSkype</td>
                                        <td>CorreoSecundario</td>

                                        </tr> <!--columna-->

                                        <%
                                            for (Models.clsContactos item :lstclsContactos) {
                                                
                                        %> 
                                        <tr>
                                            <td><%=item.getInCodigo()%></td>
                                            <td><%=item.getObclsFuentePosibleCliente().getStDescripcion() %></td>
                                            <td><%=item.getStNombres()%></td>
                                            <td><%=item.getStApellidos()%></td>
                                            <td><%=item.getStNumeroCuenta()%></td>
                                            <td><%=item.getStTitulo()%></td>
                                            <td><%=item.getStCorreo()%></td>
                                            <td><%=item.getStDepartamento()%></td>
                                            <td><%=item.getStTelefono()%></td>
                                            <td><%=item.getStTelefonoParticular()%></td>
                                            <td><%=item.getStOtroTelefono()%></td>
                                            <td><%=item.getStFax()%></td>
                                            <td><%=item.getStMovil()%></td>
                                            <td><%=item.getStFechaNacimiento()%></td>
                                            <td><%=item.getStAsistente()%></td>
                                            <td><%=item.getStTelefonoAsistente()%></td>
                                            <td><%=item.getStRespondeA()%></td>
                                            <td><%=item.getChNoParticipacionCorreo()%></td>
                                            <td><%=item.getStIdSkype()%></td>
                                            <td><%=item.getStCorreoSecundario()%></td>

                                            <td>
                                                <a href="ContactosController?stopcion=M&codigoSelecionado=<%=item.getInCodigo()%>" class="btn btn-success btn-sm">Modificar</a>

                                                        
                                           
                                                <a href="ContactosController?stopcion=E&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-danger btn-sm">Eliminar</a>


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



