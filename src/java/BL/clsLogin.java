/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BL;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author David
 */
    
public class clsLogin {
    clsConexion obclsConexion=new clsConexion();
    Connection conn=null;
    public  clsLogin() {
         
    conn= obclsConexion.getConexion();
           
    }
    
       
    public boolean validarLogin(Models.clsLogin obclsLogin){
        try{
        
            return obclsLogin.getStEmail().equals("gongora@gmail.com") && 
                    obclsLogin.getStPassword().equals("123");
            
        }catch(Exception ex){
            throw ex;
        }
    }



public String addUsuario(Models.clsLogin obclsLogin ){
        
        
        try {
            PreparedStatement ps=conn.prepareStatement("{call spInsertarUsuarios(?,?)}");
           
            ps.setString(1, obclsLogin.getStEmail());
            ps.setString(2, obclsLogin.getStPassword());
            
            ps.execute();//no me retorna datos
                 
             return"Se realizo proceso con exito";
        } catch (Exception ex) {
         return ex.getMessage();
        } finally{
            obclsConexion.closeConexion(conn);
}
    }
}