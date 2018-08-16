
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
@WebServlet(name = "EventosController", urlPatterns = {"/EventosController"})
public class EventosController extends HttpServlet {

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
           
           List<Models.clsEventos> lstclsEventos = new ArrayList<Models.clsEventos>();

            //OBJETOS
           
            Models.clsRelacionadoCon obclsRelacionadoCon = new Models.clsRelacionadoCon();

            HttpSession session = request.getSession(true);
            
            
            if(session.getAttribute("session_lstclsEventos")!=null){
               lstclsEventos=
                (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
                
            } 
               int inPosicion = 0;
            for (Models.clsEventos item : lstclsEventos) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                   
                    break;    
                }
                inPosicion++;
            }
             
            
            //VALIDACION DE DATOS ENVIADOS DESDE JSP
            if (request.getParameter("txtNombre") != null) {
                //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
                lstclsEventos.get(inPosicion).setStNombre(request.getParameter("txtNombre"));
            } else {
                throw new Exception("Ingrese nombre ");
            }
            
            if (request.getParameter("txtUbicacion") != null) {
                lstclsEventos.get(inPosicion).setStUbicacion(request.getParameter("txtUbicacion"));
            }
            if (request.getParameter("txtParticipantes") != null) {
                lstclsEventos.get(inPosicion).setStParticipantes(request.getParameter("txtParticipantes"));
            }
           
            
            
             if (request.getParameter("chkTodoDia") != null) {
                char chSeleccion = request.getParameter("chkTodoDia").equals("on") ? 'S' : 'N';
                lstclsEventos.get(inPosicion).setChTodoDia(chSeleccion);
            } else {
                lstclsEventos.get(inPosicion).setChTodoDia('N');
            }
            
            
            if (request.getParameter("txtFecha") != null) {
                lstclsEventos.get(inPosicion).setStFecha(request.getParameter("txtFecha"));
            }
           
            
            
            
             if (request.getParameter("ddlRelacionadoCon") != null) {
                obclsRelacionadoCon.setInCodigo(Integer.parseInt(request.getParameter("ddlRelacionadoCon")));

                String stDescripcion = "";

                if (request.getParameter("ddlRelacionadoCon").equals("1")) {
                    stDescripcion = "Posible clientes";
                } else if (request.getParameter("ddlRelacionadoCon").equals("2")) {
                    stDescripcion = "contoctos";
                } else if (request.getParameter("ddlRelacionadoCon").equals("3")) {
                    stDescripcion = "Otros";
                
                }
                                   
                obclsRelacionadoCon.setStDescripcion(stDescripcion);
                lstclsEventos.get(inPosicion).setObclsRelacionadoCon(obclsRelacionadoCon);
            }
            
            
            if (request.getParameter("txtDescripcion") != null) {
                lstclsEventos.get(inPosicion).setStDescripcion(request.getParameter("txtDescripcion"));
            }
           
               
             session.setAttribute("session_lstclsEventos", lstclsEventos);
             request.setAttribute("stMensaje", "Se realizo procesos con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);
            
            
             } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);
                 
        }
    }
   
    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsEventos obclsEventos = new Models.clsEventos();
            List<Models.clsEventos> lstclsEventos = new ArrayList<Models.clsEventos>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsEventos") != null) {
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
            }

            int inPosicion = 0;
            for (Models.clsEventos item : lstclsEventos) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    lstclsEventos.remove(inPosicion);
                    break;    
                }
                inPosicion++;
            }

            session.setAttribute("session_lstclsEventos", lstclsEventos);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);
        }
    }
     
    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsEventos obclsEventos = new Models.clsEventos();
            List<Models.clsEventos> lstclsEventos = new ArrayList<Models.clsEventos>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsEventos") != null) {
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
            }

            for (Models.clsEventos item : lstclsEventos) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    obclsEventos = item;

                }

            }
                             
            request.setAttribute("obclsEventos", obclsEventos);

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);
        }
    }
   
    
    
    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {

            //CREACION DE LA VARIABLE DE SESION
            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsEventos> lstclsEventos = new ArrayList<Models.clsEventos>();

            //OBJETOS
            Models.clsEventos obclsEventos = new Models.clsEventos();
            Models.clsRelacionadoCon obclsRelacionadoCon = new Models.clsRelacionadoCon();

            //VALIDACION DE DATOS ENVIADOS DESDE JSP
            if (request.getParameter("txtNombre") != null) {
                //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
                obclsEventos.setStNombre(request.getParameter("txtNombre"));
            } else {
                throw new Exception("Ingrese nombre ");
            }
            
            if (request.getParameter("txtUbicacion") != null) {
                obclsEventos.setStUbicacion(request.getParameter("txtUbicacion"));
            }
            if (request.getParameter("txtParticipantes") != null) {
                obclsEventos.setStParticipantes(request.getParameter("txtParticipantes"));
            }
           
            
             if (request.getParameter("chkTodoDia") != null) {
                char chSeleccion = request.getParameter("chkTodoDia").equals("on") ? 'S' : 'N';
                obclsEventos.setChTodoDia(chSeleccion);
            } else {
                obclsEventos.setChTodoDia('N');
            }
            
            
            if (request.getParameter("txtFecha") != null) {
                obclsEventos.setStFecha(request.getParameter("txtFecha"));
            }
           
            
            
            
             if (request.getParameter("ddlRelacionadoCon") != null) {
                obclsEventos.setInCodigo(Integer.parseInt(request.getParameter("ddlRelacionadoCon")));

                String stDescripcion = "";

                if (request.getParameter("ddlRelacionadoCon").equals("1")) {
                    stDescripcion = "Posible clientes";
                } else if (request.getParameter("ddlRelacionadoCon").equals("2")) {
                    stDescripcion = "contoctos";
                } else if (request.getParameter("ddlRelacionadoCon").equals("3")) {
                    stDescripcion = "Otros";
                
                }
                                   
                obclsRelacionadoCon.setStDescripcion(stDescripcion);
                obclsEventos.setObclsRelacionadoCon(obclsRelacionadoCon);
            }
            
             
             
             
             
            
            if (request.getParameter("txtDescripcion") != null) {
                obclsEventos.setStDescripcion(request.getParameter("txtDescripcion"));
            }

            //VALIDO SI EXISTE LA VARIABLE DE SESION CON OBJETOS YA AGREGADOS
            if (session.getAttribute("session_lstclsEventos") != null) {
                //RECUPERO OBJETOS AGREGADOS
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
            }
          //Llave primary
            int inCodigo=lstclsEventos.size()+1;
            obclsEventos.setInCodigo(inCodigo);
            
            //AGREGO NUEVO OBJETO A LA LISTA
            lstclsEventos.add(obclsEventos);

            //NOMBRE Y VALOR DE LA VARIABLE DE SESION A TRAVES DE SET
            session.setAttribute("session_lstclsEventos", lstclsEventos);

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);
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
