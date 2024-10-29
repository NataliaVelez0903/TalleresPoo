/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Corte2taller2;

/**
 *
 * @author USUARIO
 */
public class Operaciones {
        public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static String dividir(int num1, int num2) {
        if (num2 == 0) {
            return "No se puede dividir entre 0";
        }
        return "" + num1 /  num2;
    }
}
