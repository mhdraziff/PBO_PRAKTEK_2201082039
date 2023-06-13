/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_11_Teori_Razif_13062023;

/**
 *
 * @author ACER
 */
public class CircleExample {
    public static void main(String[] args){
        Circle Lingkaran = new Circle();
        Lingkaran.setR(7);
        System.out.println("Jari-jari lingkaran => "+Lingkaran.getR());
        System.out.println("Luas Lingkaran => "+Lingkaran.getArea());
        System.out.println("");
        Circle Persegi = new Circle();
        Persegi.setS(7);
        System.out.println("Sisi Persegi => "+Persegi.getS());
        System.out.println("Luas Persegi => "+Persegi.getArea2());
    }
}
