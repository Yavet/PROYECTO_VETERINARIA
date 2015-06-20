/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iberotec.edu.pe.Clases;

/**
 *
 * @author Yavet
 */
public class Registro {
    private String nombreCliente;
    private String apellidoCliente;
    private int DNI;

    public Registro(String nombreCliente, String apellidoCliente, int DNI) {
        if(nombreCliente == null || apellidoCliente == null || DNI == 0){
        throw new IllegalArgumentException();
    }       
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.DNI = DNI;
    
    }
    
    public void DatosPersonales(){
        
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    
}
