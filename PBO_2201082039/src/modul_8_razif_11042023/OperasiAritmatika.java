/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_8_razif_11042023;

/**
 *
 * @author ACER
 */
public class OperasiAritmatika {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <number1> <number2>");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        System.out.println("Penjumlahan = " + sum);
        System.out.println("Pengurangan = " + difference);
        System.out.println("Perkalian   = " + product);
        System.out.println("Pembagian   = " + quotient);
    }
}
