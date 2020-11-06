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
   
   public void ConCliente (int Numero_Mesa, String Nombre, String Nit, String Direccion, int Telefono){
    
    try {
        Connection accessDB = lala.getConection(); 
        CallableStatement cs = accessDB.prepareCall("call insertCliente  (?,?,?,?)" );
        cs.setInt(1,Numero_Mesa); 
        cs.setString(2,Nombre);
        cs.setString(3,Nit);
        cs.setString(4,Direccion);
        cs.setInt(5, Telefono);
        
        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Guardado");
        
        
    } catch (SQLException e) {
        
        System.err.println("No se pudo guardar" + e.getMessage());
    }
    
}
  
}
   
   



