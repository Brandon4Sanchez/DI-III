/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

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


            if (request.getParameter("btnAutenticar")!=null) {
                      btnAutenticar(request,response);     
            }else if (request.getParameter("btnRegistrar")!=null) {
                btnRegistrar(request,response);
            }
            }
            
    
    public void btnRegistrar (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
             String stMensaje = "";
            if (request.getParameter("txtLogin")==null) {
                stMensaje += "Ingrese Login,";
            }
            if (request.getParameter("txtPassword")==null) {
                stMensaje += "Ingrese password,";
            }
  
             if (request.getParameter("txtCondirmarPassword")==null) {
                stMensaje += "Ingrese Password,";
            }
           if (request.getParameter("txtPassword")!=null && request.getParameter("txtCondirmarPassword")==null) {
                         
           if (!request.getParameter("txtPassword").equals(request.getParameter("txtCondirmarPassword"))) {
                stMensaje += "El Password ingresado no coinside con la confirmacion,";
            }
           }
             
             if (!stMensaje.equals("")) {
                throw new Exception(stMensaje.substring(0, stMensaje.length() - 1));
            }
                
             BL.clsLogin obclsLogin = new BL.clsLogin();
             Models.clsLogin obclsLoginModel=new Models.clsLogin();
                
             obclsLoginModel.setStEmail(request.getParameter("txtLogin"));
             obclsLoginModel.setStPassword(request.getParameter("txtPassword"));
            
             
             if (!obclsLogin.addUsuario(obclsLoginModel).equals("Se realizo proceso con exito")){
                throw new Exception("Se proujo un error durante el procedimiento.");
             
             }else{
                  //envio de parametros o valores
            request.setAttribute("stMensaje","Se realizo proceso con exito");
            request.setAttribute("stTipo","success");
            //direccionamiento JSP
            request.getRequestDispatcher("Registrar.jsp").forward(request, response);
                 
             }
             
             
        } catch (Exception ex) {
            //envio de parametros o valores
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo","error");
            //direccionamiento JSP
            request.getRequestDispatcher("Registrar.jsp").forward(request, response);
        }
    }

    
    public void btnAutenticar (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
             
             String stMensaje = "";

            if (request.getParameter("txtEmail").equals("")) {
                stMensaje += "Ingrese email,";
            }
            if (request.getParameter("txtPassword").equals("")) {
                stMensaje += "Ingrese password,";
            }

            if (!stMensaje.equals("")) {
                throw new Exception(stMensaje.substring(0, stMensaje.length() - 1));
            }
                
                
            
           
            Models.clsLogin obLclsLogin =new Models.clsLogin();
            obLclsLogin.setStEmail(request.getParameter("txtEmail").toString());
            obLclsLogin.setStPassword(request.getParameter("txtPassword").toString());
            
            //instanciando controlador
            BL.clsLogin obBLclsLogin = new BL.clsLogin();
            
            if(request.getParameter("btnAceptar") !=null){
                String stMensajeConfirmacion=obBLclsLogin.addUsuario(obLclsLogin);
                             
             
                if(!stMensajeConfirmacion.equals("se realizo proceso con exito"))
             request.setAttribute("stMensaje",stMensajeConfirmacion);
             request.setAttribute("stTipo", "error");
              request.getRequestDispatcher("Registrar.jsp").forward(request, response);
                  }  else {
               
                request.setAttribute("stTipo", "success");
              request.getRequestDispatcher("Registrar.jsp").forward(request, response);
              request.setAttribute("stTipo", "success");
           
                    
                    
                    }
                    
                    
          
           
            boolean blBandera = obBLclsLogin.validarLogin(obLclsLogin);
            
            if(blBandera)
                //direccionamiento JSP
                request.getRequestDispatcher("Index.jsp").forward(request, response);
            else
                throw new Exception("Email o password incorrecto");            
            
        } catch (Exception ex) {
            //envio de parametros o valores
            request.setAttribute("stError", ex.getMessage());
            //direccionamiento JSP
            request.getRequestDispatcher("Login.jsp").forward(request, response);
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
