/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerecicioJavaEmpresa;

/**
 *
 * @author gonzalo
 */
public abstract class Persona {
    
    public String ToString(){
        return "Nombre: " + nombre + "Apellido: " + apellido + "DNI: " + documento + "Numero de Cuenta: " + cuentaBancaria;
    
    }

    private String nombre;
    private String apellido;
    private String documento;
    private int cuentaBancaria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    
    
}
