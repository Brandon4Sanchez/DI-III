/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author David
 */
@WebServlet(name = "TratosController", urlPatterns = {"/TratosController"})
public class TratosController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("btnGuardar") != null) {
            btnGuardar(request, response);

        } else if (request.getParameter("btnModificar") != null) {
             btnModificar(request, response);
            
        } else if (request.getParameter("btnCancelar") != null) {

        } else if (request.getParameter("codigoSelecionado") != null) {
            if (request.getParameter("stopcion").equals("M")) {
                cargarModificar(request, response);
            } else if (request.getParameter("stopcion").equals("E")) {
                btnEliminar(request, response);
            }
        }
    }

   
    public void btnModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
           
           
            List<Models.clsTratos> lstclsTratos= new ArrayList<Models.clsTratos>();
             Models.clsFaseTrato obclsFaseTrato = new Models.clsFaseTrato();
            Models.clsTipoTrato obclsTipoTrato = new Models.clsTipoTrato();
            Models.clsFuentePosibleCliente obclsFuentePosibleCliente = new Models.clsFuentePosibleCliente();
           
            HttpSession session = request.getSession(true);
             
            if(session.getAttribute("session_lstclsTratos")!=null){
               lstclsTratos=
                (List<Models.clsTratos>) session.getAttribute("session_lstclsTratos");
                
            } 
               int inPosicion = 0;
            for (Models.clsTratos item : lstclsTratos) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                   
                    break;    
                }
                inPosicion++;
            }
             
                if (request.getParameter("txtImporte") != null) {
                lstclsTratos.get(inPosicion).setStImporte(request.getParameter("txtImporte"));
            }
            if (request.getParameter("txtNombre") != null) {
                 lstclsTratos.get(inPosicion).setStNombre(request.getParameter("txtNombre"));
            }

            if (request.getParameter("txtFechaCierre") != null) {
                 lstclsTratos.get(inPosicion).setStFechaCierre(request.getParameter("txtFechaCierre"));
            }

            if (request.getParameter("txtNumeroCuenta") != null) {
                 lstclsTratos.get(inPosicion).setStNumeroCuenta(request.getParameter("txtNumeroCuenta"));
            }

            
             if (request.getParameter("ddlFase") != null) {
                 obclsFaseTrato.setInCodigo(Integer.parseInt(request.getParameter("ddlFase")));

                String stDescripcion = "";

                if (request.getParameter("ddlFase").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlFase").equals("2")) {
                    stDescripcion = "Clasificacion";
                } else if (request.getParameter("ddlFase").equals("3")) {
                    stDescripcion = "Necesita Analisis";
                     } else if (request.getParameter("ddlFase").equals("4")) {
                    stDescripcion = "Propuesta de valor";
                } else if (request.getParameter("ddlFase").equals("5")) {
                    stDescripcion = "identificar responsables";
                
                 } else if (request.getParameter("ddlFase").equals("6")) {
                    stDescripcion = "Cotizacion dee propuestas/precios";
                    }
                                
                obclsFaseTrato.setStDescripcion(stDescripcion);
                lstclsTratos.get(inPosicion).setObclsFaseTrato(obclsFaseTrato);
            }
            
             
             if (request.getParameter("ddlTipo") != null) {
                obclsTipoTrato.setInCodigo(Integer.parseInt(request.getParameter("ddlTipo")));

                String stDescripcion = "";

                if (request.getParameter("ddlTipo").equals("1")) {
                    stDescripcion = "Negocios existentes";
                } else if (request.getParameter("ddlTipo").equals("2")) {
                    stDescripcion = "Nuevo negocio";
                }          
                obclsTipoTrato.setStDescripcion(stDescripcion);
                lstclsTratos.get(inPosicion).setObclsTipoTrato(obclsTipoTrato);
            }
            
                         
             
            
             if (request.getParameter("ddlFuentePosibleCliente") != null) {
                 obclsFuentePosibleCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlFuentePosibleCliente")));

                String stDescripcion = "";

                if (request.getParameter("ddlFuentePosibleCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("2")) {
                    stDescripcion = "Aviso";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("3")) {
                    stDescripcion = "Llamadas no solisitada";
                     } else if (request.getParameter("ddlFuentePosibleCliente").equals("4")) {
                    stDescripcion = "Recomendacion de empleados";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("5")) {
                    stDescripcion = "Recomendacion de Externa";
                
                 } else if (request.getParameter("ddlFuentePosibleCliente").equals("6")) {
                    stDescripcion = "Tienda en linea";
                    }
                                
                obclsFuentePosibleCliente.setStDescripcion(stDescripcion);
                 lstclsTratos.get(inPosicion).setObclsFuentePosibleCliente(obclsFuentePosibleCliente);
            }
            
            
               if (request.getParameter("txtProbabilidad") != null) {
                 lstclsTratos.get(inPosicion).setDbProbabilidad(Integer.parseInt(request.getParameter("txtProbabilidad")));
            }
                if (request.getParameter("txtIngresosEsperados") != null) {
                 lstclsTratos.get(inPosicion).setDbIngresosEsperados(Integer.parseInt(request.getParameter("txtIngresosEsperados")));
            }
            
            if (request.getParameter("txtSiguientePaso") != null) {
                 lstclsTratos.get(inPosicion).setStSiguientePaso(request.getParameter("txtSiguientePaso"));
            }
            
            if (request.getParameter("txtFuenteCampana") != null) {
                 lstclsTratos.get(inPosicion).setStFuenteCampaña(request.getParameter("txtFuenteCampana"));
            }
            if (request.getParameter("txtNombreContacto") != null) {
                 lstclsTratos.get(inPosicion).setStNombreContacto(request.getParameter("txtNombreContacto"));
            }
            if (request.getParameter("txtDescripcion") != null) {
                 lstclsTratos.get(inPosicion).setStDescripcion(request.getParameter("txtDescripcion"));
            }
               
             session.setAttribute("session_lstclsTratos", lstclsTratos);
             request.setAttribute("stMensaje", "Se realizo procesos con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tratos.jsp").forward(request, response);
            
            
             } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Tratos.jsp").forward(request, response);
                 
        }
    }
    

    
    
    
    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsTratos obclsTratos = new Models.clsTratos();
            List<Models.clsTratos> lstclsTratos= new ArrayList<Models.clsTratos>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsTratos") != null) {
                lstclsTratos= (List<Models.clsTratos>) session.getAttribute("session_lstclsTratos");
            }

            int inPosicion = 0;
            for (Models.clsTratos item : lstclsTratos) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    lstclsTratos.remove(inPosicion);
                    break;    
                }
                inPosicion++;
            }

            session.setAttribute("session_lstclsTratos", lstclsTratos);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tratos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tratos.jsp").forward(request, response);
        }
    }
     
    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsTratos obclsTratos = new Models.clsTratos();
            List<Models.clsTratos> lstclsTratos = new ArrayList<Models.clsTratos>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsTratos") != null) {
                lstclsTratos = (List<Models.clsTratos>) session.getAttribute("session_lstclsTratos");
            }

            for (Models.clsTratos item : lstclsTratos) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    obclsTratos = item;

                }

            }
                             
            request.setAttribute("obclsTratos", obclsTratos);

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tratos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tratos.jsp").forward(request, response);
        }
    }
   

    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {

            //CREACION DE LA VARIABLE DE SESION
            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsTratos> lstclsTratos = new ArrayList<Models.clsTratos>();

            //OBJETOS
            Models.clsTratos obclsTratos = new Models.clsTratos();
            Models.clsFaseTrato obclsFaseTrato = new Models.clsFaseTrato();
            Models.clsTipoTrato obclsTipoTrato = new Models.clsTipoTrato();
            Models.clsFuentePosibleCliente obclsFuentePosibleCliente = new Models.clsFuentePosibleCliente();
            //VALIDACION DE DATOS ENVIADOS DESDE JSP
            if (request.getParameter("txtImporte") != null) {
                //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
                obclsTratos.setStNombre(request.getParameter("txtImporte"));
            } else {
                throw new Exception("Ingrese nombre del evento");
            }

            if (request.getParameter("txtImporte") != null) {
                obclsTratos.setStImporte(request.getParameter("txtImporte"));
            }
            if (request.getParameter("txtNombre") != null) {
                obclsTratos.setStNombre(request.getParameter("txtNombre"));
            }

            if (request.getParameter("txtFechaCierre") != null) {
                obclsTratos.setStFechaCierre(request.getParameter("txtFechaCierre"));
            }

            if (request.getParameter("txtNumeroCuenta") != null) {
                obclsTratos.setStNumeroCuenta(request.getParameter("txtNumeroCuenta"));
            }

            
             if (request.getParameter("ddlFase") != null) {
                obclsTratos.setInCodigo(Integer.parseInt(request.getParameter("ddlFase")));

                String stDescripcion = "";

                if (request.getParameter("ddlFase").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlFase").equals("2")) {
                    stDescripcion = "Clasificacion";
                } else if (request.getParameter("ddlFase").equals("3")) {
                    stDescripcion = "Necesita Analisis";
                     } else if (request.getParameter("ddlFase").equals("4")) {
                    stDescripcion = "Propuesta de valor";
                } else if (request.getParameter("ddlFase").equals("5")) {
                    stDescripcion = "identificar responsables";
                
                 } else if (request.getParameter("ddlFase").equals("6")) {
                    stDescripcion = "Cotizacion dee propuestas/precios";
                    }
                                
                obclsFaseTrato.setStDescripcion(stDescripcion);
                obclsTratos.setObclsFaseTrato(obclsFaseTrato);
            }
            
             
             if (request.getParameter("ddlTipo") != null) {
                obclsTratos.setInCodigo(Integer.parseInt(request.getParameter("ddlTipo")));

                String stDescripcion = "";

                if (request.getParameter("ddlTipo").equals("1")) {
                    stDescripcion = "Negocios existentes";
                } else if (request.getParameter("ddlTipo").equals("2")) {
                    stDescripcion = "Nuevo negocio";
                }          
                obclsTipoTrato.setStDescripcion(stDescripcion);
                obclsTratos.setObclsTipoTrato(obclsTipoTrato);
            }
            
                         
               if (request.getParameter("txtProbabilidad") != null) {
                obclsTratos.setDbProbabilidad(Integer.parseInt(request.getParameter("txtProbabilidad")));
            }
                if (request.getParameter("txtIngresosEsperados") != null) {
                obclsTratos.setDbIngresosEsperados(Integer.parseInt(request.getParameter("txtIngresosEsperados")));
            }
            
            if (request.getParameter("txtSiguientePaso") != null) {
                obclsTratos.setStSiguientePaso(request.getParameter("txtSiguientePaso"));
            }
            
             if (request.getParameter("ddlFuentePosibleCliente") != null) {
                obclsFuentePosibleCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlFuentePosibleCliente")));

                String stDescripcion = "";

                if (request.getParameter("ddlFuentePosibleCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("2")) {
                    stDescripcion = "Aviso";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("3")) {
                    stDescripcion = "Llamadas no solisitada";
                     } else if (request.getParameter("ddlFuentePosibleCliente").equals("4")) {
                    stDescripcion = "Recomendacion de empleados";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("5")) {
                    stDescripcion = "Recomendacion de Externa";
                
                 } else if (request.getParameter("ddlFuentePosibleCliente").equals("6")) {
                    stDescripcion = "Tienda en linea";
                    }
                                
                obclsFuentePosibleCliente.setStDescripcion(stDescripcion);
                obclsTratos.setObclsFuentePosibleCliente(obclsFuentePosibleCliente);
            }
            
            
            
            if (request.getParameter("txtFuenteCampana") != null) {
                obclsTratos.setStFuenteCampaña(request.getParameter("txtFuenteCampana"));
            }
            if (request.getParameter("txtNombreContacto") != null) {
                obclsTratos.setStNombreContacto(request.getParameter("txtNombreContacto"));
            }
            if (request.getParameter("txtDescripcion") != null) {
                obclsTratos.setStDescripcion(request.getParameter("txtDescripcion"));
            }
               
            //VALIDO SI EXISTE LA VARIABLE DE SESION CON OBJETOS YA AGREGADOS
            if (session.getAttribute("session_lstclsTratos") != null) {
                //RECUPERO OBJETOS AGREGADOS
                lstclsTratos = (List<Models.clsTratos>) session.getAttribute("session_lstclsTratos");
            }

            
             int inCodigo=lstclsTratos.size()+1;
            obclsTratos.setInCodigo(inCodigo);
            //AGREGO NUEVO OBJETO A LA LISTA
            lstclsTratos.add(obclsTratos);

            //NOMBRE Y VALOR DE LA VARIABLE DE SESION A TRAVES DE SET
            session.setAttribute("session_lstclsTratos", lstclsTratos);

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tratos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tratos.jsp").forward(request, response);
        }
    }
    
    
    
     

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
