/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import MySQL.Coneection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
   
 * @author Angel Rodriguez
 */
public class ConCliente {
   Coneection lala;
   
   public ConCliente(){
    lala = new Coneection();
    }
   
   public void ConCliente (String NOMBRE, int NIT, String DIRECCION, int TELEFONO){
    
    try {
        Connection accessDB = lala.getConection(); 
        CallableStatement cs = accessDB.prepareCall("call insertCliente  (?,?,?,?)" );
        cs.setString(1,NOMBRE); 
        cs.setInt(2,NIT);
        cs.setString(3,DIRECCION);
        cs.setInt(4,TELEFONO);
        
        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Guardado");
        
        
    } catch (SQLException e) {
        
        System.err.println("No se pudo guardar" + e.getMessage());
    }
    
}
  
}
   
   



