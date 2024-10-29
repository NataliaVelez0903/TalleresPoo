/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Corte2taller3;

public class EmpleadoHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoHoras(String nombre, String apellido, String numeroSeguroSocial, double salarioBase,double horasTrabajadas, double tarifaPorHora) {
        super(nombre, apellido, numeroSeguroSocial, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularDevengado() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public double calcularDeducciones() {
        double fondoSolidaridad = 0.01 * calcularDevengado(); 
        double retencionFuente = 0.05 * calcularDevengado();   
        return fondoSolidaridad + retencionFuente;
    }
}

