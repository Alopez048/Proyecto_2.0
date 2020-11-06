package Code;

import MySQL.Coneection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Bebidas {
    
    Coneection nuevo;
    
    public Bebidas(){
    
        nuevo = new Coneection();
        
    }
    
    public void Bebidas(String TIPO ,  String PRESENTACION,  int COSTO, int CANTIDAD, int TOTAL)
    {
        
        try{
            Connection bebidas= nuevo.getConection();
            CallableStatement CS= bebidas.prepareCall("call insertBebidas (?,?,?,?,?)");
     
        CS.setString(1,TIPO );
        CS.setString(2,PRESENTACION );
        CS.setInt(3,COSTO );
        CS.setInt(4,CANTIDAD );
        CS.setInt(5, TOTAL);
        CS.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se Guardó el Registro");
        
        }
        
        catch(SQLException e) {
        System.err.println("No se pudo guardar"+ e.getMessage());
        }
    }         }