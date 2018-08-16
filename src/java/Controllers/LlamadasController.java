/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.clsProposito;
import Models.clsRelacionadoCon;
import Models.clsTipoLlamada;
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
@WebServlet(name = "LlamadasController", urlPatterns = {"/LlamadasController"})
public class LlamadasController extends HttpServlet {

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
           
           List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();

            //OBJETOS
           
            Models.clsProposito obclsProposito = new Models.clsProposito();
            Models.clsRelacionadoCon obclsRelacionadoCon = new Models.clsRelacionadoCon();

            HttpSession session = request.getSession(true);
            
            
            if(session.getAttribute("session_lstclsLlamadas")!=null){
               lstclsLlamadas=
                (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
                
            } 
               int inPosicion = 0;
            for (Models.clsLlamadas item : lstclsLlamadas) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                   
                    break;    
                }
                inPosicion++;
            }
             
            
            //VALIDACION DE DATOS ENVIADOS DESDE JSP
            if (request.getParameter("txtNombreContacto") != null) {
                //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
                lstclsLlamadas.get(inPosicion).setStContacto(request.getParameter("txtNombreContacto"));
            } else {
                throw new Exception("Ingrese nombre ");
            }
            
            if (request.getParameter("txtAsunto") != null) {
                lstclsLlamadas.get(inPosicion).setStAsunto(request.getParameter("txtAsunto"));
            }
           
            
            if (request.getParameter("txtFecha") != null) {
                lstclsLlamadas.get(inPosicion).setStFecha(request.getParameter("txtFecha"));
            }
           
            
             if (request.getParameter("ddlProposito") != null) {
                obclsProposito.setInCodigo(Integer.parseInt(request.getParameter("ddlProposito")));

                String stDescripcion = "";

                if (request.getParameter("ddlProposito").equals("1")) {
                    stDescripcion = "ninguno";
                } else if (request.getParameter("ddlProposito").equals("2")) {
                    stDescripcion = "posible";
                } else if (request.getParameter("ddlProposito").equals("3")) {
                    stDescripcion = "administractivo";
                 
                } else if (request.getParameter("ddlProposito").equals("4")) {
                    stDescripcion = "negociacion";
                 
             } else if (request.getParameter("ddlProposito").equals("5")) {
                    stDescripcion = "demostraccion";
                 
                } else if (request.getParameter("ddlProposito").equals("6")) {
                    stDescripcion = "proyecto";
                 }
                                              
                obclsProposito.setStDescripcion(stDescripcion);
                lstclsLlamadas.get(inPosicion).setObclsProposito(obclsProposito);
            }
             
              
             if (request.getParameter("ddlRelacionadoCon") != null) {
                obclsProposito.setInCodigo(Integer.parseInt(request.getParameter("ddlRelacionadoCon")));

                String stDescripcion = "";

                if (request.getParameter("ddlRelacionadoCon").equals("1")) {
                    stDescripcion = "posibles clientes";
                } else if (request.getParameter("ddlRelacionadoCon").equals("2")) {
                    stDescripcion = "contactos";
               
                } else if (request.getParameter("ddlRelacionadoCon").equals("3")) {
                    stDescripcion = "otros";
                 
                }
                                              
                obclsProposito.setStDescripcion(stDescripcion);
                lstclsLlamadas.get(inPosicion).setObclsProposito(obclsProposito);
            }
             
             
            
            
            if (request.getParameter("txtDetalles") != null) {
                lstclsLlamadas.get(inPosicion).setStDetalles(request.getParameter("txtDetalles"));
            }
             if (request.getParameter("txtFecha") != null) {
                lstclsLlamadas.get(inPosicion).setStFecha(request.getParameter("txtFecha"));
            }
             
              if (request.getParameter("txtDuracion") != null) {
                 lstclsLlamadas.get(inPosicion).setInDuracion(Integer.parseInt(request.getParameter("txtDuracion")));
            }
              
               if (request.getParameter("txtDescripcion") != null) {
                lstclsLlamadas.get(inPosicion).setStDescripcion(request.getParameter("txtDescripcion"));
            }
                if (request.getParameter("txtResultado") != null) {
                lstclsLlamadas.get(inPosicion).setStResultado(request.getParameter("txtResultado"));
            }
           
               
             session.setAttribute("session_lstclsLlamadas", lstclsLlamadas);
             request.setAttribute("stMensaje", "Se realizo procesos con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
            
            
             } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
                 
        }
    } 
   
   
     public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsLlamadas obclsLlamadas = new Models.clsLlamadas();
            List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsLlamadas") != null) {
                lstclsLlamadas = (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
            }

            int inPosicion = 0;
            for (Models.clsLlamadas item : lstclsLlamadas) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    lstclsLlamadas.remove(inPosicion);
                    break;    
                }
                inPosicion++;
            }

            session.setAttribute("session_lstclsLlamadas", lstclsLlamadas);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
        }
    }
     
     public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsLlamadas obclsLlamadas = new Models.clsLlamadas();
            List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsLlamadas") != null) {
                lstclsLlamadas = (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
            }

            for (Models.clsLlamadas item : lstclsLlamadas) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    obclsLlamadas = item;

                }

            }
                             
            request.setAttribute("obclsLlamadas", obclsLlamadas);

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
        }
    }
   
    

    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {

           
            //OBJETOS
            Models.clsLlamadas obLlamadas = new Models.clsLlamadas();
            Models.clsProposito obclsProposito = new Models.clsProposito();
            Models.clsRelacionadoCon obclsRelacionadoCon = new clsRelacionadoCon();
            Models.clsTipoLlamada obclsTipoLlamada = new clsTipoLlamada();

            if (request.getParameter("txtNombreContacto") != null) {
                obLlamadas.setStContacto(request.getParameter("txtNombreContacto"));
            }        

            if (request.getParameter("txtAsunto") != null) {
                obLlamadas.setStAsunto(request.getParameter("txtAsunto"));
            }

          
            
             if (request.getParameter("ddlProposito") != null) {
                obLlamadas.setInCodigo(Integer.parseInt(request.getParameter("ddlProposito")));

                String stDescripcion = "";

                if (request.getParameter("ddlProposito").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlProposito").equals("2")) {
                    stDescripcion = "Posible";
                } else if (request.getParameter("ddlProposito").equals("3")) {
                    stDescripcion = "Administractivo";
                               
                 } else if (request.getParameter("ddlProposito").equals("4")) {
                    stDescripcion = "Negociacion";
                                
              } else if (request.getParameter("ddlProposito").equals("5")) {
                    stDescripcion = "Demostracion";
                 } else if (request.getParameter("ddlProposito").equals("6")) {
                    stDescripcion = "Proyecto";
                
                }      
                                   
                obclsProposito.setStDescripcion(stDescripcion);
                obLlamadas.setObclsProposito(obclsProposito);
            }
             
             
              if (request.getParameter("ddlRelacionadoCon") != null) {
                obLlamadas.setInCodigo(Integer.parseInt(request.getParameter("ddlRelacionadoCon")));

                String stDescripcion = "";

                if (request.getParameter("ddlRelacionadoCon").equals("1")) {
                    stDescripcion = "Posiblecliente";
                } else if (request.getParameter("ddlRelacionadoCon").equals("2")) {
                    stDescripcion = "Contacto";
                } else if (request.getParameter("ddlRelacionadoCon").equals("3")) {
                    stDescripcion = "Otros";
                }              
                obclsRelacionadoCon.setStDescripcion(stDescripcion);
                obLlamadas.setObclsRelacionadoCon(obclsRelacionadoCon);
            }
             
              
              
             
            
            if (request.getParameter("txtDetalles") != null) {
                obLlamadas.setStDetalles(request.getParameter("txtDetalles"));
            }

            if (request.getParameter("txtFecha") != null) {
                obLlamadas.setStFecha(request.getParameter("txtFecha"));
            }
            
            if (request.getParameter("txtDuracion") != null) {
                obLlamadas.setInDuracion(Integer.parseInt(request.getParameter("txtDuracion")));
            }
            if (request.getParameter("txtDescripcion") != null) {
                obLlamadas.setStDescripcion((request.getParameter("txtDescripcion")));
            }
            if (request.getParameter("txtResultado") != null) {
                obLlamadas.setStResultado((request.getParameter("txtResultado")));
                                
            }
                                 
             //CREACION DE LA VARIABLE DE SESION
            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();

            
            
            //VALIDO SI EXISTE LA VARIABLE DE SESION CON OBJETOS YA AGREGADOS
            if (session.getAttribute("session_lstclsLlamadas") != null) {
                //RECUPERO OBJETOS AGREGADOS
                lstclsLlamadas = (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
            }
          //Llave primary
            int inCodigo = lstclsLlamadas.size() + 1;
            obLlamadas.setInCodigo(inCodigo);

            //AGREGO NUEVO OBJETO A LA LISTA
            lstclsLlamadas.add(obLlamadas);
  
            //NOMBRE Y VALOR DE LA VARIABLE DE SESION A TRAVES DE SET
            session.setAttribute("session_lstclsLlamadas", lstclsLlamadas);
 
            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.setAttribute("stTipo", "success");
 
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
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
