/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
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
@WebServlet(name = "PosiblesClientesController", urlPatterns = {"/PosiblesClientesController"})
public class PosiblesClientesController extends HttpServlet {

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
           
           List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();

            //OBJETOS
           
                     
             HttpSession session = request.getSession(true);
            
            
            if(session.getAttribute("session_lstclsPosiblesClientes")!=null){
               lstclsPosiblesClientes=
                (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
                
            } 
               int inPosicion = 0;
            for (Models.clsPosiblesClientes item : lstclsPosiblesClientes) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                   
                    break;    
                }
                inPosicion++;
            }
                       
                        
            if (request.getParameter("txtnombreAlojamiento") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstDormitorioso(request.getParameter("txtnombreAlojamiento"));
            }
            if (request.getParameter("txtUbicacion") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStubicacion(request.getParameter("txtUbicacion"));
            }
             if (request.getParameter("txtHuespedes") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStstHuesped(request.getParameter("txtHuespedes"));
            }
              if (request.getParameter("txtdormitorio") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstDormitorioso(request.getParameter("txtdormitorio"));
            }
               if (request.getParameter("txtCamas") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstcamas(request.getParameter("txtCamas"));
            }
                if (request.getParameter("txtBaños") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstbaños(request.getParameter("txtBaños"));
            }
                 if (request.getParameter("txtDescripcion") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstDescripcion(request.getParameter("txtDescripcion"));
            }
                            
                
                  if (request.getParameter("txtlugar") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstLugar(request.getParameter("txtlugar"));
            }
                    if (request.getParameter("txtAtencion") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstAtencion(request.getParameter("txtAtencion"));
            }
                     if (request.getParameter("txtaspectos") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStstotrosAspectos(request.getParameter("txtaspectos"));
            }
                      if (request.getParameter("txtservicio") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstservicioOfrece(request.getParameter("txtservicio"));
            }
                       if (request.getParameter("txtvalor") != null) {
                lstclsPosiblesClientes.get(inPosicion).setstvalorNoche(request.getParameter("txtvalor"));
            }
            
           
                 session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClientes);
             request.setAttribute("stMensaje", "Se realizo procesos con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
            
            
             } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
                 
        }
    }
   

    
    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();
            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
            }

            int inPosicion = 0;
            for (Models.clsPosiblesClientes item : lstclsPosiblesClientes) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    lstclsPosiblesClientes.remove(inPosicion);
                    break;    
                }
                inPosicion++;
            }

            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClientes);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
        }
    }

    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();
            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
            }

            for (Models.clsPosiblesClientes item : lstclsPosiblesClientes) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    obclsPosiblesClientes = item;

                }

            }

            request.setAttribute("obclsPosiblesClientes", obclsPosiblesClientes);

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
        }
    }

    public void btnGuardar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            //VARIABLE DE SESSION
            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();

            //DEFINICION DE MODELOS
            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();

            //ASIGNACION DE ATRIBUTOS O PROPIEDADES
            if (request.getParameter("txtnombreAlojamiento") != null) {
                obclsPosiblesClientes.setstNombrealojamiento(request.getParameter("txtnombreAlojamiento"));
            }
            if (request.getParameter("txtUbicacion") != null) {
                obclsPosiblesClientes.setStubicacion(request.getParameter("txtUbicacion"));
            }
            if (request.getParameter("txtHuespedes") != null) {
                obclsPosiblesClientes.setStstHuesped(request.getParameter("txtHuespedes"));
            }
            if (request.getParameter("txtdormitorio") != null) {
                obclsPosiblesClientes.setstDormitorioso(request.getParameter("txtdormitorio"));
            }
            if (request.getParameter("txtCamas") != null) {
                obclsPosiblesClientes.setstcamas(request.getParameter("txtCamas"));
            }
            if (request.getParameter("txtBaños") != null) {
                obclsPosiblesClientes.setstbaños(request.getParameter("txtBaños"));
            }
            if (request.getParameter("txtDescripcion") != null) {
                obclsPosiblesClientes.setstDescripcion(request.getParameter("txtDescripcion"));
            }
            if (request.getParameter("txtlugar") != null) {
                obclsPosiblesClientes.setstLugar(request.getParameter("txtlugar"));
            }
            if (request.getParameter("txtAtencion") != null) {
                obclsPosiblesClientes.setstAtencion(request.getParameter("txtAtencion"));
            }
           
            
            if (request.getParameter("txtaspectos") != null) {
                obclsPosiblesClientes.setStstotrosAspectos(request.getParameter("txtaspectos"));
            }
            if (request.getParameter("txtservicio") != null) {
                obclsPosiblesClientes.setstservicioOfrece(request.getParameter("txtservicio"));
            }
             if (request.getParameter("txtvalor") != null) {
                obclsPosiblesClientes.setstvalorNoche(request.getParameter("txtvalor"));
            }
           

            //VALIDAMOS PREVIA EXISTENCIA DE LA VARIABLE SESSION
            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
            }

            //PARA EL CALCULO AUTOMATICO DEL CODIGO QUE IDENTIFICA EL REGISTRO (LLAVE PRIMARIA)
            int inCodigo = lstclsPosiblesClientes.size() + 1;
            obclsPosiblesClientes.setInCodigo(inCodigo);

            lstclsPosiblesClientes.add(obclsPosiblesClientes);

            //CREAMOS LA VARIABLE DE SESSION
            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClientes);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se realizó proceso con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        } catch (Exception ex) {
            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

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