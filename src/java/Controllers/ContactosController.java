
 package Controllers;

import Models.clsFuentePosibleCliente;
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
@WebServlet(name = "ContactosController", urlPatterns = {"/ContactosController"})
public class ContactosController extends HttpServlet {

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

        } else if (request.getParameter("btnCancelar") != null) {

        } else if (request.getParameter("codigoSelecionado") != null) {
            if (request.getParameter("stopcion").equals("M")) {
                cargarModificar(request, response);
            } else if (request.getParameter("stopcion").equals("E")) {
                btnEliminar(request, response);
            }
        }
    }
    
    
  public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsContactos obclsContactos = new Models.clsContactos();
            List<Models.clsContactos> lstclsContactos = new ArrayList<Models.clsContactos>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsContactos") != null) {
                lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");
            }

            int inPosicion = 0;
            for (Models.clsContactos item : lstclsContactos) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    lstclsContactos.remove(inPosicion);
                    break;    
                }
                inPosicion++;
            }

            session.setAttribute("session_lstclsContactos", lstclsContactos);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);
        }
    }

   
   
   public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Models.clsContactos obclsContactos = new Models.clsContactos();
            List<Models.clsContactos> lstclsContactos = new ArrayList<Models.clsContactos>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsContactos") != null) {
                lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");
            }

            for (Models.clsContactos item : lstclsContactos) {

                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSelecionado"))) {
                    obclsContactos = item;

                }

            }
                             
            request.setAttribute("obclsContactos", obclsContactos);

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);
        }
    }
   
   
    

   public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {

            //CREACION DE LA VARIABLE DE SESION
            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsContactos> lstclsContactos = new ArrayList<Models.clsContactos>();

            //OBJETOS
            Models.clsContactos obclsContactos = new Models.clsContactos();
            Models.clsFuentePosibleCliente obclsFuentePosibleCliente = new Models.clsFuentePosibleCliente();

            //VALIDACION DE DATOS ENVIADOS DESDE JSP
          
            
           
             if (request.getParameter("ddlFuentePosibleCliente") != null) {
                obclsContactos.setInCodigo(Integer.parseInt(request.getParameter("ddlFuentePosibleCliente")));

                String stDescripcion = "";

                if (request.getParameter("ddlFuentePosibleCliente").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("2")) {
                    stDescripcion = "Aviso";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("3")) {
                    stDescripcion = "Llamada no solisitada";
                  }
                 if (request.getParameter("ddlFuentePosibleCliente").equals("4")) {
                    stDescripcion = "Recomendacion empleados";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("5")) {
                    stDescripcion = "Recomendacion externa";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("6")) {
                    stDescripcion = "Tienda en linea";
                
                }
                                   
                obclsFuentePosibleCliente.setStDescripcion(stDescripcion);
                obclsContactos.setObclsFuentePosibleCliente(obclsFuentePosibleCliente);
            }
            
           
           
           
            if (request.getParameter("txtNombre") != null) {
                //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
                obclsContactos.setStNombres(request.getParameter("txtNombre"));
            } 
            if (request.getParameter("txtApellidos") != null) {
              //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
             obclsContactos.setStApellidos(request.getParameter("txtApellidos"));
            } 
            if (request.getParameter("txtNumeroCuenta") != null) {
            //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
            obclsContactos.setStNumeroCuenta(request.getParameter("txtNumeroCuenta"));
            } 
            if (request.getParameter("txtTitulo") != null) {
                //ASIGNO EL VALOE ENVIADO DESDE EL JSP AL ATRIBUTO DEL OBJETO A TRAVES DE SET
                obclsContactos.setStTitulo(request.getParameter("txtTitulo"));
            } 
            if (request.getParameter("txtCorreoElectronico") != null) {
                obclsContactos.setStCorreo(request.getParameter("txtCorreoElectronico"));
            }
            if (request.getParameter("txtDepartamento") != null) {
                obclsContactos.setStDepartamento(request.getParameter("txtDepartamento"));
            }
            if (request.getParameter("txtTelefono") != null) {
                obclsContactos.setStTelefono(request.getParameter("txtTelefono"));
            }
            if (request.getParameter("txtTelefonoParticular") != null) {
                obclsContactos.setStTelefonoParticular(request.getParameter("txtTelefonoParticular"));
            }
           
            if (request.getParameter("txtOtroTelefono") != null) {
                obclsContactos.setStOtroTelefono(request.getParameter("txtOtroTelefono"));
            }
            if (request.getParameter("txtFax") != null) {
            obclsContactos.setStFax(request.getParameter("txtFax"));
            }
            if (request.getParameter("txtMovil") != null) {
            obclsContactos.setStMovil(request.getParameter("txtMovil"));
            }
            if (request.getParameter("txtFechaNacimiento") != null) {
            obclsContactos.setStFechaNacimiento(request.getParameter("txtFechaNacimiento"));
            }
            if (request.getParameter("txtAsistente") != null) {
            obclsContactos.setStAsistente(request.getParameter("txtAsistente"));
            }
            if (request.getParameter("txtTelefonoAsistente") != null) {
            obclsContactos.setStTelefonoAsistente(request.getParameter("txtTelefonoAsistente"));
            }
            if (request.getParameter("txtRespondeA") != null) {
            obclsContactos.setStRespondeA(request.getParameter("txtRespondeA"));
            }
            
            if (request.getParameter("lblNoParticipacionCorreoElectronico") != null) {
                obclsContactos.setChNoParticipacionCorreo(request.getParameter("lblNoParticipacionCorreoElectronico").equals("on") ? 'S' : 'N');
            }
            
            if (request.getParameter("txtIDSkype") != null) {
            obclsContactos.setStIdSkype(request.getParameter("txtIDSkype"));
            }
            if (request.getParameter("txtCorreoElectronicoSecundario") != null) {
            obclsContactos.setStCorreoSecundario(request.getParameter("txtCorreoElectronicoSecundario"));
            }
           
            

            //VALIDO SI EXISTE LA VARIABLE DE SESION CON OBJETOS YA AGREGADOS
            if (session.getAttribute("session_lstclsContactos") != null) {
                //RECUPERO OBJETOS AGREGADOS
                lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");
            }

              int inCodigo=lstclsContactos.size()+1;
            obclsContactos.setInCodigo(inCodigo);
            //AGREGO NUEVO OBJETO A LA LISTA
            lstclsContactos.add(obclsContactos);


            //NOMBRE Y VALOR DE LA VARIABLE DE SESION A TRAVES DE SET
            session.setAttribute("session_lstclsContactos", lstclsContactos);

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);
        } catch (Exception ex) {

            //ENVIO DOS PARAMETROS AL JSP
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO AL FORMULARIO DE EVENTOS.JSP
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);
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
