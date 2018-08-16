/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author Janner
 */

public class clsConexion{
    
    Connection conn=null;    
    String stServidor,stDatabase,stUsuario,stPassword="";
        
    public clsConexion(){
    
        try {
          stServidor="localhost";
          stDatabase="bdCRM";
          stUsuario="JANNER";
          stPassword="123456";
            
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          
          String stConexion="jdbc:sqlserver://"+stServidor+":1433;databaseName="+stDatabase;
          
          conn=DriverManager.getConnection(stConexion,stUsuario,stPassword);
                   
          
            
        } catch (Exception ex) {
           
        } 
                       
        
}
    
        public Connection getConexion(){
        return conn;
   
        }
        public void closeConexion(Connection conn) {
        
try{

conn.close();
    
 } catch (Exception ex) {
      }

}
}
