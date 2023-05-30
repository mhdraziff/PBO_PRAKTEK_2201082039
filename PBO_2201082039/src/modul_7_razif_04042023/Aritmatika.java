/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7_razif_04042023;

/**
 *
 * @author ACER
 */
public class Aritmatika {
    public int tambah(int a, int b){
        return a+b;
    }
    
    public boolean cekGanjil(int a) {
        return (a % 2 == 1);
    }
    
    public static void main(String[] args) {
        Aritmatika aritmatika = new Aritmatika();
        int c = aritmatika.tambah(12, 7);
        
        System.out.println("Nilai C = "+c);
        System.out.println("Ganjil ? "+aritmatika.cekGanjil(c));
    }
}
