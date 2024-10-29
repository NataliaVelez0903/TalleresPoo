/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Corte2taller3;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularNominaTotal() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSalarioNeto();
        }
        return total;
    }

    public void mostrarInformacionEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getInformacion() + ", Salario Neto: $" + empleado.calcularSalarioNeto());
        }
    }
}
