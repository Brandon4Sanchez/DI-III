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
@WebServlet(name = "TareasController", urlPatterns = {"/TareasController"})
public class TareasController extends HttpServlet {

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
           
           
           
            List<Models.clsTareas> lstclsTareas = new ArrayList<Models.clsTareas>();

            //OBJETOS
           Models.clsEstadoTarea obclsEstadoTarea = new Models.clsEstadoTarea();
     
           Models.clsPrioridad obclsPrioridad = new Models.clsPrioridad();

            HttpSession session = request.getSession(true);
            
            
            if(session.getAttribute("session_lstclsTareas")!=null){
               lstclsTareas=
                (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
                
            } 
               int inPosicion = 0;
            for (Models.clsTareas item : lstclsTareas) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                   
                    break;    
                }
                inPosicion++;
            }
             
            
            //VALIDACION DE DATOS ENVIADOS DESDE JSP
            if (request.getParameter("txtTitular") != null) {
                //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
                lstclsTareas.get(inPosicion).setStTitular(request.getParameter("txtTitular"));
            } else {
                throw new Exception("Titular de la tarea ");
            }
            
            if (request.getParameter("txtAsunto") != null) {
                lstclsTareas.get(inPosicion).setStAsunto(request.getParameter("txtAsunto"));
            }
            if (request.getParameter("txtFechaVencimiento") != null) {
                lstclsTareas.get(inPosicion).setStFechaVencimiento(request.getParameter("txtFechaVencimiento"));
            }
           
            
            
             if (request.getParameter("chkEnviarMensaje") != null) {
                char chSeleccion = request.getParameter("chkEnviarMensaje").equals("on") ? 'S' : 'N';
                lstclsTareas.get(inPosicion).setChEnviarMensaje(chSeleccion);
            } else {
                lstclsTareas.get(inPosicion).setChEnviarMensaje('N');
            }
            
              if (request.getParameter("chkRepetir") != null) {
                char chSeleccion = request.getParameter("chkRepetir").equals("on") ? 'S' : 'N';
                lstclsTareas.get(inPosicion).setChRepetir(chSeleccion);
            } else {
                lstclsTareas.get(inPosicion).setChRepetir('N');
            }
            
            if (request.getParameter("txtContacto") != null) {
                lstclsTareas.get(inPosicion).setStContacto(request.getParameter("txtContacto"));
            }
           
            
            
            
             if (request.getParameter("ddlEstado") != null) {
                obclsEstadoTarea.setInCodigo(Integer.parseInt(request.getParameter("ddlEstado")));

                String stDescripcion = "";

                if (request.getParameter("no iniciado").equals("1")) {
                    stDescripcion = "Aplazado";
                } else if (request.getParameter("en curso").equals("2")) {
                    stDescripcion = "Completado";
                } else if (request.getParameter("en espera de entrada").equals("3")) {
                                 
                }
                                   
                obclsEstadoTarea.setStDescripcion(stDescripcion);
                lstclsTareas.get(inPosicion).setObclsEstadoTarea(obclsEstadoTarea);
            }
            
            
                    if (request.getParameter("ddlPrioridad") != null) {
                obclsPrioridad.setInCodigo(Integer.parseInt(request.getParameter("ddlPrioridad")));

                String stDescripcion = "";

                if (request.getParameter("Alto").equals("1")) {
                    stDescripcion = "Mas alto";
                } else if (request.getParameter("bajo").equals("2")) {
                    stDescripcion = "Mas bajo";
                } else if (request.getParameter("Normal").equals("3")) {
                                 
                }
                                   
                obclsPrioridad.setStDescripcion(stDescripcion);
                lstclsTareas.get(inPosicion).setObclsPrioridad(obclsPrioridad);
            }
                    
                    
            if (request.getParameter("txtDescripcion") != null) {
                lstclsTareas.get(inPosicion).setStDescripcion(request.getParameter("txtDescripcion"));
            }
           
               
             session.setAttribute("session_lstclsTareas", lstclsTareas);
             request.setAttribute("stMensaje", "Se realizo procesos con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tarea.jsp").forward(request, response);
            
            
             } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Tarea.jsp").forward(request, response);
                 
        }
    }
   

    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsTareas obclsTareas = new Models.clsTareas();
            List<Models.clsTareas> lstclsTareas= new ArrayList<Models.clsTareas>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsTareas") != null) {
                lstclsTareas= (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
            }

            int inPosicion = 0;
            for (Models.clsTareas item : lstclsTareas) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    lstclsTareas.remove(inPosicion);
                    break;    
                }
                inPosicion++;
            }

            session.setAttribute("session_lstclsTareas", lstclsTareas);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tarea.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tarea.jsp").forward(request, response);
        }
    }

    
     public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsTareas obclsTareas = new Models.clsTareas();
            List<Models.clsTareas> lstclsTareas = new ArrayList<Models.clsTareas>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsTareas") != null) {
                lstclsTareas = (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
            }

            for (Models.clsTareas item : lstclsTareas) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    obclsTareas = item;

                }

            }
                             
            request.setAttribute("obclsTareas", obclsTareas);

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tarea.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Tarea.jsp").forward(request, response);
        }
    }
    
    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {

            
            //CREACION DE LA VARIABLE DE SESION
            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsTareas> lstclsTareas = new ArrayList<Models.clsTareas>();
            
            Models.clsTareas obTareas = new Models.clsTareas();
            Models.clsEstadoTarea obEstadoTarea = new Models.clsEstadoTarea();
            Models.clsPrioridad obPrioridad = new Models.clsPrioridad();

            if (request.getParameter("txtTitular") != null) {
                obTareas.setStTitular(request.getParameter("txtTitular"));
            } else {
                throw new Exception("Ingrese el titular de la tarea");//Exepcion controlada
            }
            if (request.getParameter("txtAsunto") != null) {
                obTareas.setStAsunto(request.getParameter("txtAsunto"));
            }
            if (request.getParameter("txtFechaVencimiento") != null) {
                obTareas.setStFechaVencimiento(request.getParameter("txtFechaVencimiento"));
            }
            if (request.getParameter("txtContacto") != null) {
                obTareas.setStContacto(request.getParameter("txtContacto"));
            }
            if (request.getParameter("txtCuenta") != null) {
                obTareas.setStCuenta(request.getParameter("txtCuenta"));
            }
           
            
            if (request.getParameter("ddlEstado") != null) {
                obTareas.setInCodigo(Integer.parseInt(request.getParameter("ddlEstado")));

                String stDescripcion = "";

                if (request.getParameter("ddlEstado").equals("1")) {
                    stDescripcion = "Alto";
                } else if (request.getParameter("ddlEstado").equals("2")) {
                    stDescripcion = "Mas alto";
                } else if (request.getParameter("ddlEstado").equals("3")) {
                    stDescripcion = "Bajo";
                     } else if (request.getParameter("ddlEstado").equals("4")) {
                    stDescripcion = "Mas bajo";
                } else if (request.getParameter("ddlEstado").equals("5")) {
                    stDescripcion = "Normal";
                
                }
                                
                obEstadoTarea.setStDescripcion(stDescripcion);
                obTareas.setObclsEstadoTarea(obEstadoTarea);
            }
            
            
            
            
            
         
            
            
            
             if (request.getParameter("ddlPrioridad") != null) {
                obTareas.setInCodigo(Integer.parseInt(request.getParameter("ddlPrioridad")));

                String stDescripcion = "";

                if (request.getParameter("ddlPrioridad").equals("1")) {
                    stDescripcion = "Alto";
                } else if (request.getParameter("ddlPrioridad").equals("2")) {
                    stDescripcion = "Mas alto";
                } else if (request.getParameter("ddlPrioridad").equals("3")) {
                    stDescripcion = "Bajo";
                     } else if (request.getParameter("ddlPrioridad").equals("4")) {
                    stDescripcion = "Mas bajo";
                } else if (request.getParameter("ddlPrioridad").equals("5")) {
                    stDescripcion = "Normal";
                
                }
                                
                obPrioridad.setStDescripcion(stDescripcion);
                obTareas.setObclsPrioridad(obPrioridad);
            }
            
            
            
            
            
            if (request.getParameter("chkEnviarMensaje") != null) {
                char chEnviarMensaje = request.getParameter("chkEnviarMensaje").equals("on")
                        ? 'S'
                        : 'N';
                obTareas.setChEnviarMensaje(chEnviarMensaje);
            }
            if (request.getParameter("chkRepetir") != null) {
                char chRepetir = request.getParameter("chkRepetir").equals("on")
                        ? 'S'
                        : 'N';
            }
            if (request.getParameter("txtDescripcion") != null) {
                obTareas.setStDescripcion(request.getParameter("txtDescripcion"));
            }
           
                   
            //VALIDO SI EXISTE LA VARIABLE DE SESION CON OBJETOS YA AGREGADOS
          if (session.getAttribute("session_lstclsTareas") != null) {
                //RECUPERO OBJETOS AGREGADOS
                lstclsTareas = (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
            }


            
             int inCodigo=lstclsTareas.size()+1;
            obTareas.setInCodigo(inCodigo);
            //AGREGO NUEVO OBJETO A LA LISTA
            lstclsTareas.add(obTareas);

            //NOMBRE Y VALOR DE LA VARIABLE DE SESION A TRAVES DE SET
            session.setAttribute("session_lstclsTareas", lstclsTareas);




//Envio de parametros desde el controlador
            request.setAttribute("stMensaje", "Se realizo el proceso ocn exito");
            request.setAttribute("stTipo", "success");

            request.getRequestDispatcher("Tarea.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            request.getRequestDispatcher("Tarea.jsp").forward(request, response);
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
