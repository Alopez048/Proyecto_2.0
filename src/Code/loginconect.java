
package Code;

import MySQL.Coneection;
import Visual.login;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nello
 */
public class loginconect {
    Coneection nuevo = new Coneection();
    
public loginconect(){
    nuevo = new Coneection();
}     

    public int validar_ingreso(){
    
        String usuario = login.txtUser.getText();
        String password =login.txtpass.getText();
        
        int resultado = 0;
        
        String SSQL = "SELECT * FROM loggin WHERE Username ='"+usuario+"' AND Password=('"+password+"')";
        
        Connection conect=null;
        try {
            conect = nuevo.getConection();
            Statement st = conect.createStatement();
            ResultSet rs= st.executeQuery(SSQL);
            
            if(rs.next()){
                
                resultado =1;
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex,"Error de conexion",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(loginconect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    return resultado;
    }
}
