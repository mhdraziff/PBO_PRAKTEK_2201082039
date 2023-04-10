/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_razif_27032023;

/**
 *
 * @author ACER
 */
public class KonversiBilangan4 {
     public static void main(String[] args) {
        String bilanganHeksadesimal = "47F";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganHeksadesimal, 16);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke biner
        String bilanganBiner = Integer.toBinaryString(bilanganDesimal);
        System.out.println("Biner: " + bilanganBiner);

        // Konversi ke oktal
        String bilanganOktal = Integer.toOctalString(bilanganDesimal);
        System.out.println("Oktal: " + bilanganOktal);
    }

}
