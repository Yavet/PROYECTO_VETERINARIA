/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iberotec.edu.pe.Clases;

import iberotec.edu.pe.forms.LoginSoporte;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yavet
 */
public class LoginSoporteBD {
    
    ConexionBD pool = new ConexionBD();
    
    public int login(){
    String user = LoginSoporte.txtUser.getText();
    String pass = LoginSoporte.txtPassword.getText();
    
    int resultado = 0;
    
    String SSQL="SELECT * FROM soporte_tecnico WHERE Usuario='"+ user +"' AND Password='"+pass+"'";
    Connection conect = null;
    
    try{
    conect = pool.conexion();
    Statement st = conect.createStatement();
    ResultSet rs = st.executeQuery(SSQL);
        if(rs.next()){
            resultado = 1;
        }
    }
    catch(SQLException ex){
    JOptionPane.showMessageDialog(null, ex, "Error de Validacion ", JOptionPane.ERROR_MESSAGE);
    }
    
    return resultado;
    }
  
}
