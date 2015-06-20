/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iberotec.edu.pe.Clases;

import iberotec.edu.pe.forms.LoginGerente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yavet
 */
public class LoginGerenteBD {
    ConexionBD pool = new ConexionBD();
    
    public int login(){
    String user = LoginGerente.txtUser.getText();
    String pass = LoginGerente.txtPassword.getText();
    
    int resultado = 0;
    
    String SSQL="SELECT * FROM Empleado WHERE Nombre='"+ user +"'  AND dni='"+pass+"' AND  Puesto='Gerente'";
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
