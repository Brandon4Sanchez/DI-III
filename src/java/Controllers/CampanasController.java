 
package Controllers;

import Models.clsEstadoCampana;
import Models.clsTipoCampana;
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
@WebServlet(name = "CampanasController", urlPatterns = {"/CampanasController"})
public class CampanasController extends HttpServlet {

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
         btnGuardar(request, response);
        } else if (request.getParameter("btnCancelar") != null) {

        } else if (request.getParameter("codigoSelecionado") != null) {
            if (request.getParameter("stopcion").equals("M")) {
                cargarModificar(request, response);
            } else if (request.getParameter("stopcion").equals("E")) {
                btnEliminar(request, response);
            }
        }
    }
    
    
    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsCampanas obclsCampanas = new Models.clsCampanas();
            List<Models.clsCampanas> lstclsCampanas = new ArrayList<Models.clsCampanas>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsCampanas") != null) {
                lstclsCampanas = (List<Models.clsCampanas>) session.getAttribute("session_lstclsCampanas");
            }

            for (Models.clsCampanas item : lstclsCampanas) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    obclsCampanas = item;

                }

            }
                             
            request.setAttribute("obclsCampanas", obclsCampanas);

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Campañas.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Campañas.jsp").forward(request, response);
        }
    }
    
     public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsCampanas obclsCampanas = new Models.clsCampanas();
            List<Models.clsCampanas> lstclsCampanas = new ArrayList<Models.clsCampanas>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsCampanas") != null) {
                lstclsCampanas = (List<Models.clsCampanas>) session.getAttribute("session_lstclsCampanas");
            }

            int inPosicion = 0;
            for (Models.clsCampanas item : lstclsCampanas) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    lstclsCampanas.remove(inPosicion);
                    break;    
                }
                inPosicion++;
            }

            session.setAttribute("session_lstclsCampanas", lstclsCampanas);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Campañas.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Campañas.jsp").forward(request, response);
        }
    }
     
    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        try {

            //OBJETOS
            Models.clsCampanas obclsCampaña = new Models.clsCampanas();
            Models.clsTipoCampana obclsTipoCampana = new Models.clsTipoCampana();
            Models.clsEstadoCampana obcclsEstadoCampana = new Models.clsEstadoCampana();

            //VALIDACION DE DATOS ENVIADOS DESDE JSP
            
            if (request.getParameter("ddlTipo") != null) {
                obclsTipoCampana.setInCodigo(Integer.parseInt(request.getParameter("ddlTipo")));

                
                String stDescripcion = "";

                if (request.getParameter("ddlTipo").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlTipo").equals("2")) {
                    stDescripcion = "Conferencia";
                } else if (request.getParameter("ddlTipo").equals("3")) {
                    stDescripcion = "Seminario web";
                } else if (request.getParameter("ddlTipo").equals("4")) {
                    stDescripcion = "Exposicion comercial";
                } else if (request.getParameter("ddlTipo").equals("5")) {
                    stDescripcion = "Relaciones publicas";
                
                 } else if (request.getParameter("ddlTipo").equals("6")) {
                    stDescripcion = "Socios";
                }
               obclsTipoCampana.setStDescripcion(stDescripcion);
                obclsCampaña.setObclsTipoCampana(obclsTipoCampana);
            }
               
 
            
            
           
            if (request.getParameter("txtNombre") != null) {
                obclsCampaña.setStNombre(request.getParameter("txtNombre"));
            }
        
           
             
              if (request.getParameter("ddlEstado") != null) {
                obclsCampaña.setInCodigo(Integer.parseInt(request.getParameter("ddlEstado")));

                String stDescripcion = "";

                if (request.getParameter("ddlEstado").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlEstado").equals("2")) {
                    stDescripcion = "Planeacion";
                } else if (request.getParameter("ddlEstado").equals("3")) {
                    stDescripcion = "Activo";
                 }
                 if (request.getParameter("ddlEstado").equals("4")) {
                    stDescripcion = "Inactivo";
                } else if (request.getParameter("ddlEstado").equals("5")) {
                    stDescripcion = "Completos";
               
                }
                                   
                obcclsEstadoCampana.setStDescripcion(stDescripcion);
                obclsCampaña.setObclsEstadoCampana(obcclsEstadoCampana);
            }
            
         
            if (request.getParameter("txtFechaInicio") != null) {
                obclsCampaña.setStFechaInicio(request.getParameter("txtFechaInicio"));
            }
                                 
            if (request.getParameter("txtFechaFinalizacion") != null) {
                obclsCampaña.setStFechaFinalizacion(request.getParameter("txtFechaFinalizacion"));
            }

            if (request.getParameter("txtIngresosEsperados") != null) {
                obclsCampaña.setDbIngresosEsperados(Integer.parseInt(request.getParameter("txtIngresosEsperados")));
            }
            if (request.getParameter("txtCostePresupuestado") != null) {
                obclsCampaña.setDbCostePresupuestado(Integer.parseInt(request.getParameter("txtCostePresupuestado")));
            }
            if (request.getParameter("txtCosteReal") != null) {
                obclsCampaña.setDbCosteReal(Integer.parseInt(request.getParameter("txtCosteReal")));
            }

            if (request.getParameter("txtRespuestaEsperada") != null) {
                obclsCampaña.setStRespuestaEsperada(request.getParameter("txtRespuestaEsperada"));
            }

            if (request.getParameter("NumerosEnviados") != null) {
                obclsCampaña.setInNumerosEnviados(Integer.parseInt(request.getParameter("NumerosEnviados")));
            }

            if (request.getParameter("txtDescripcion") != null) {
                obclsCampaña.setStDescripcion(request.getParameter("txtDescripcion"));
            }

            //CREACION DE LA VARIABLE DE SESION
            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsCampanas> lstclsCampanas = new ArrayList<Models.clsCampanas>();

//VALIDO SI EXISTE LA VARIABLE DE SESION CON OBJETOS YA AGREGADOS
            if (session.getAttribute("session_lstclsCampanas") != null) {
                //RECUPERO OBJETOS AGREGADOS
                lstclsCampanas = (List<Models.clsCampanas>) session.getAttribute("session_lstclsCampanas");

            }

            int inCodigo = lstclsCampanas.size() + 1;
            obclsCampaña.setInCodigo(inCodigo);
            //AGREGO NUEVO OBJETO A LA LISTA
            lstclsCampanas.add(obclsCampaña);

            //NOMBRE Y VALOR DE LA VARIABLE DE SESION A TRAVES DE SET
            session.setAttribute("session_lstclsCampanas", lstclsCampanas);

            //Envio de parametros desde el controlador
            request.setAttribute("stMensaje", "Se realizo el proceso ocn exito");
            request.setAttribute("stTipo", "success");

            request.getRequestDispatcher("Campañas.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            request.getRequestDispatcher("Campañas.jsp").forward(request, response);
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
