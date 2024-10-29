/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Corte2taller3;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        EmpleadoHoras empleadoHoras = new EmpleadoHoras("Carlos", "Perez", "12346789", 0, 160, 20);
        EmpleadoSueldo empleadoSueldo = new EmpleadoSueldo("Ana", "Gomez", "12364321", 3000, 150, 100, 200, 150);
        EmpleadoGerente empleadoGerente = new EmpleadoGerente("Luis", "Ramirez", "234567843", 5000, 250, 150, 300, 250, 1000, 500);

        empresa.agregarEmpleado(empleadoHoras);
        empresa.agregarEmpleado(empleadoSueldo);
        empresa.agregarEmpleado(empleadoGerente);

        empresa.mostrarInformacionEmpleados();
        System.out.println("Nómina Total de la Empresa: $" + empresa.calcularNominaTotal());
    }
}

