/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iberotec.edu.pe.Clases;

import iberotec.edu.pe.forms.SeleccionModoUso;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Yavet
 */
public class ConexionBD {
    Connection con = null;
    private static String user = "root";
    private static String password = "";
    
    public Connection conexion(){
        try{
            //Cargar nuestro Driver
            Class.forName("com.mysql.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost/veterinaria",user , password );     
            System.out.println("Conexion Establecida");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Conexion Fallida");
            JOptionPane.showMessageDialog(null, e, "Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }

    
}
