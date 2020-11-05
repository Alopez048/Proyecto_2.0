/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import MySQL.Coneection;
import java.sql.CallableStatement;
import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet; 
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
/**
   
 * @author Angel Rodriguez
 */
public class ConCliente {
   Coneection lala;
   
   public ConCliente(){
    lala = new Coneection();
    }
   
   public void ConCliente (int ID_CLIENTE, String NOMBRE, String APELLIDO, String RAZON_SOCIAL, int NIT, String DIRECCION,
           int TELEFONO, String EMAIL, String FECHA_INGRESO, int ESTATUS){
    
    try {
        Connection accessDB = lala.getConection();
        CallableStatement cs = accessDB.prepareCall("call insertCliente  (?,?,?,?,?,?,?,?,?,?)" );
        cs.setInt(1,ID_CLIENTE); 
        cs.setString(2,NOMBRE);
        cs.setString(3,APELLIDO);
        cs.setString(4,RAZON_SOCIAL);
        cs.setInt(5,NIT); 
        cs.setString(6,DIRECCION);
        cs.setInt(7,TELEFONO); 
        cs.setString(8,EMAIL);
        cs.setString(9,FECHA_INGRESO);  
        cs.setInt(10,ESTATUS); 
        
        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Guardado");
        
        
    } catch (SQLException e) {
        
        System.err.println("No se pudo guardar" + e.getMessage());
    }
    
}
   
   public void ModificarCliente (int ID_CLIENTE, String NOMBRE, String APELLIDO, String RAZON_SOCIAL, int  NIT,
            String DIRECCION, int  TELEFONO, String EMAIL, String FECHA_INGRESO,int  ESTATUS){
    
    try {
        Connection accessDB = lala.getConection();
        CallableStatement cs = accessDB.prepareCall("call empresa.modificarCliente  (?,?,?,?,?,?,?,?,?,?)" );
        cs.setInt(1,ID_CLIENTE); 
        cs.setString(2,NOMBRE);
        cs.setString(3,APELLIDO);
        cs.setString(4,RAZON_SOCIAL);
        cs.setInt(5,NIT); 
        cs.setString(6,DIRECCION);
        cs.setInt(7,TELEFONO); 
        cs.setString(8,EMAIL);
        cs.setString(9,FECHA_INGRESO);  
        cs.setInt(10,ESTATUS); 
        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Modificado");
        
        
    } catch (SQLException e) {
        
        System.err.println("No se pudo guardar" +  e.getMessage());
    }
    
}
   
    /*private final String SqlAg = "insert INTO cliente(ID_CLIENTE,NOMBRE, APELLIDO, RAZON_SOCIAL, NIT, DIRECCION, TELEFONO,EMAIL,FECHA_INGRESO, ESTATUS) VALUES (?,?,?,?,?,?,?,?,?,?)";
    private final String SqlMos = " SELECT * FROM cliente";
    private DefaultTableModel DT;
    private ResultSet RS;
    private PreparedStatement PS;
    private final Conection con; 
     
    public ConCliente(){
        PS =null;
        con = new Conection();      
    }
    private DefaultTableModel setTitulos(){
    DT = new DefaultTableModel();
    DT.addColumn("ID_CLIENTE");
    DT.addColumn("NOMBRE");
    DT.addColumn("APELLIDO");
    DT.addColumn("RAZON_SOCIAL");
    DT.addColumn("NIT");
    DT.addColumn("DIRECCION");
    DT.addColumn("TELEFONO");
    DT.addColumn("EMAIL");
    DT.addColumn("FECHA_INGRESO");
    DT.addColumn("ESTATUS");
    return DT;
    }*/
    
  /* public int SaveDatos( int ID_CLIENTE, String NOMBRE, String APELLIDO, String RAZON_SOCIAL, int NIT, String DIRECCION, int TELEFONO, String EMAIL, String FECHA_INGRESO, int ESTATUS){
   int conec = 0;
    try {
        PS = con.getConection().prepareStatement(SqlAg);
        PS.setInt(1, ID_CLIENTE); 
        PS.setString(2, NOMBRE);
        PS.setString(3, APELLIDO);
        PS.setString(4, RAZON_SOCIAL);
        PS.setInt(5, NIT);
        PS.setString(6, DIRECCION);
        PS.setInt(7, TELEFONO);
        PS.setString (8, EMAIL);
        PS.setString(9, FECHA_INGRESO);        
        PS.setInt(10, ESTATUS);   
        conec = PS.executeUpdate();
        
        if (conec > 0 ){
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            
        }
    } catch (SQLException e) {
        System.err.println("Erro al momento de guardar datos" + e.getMessage());
        
    } finally {
        PS = null;
        con.CerrarConection();
    
}
      
return conec;
    }*/
    
    /*public int CambioDatos(int ID_CLIENTE, String NOMBRE,String APELLIDO,String RAZON_SOCIAL,String NIT
,String DIRECCION, String TELEFONO, String EMAIL,String FECHA_INGRESO,int ESTATUS){
  String sql="UPDATE cliente SET NOMBRE='"+NOMBRE+"',APELLIDO='"+APELLIDO+"',RAZON_SOCIAL='"+RAZON_SOCIAL+
          "',NIT='"+NIT+"',DIRECCION='"+DIRECCION+"',TELEFONO='"+TELEFONO+"',EMAIL='"+EMAIL+
          "',FECHA_INGRESO='"+FECHA_INGRESO+"',ESTATUS='"+ESTATUS+"'WHERE ID_CLIENTE="+ID_CLIENTE;
   int conectando = 0;
    try {
        PS = con.getConection().prepareStatement(sql);
     
        conectando = PS.executeUpdate();
        
        if (conectando > 0 ){
            JOptionPane.showMessageDialog(null, "Se actualizo el registro");
            
        }
    } catch (SQLException e) {
        System.err.println("No se pudo modificar "+ e.getMessage());
        
    } finally {
        PS = null;
        con.CerrarConection();
          
    }
   return conectando;
}  */

}  



