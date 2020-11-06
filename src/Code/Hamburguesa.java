package Code;

import MySQL.Coneection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Hamburguesa {
    
    Coneection nuevo;
    
    public Hamburguesa(){
    
        nuevo = new Coneection();
        
    }
    
    public void Hamburguesa(String TIPO ,  String PRESENTACION,  int COSTO, int CANTIDAD, int TOTAL,String Nit)
    {
        
        try{
            Connection hamburguesas= nuevo.getConection();
            CallableStatement CS= hamburguesas.prepareCall("call insertHamburguesas (?,?,?,?,?,?)");
     
        CS.setString(1,TIPO );
        CS.setString(2,PRESENTACION );
        CS.setInt(3,COSTO );
        CS.setInt(4,CANTIDAD );
        CS.setInt(5, TOTAL);
        CS.setString(6,Nit);
        CS.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se Guardó el Registro");
        
        }
        
        catch(SQLException e) {
        System.err.println("No se pudo guardar"+ e.getMessage());
        }
    }
        
 /*public void ModificarDatos(int ID_EMPLEADO, String PRIMER_NOMBRE, 
        String PRIMER_APELLIDO,String SEGUNDO_NOMBRE,
        String SEGUNDO_APELLIDO,String NIT,int SALARIO,int ESTATUS,int ID_DEPARTAMENTO){
     try{
            
         Connection empresa= nuevo.getConection();
         CallableStatement CS=  empresa.prepareCall("call modificarMEmpleado (?,?,?,?,?,?,?,?,?)");
        CS.setInt(1,ID_EMPLEADO);
        CS.setString(2,PRIMER_NOMBRE );
        CS.setString(3,PRIMER_APELLIDO );
        CS.setString(4,SEGUNDO_NOMBRE );
        CS.setString(5,SEGUNDO_APELLIDO );
        CS.setString(6,NIT );
        CS.setInt(7,SALARIO );
        CS.setInt(8, ESTATUS);
        CS.setInt(9, ID_DEPARTAMENTO);
        CS.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Se Guardaron los cambios");
        }
        
        catch(SQLException e){
        System.err.println("Hubo un erro al guardar"+e.getMessage());
        }
    }*/
    
    }
    
    
    
    
    
    
    
    
