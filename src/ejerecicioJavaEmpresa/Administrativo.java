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
public class Administrativo extends Persona {
    
    public String toString() {
        return super.toString();
    }
    
    private int cantidadHoras;
    private double valorHora;
    private double antiguedad;
    private double gimnasio;

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(double gimnasio) {
        this.gimnasio = gimnasio;
    }
    
}
