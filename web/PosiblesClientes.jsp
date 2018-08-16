<%-- 
    Document   : PosiblesClientes
    Created on : 7/03/2018, 11:16:01 PM
    Author     : David
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>REGISTRO EMPRESA</title>
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
                
                <div class="card-body">
                    <form action="PosiblesClientesController" method="POST">
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-6">
                                    <input type="submit" value="Guardar" class="btn btn-primary" 
                                           name="btnGuardar"/>
                                    <input type="submit" value="Modificar" class="btn btn-primary" 
                                           name="btnModificar"/>
                                    <input type="submit" value="Cancelar" class="btn btn-primary" 
                                           name="btnCancelar"/>
                                    <a class="btn btn-primary" href="Index.jsp">Volver</a>
                                    <input type="text"
                                           name="codigoModificar"
                                           id="codigoModificar"
                                           value="<%= obclsPosiblesClientes.getInCodigo()%>"
                                           hidden=""/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Empresa dedicada a ofertas de alojamientos a particulares y turistas</h1>                                
                            </div>
                        </div>
                        <!-- FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="nombreAlojamiento">nombreAlojamiento</label>
                                    <input type="text" placeholder="Nombre Alojamiento" 
                                           name="txtnombreAlojamiento" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstNombrealojamiento()!= null ?
                                                   obclsPosiblesClientes.getstNombrealojamiento(): ""%>"/>
                                </div>
                                <!-- COLUMNA -->
                                <div class="col-md-3">
                                    <label name="lblUbicacion">Ubicacion</label>
                                    <input type="text" placeholder="Ubicacion" 
                                           name="txtUbicacion" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getSubicacion()!= null ?
                                                   obclsPosiblesClientes.getSubicacion(): ""%>"/>
                                </div>
                              
                                <div class="col-md-3">
                                    <label name="lblcantidadDe">cantidad de</label>
                                   <label name="lblHuespedes">Huespedes</label>
                                    <input type="text" placeholder="Huespedes" 
                                           name="txtHuespedes" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstHuesped()!= null ?
                                                   obclsPosiblesClientes.getstHuesped(): ""%>"/>
                                   
                                    <label name="lbldormitorio">Dormitorio</label>
                                    <input type="text" placeholder="Dormitorio" 
                                           name="txtdormitorio" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getStstDormitorioso()!= null ?
                                                   obclsPosiblesClientes.getStstDormitorioso(): ""%>"/>
                                    <label name="lblCamas">Camas</label>
                                    <input type="text" placeholder="Camas" 
                                           name="txtCamas" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstcamas()!= null ?
                                                   obclsPosiblesClientes.getstcamas(): ""%>"/>
                                    <label name="lblBaños">Baños</label>
                                    <input type="text" placeholder="Baños" 
                                           name="txtBaños" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstbaños()!= null ?
                                                   obclsPosiblesClientes.getstbaños(): ""%>"/>
                                </div>
                                
                               
                            </div>
                        </div>

                        
                                
                               
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-4">
                                    <label name="Descrpicion ">Descripciongeneral</label>
                                    <input type="text" placeholder="descripcion generall" 
                                           name="txtDescripcion" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstDescripcion()!= null ?
                                                   obclsPosiblesClientes.getstDescripcion(): ""%>"/>
                                </div>
                                <div class="col-md-4">
                                    <label name="lugar">El lugar</label>
                                    <input type="text" placeholder="Lugar" 
                                           name="txtlugar" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstLugar()!= null ?
                                           obclsPosiblesClientes.getstLugar(): ""%>"/>
                                </div>
                                 <div class="col-md-4">
                                    <label name="Atencion">Atencion a los huepedes</label>
                                    <input type="text" placeholder="Atencion a los huepedes" 
                                           name="txtAtencion" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstAtencion()!= null ?
                                           obclsPosiblesClientes.getstAtencion(): ""%>"/>
                                </div>
                                 <div class="col-md-4">
                                    <label name="aspectos">Otros aspectos acpectos destacables</label>
                                    <input type="text" placeholder="Lugar" 
                                           name="txtaspectos" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstotrosAspectos()!= null ?
                                           obclsPosiblesClientes.getstotrosAspectos(): ""%>"/>
                                </div>
                                 <div class="col-md-4">
                                    <label name="lugar">servicio que ofrece</label>
                                    <input type="text" placeholder="Servicio" 
                                           name="txtservicio" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstservicioOfrece()!= null ?
                                           obclsPosiblesClientes.getstservicioOfrece(): ""%>"/>
                                </div>
                                 <div class="col-md-4">
                                    <label name="lugar">valor noche</label>
                                    <input type="text" placeholder="valor" 
                                           name="txtvalor" 
                                           class="form-control"
                                           value="<%= obclsPosiblesClientes.getstvalorNoche()!= null ?
                                           obclsPosiblesClientes.getstvalorNoche(): ""%>"/>
                                </div>
                               
                            </div>
                        </div>

                        <!-- FILA -->
                        <div class="form-group">                            
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-12">
                                    <b>
                                        <i class="fa fa-clipboard"></i>
                                    Registros: <%= lstclsPosiblesClientes.size()%>
                                    </b>
                                </div>
                            </div>
                        </div>

                        <!-- FILA -->
                        <div class="form-group">                            
                            <div class="form-row">
                                <!-- COLUMNA -->
                                <div class="col-12">
                                    <table class="table table-bordered                                            
                                           table-responsive">
                                        <!-- FILA -->
                                        <tr> 
                                            <!-- COLUMNA -->
                                            <td>Nombre alojamiento</td>
                                            <td>Ubicacion</td>
                                            <td>huespedes</td>
                                            <td>Dormitorios</td>
                                            <td>Camas</td>
                                            <td>Baños</td>
                                            <td>Descripcion general</td>
                                            <td>El lugar</td>
                                            <td>Atencion a los huespedes</td>
                                            <td>Otros aspectos destacables</td>
                                            <td>Servicio que ofrece</td>
                                            <td>Valor por noche</td>
                                           
                                        </tr>
                                        <%
                                            for (Models.clsPosiblesClientes item : lstclsPosiblesClientes) {
                                               
                                        %>
                                        <tr>
                                            <td><%= item.getstNombrealojamiento()%></td>
                                            <td><%= item.getSubicacion()%></td>
                                            <td><%= item.getstHuesped()%></td>
                                            <td><%= item.getStstDormitorioso()%></td>
                                            <td><%= item.getstcamas()%></td>
                                            <td><%= item.getstbaños()%></td>
                                            <td><%= item.getstDescripcion()%></td>
                                            <td><%= item.getstLugar()%></td>
                                            <td><%= item.getstAtencion()%></td>
                                           <td><%= item.getstHuesped()%></td>
                                            <td><%= item.getstotrosAspectos()%></td>
                                            <td><%= item.getstservicioOfrece()%></td>
                                            <td><%= item.getstvalorNoche()%></td>
                                            <td>
                                              
                                                
                                                <a href="PosiblesClientesController?stopcion=M&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-success btn-sm">Modificar</a>


                                                <a href="PosiblesClientesController?stopcion=E&codigoSelecionado=<%= item.getInCodigo()%>" class="btn btn-danger btn-sm">Eliminar</a>


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
