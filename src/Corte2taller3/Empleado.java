/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Corte2taller3;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String numeroSeguroSocial;
    double salarioBase;

    public Empleado(String nombre, String apellido, String numeroSeguroSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularDevengado();
    public abstract double calcularDeducciones();
    
    public double calcularSalarioNeto() {
        return calcularDevengado() - calcularDeducciones();
    }

    public String getInformacion() {
        return "Nombre: " + nombre + " " + apellido + ", Seguro Social: " + numeroSeguroSocial +
               ", Salario Base: $" + salarioBase;
    }
}

