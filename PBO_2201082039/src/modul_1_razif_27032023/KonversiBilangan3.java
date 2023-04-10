/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_razif_27032023;

/**
 *
 * @author ACER
 */
public class KonversiBilangan3 {
    public static void main(String[] args) {
        String bilanganOktal = "76";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganOktal, 8);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke biner
        String bilanganBiner = Integer.toBinaryString(bilanganDesimal);
        System.out.println("Biner: " + bilanganBiner);

        // Konversi ke heksadesimal
        String bilanganHeksadesimal = Integer.toHexString(bilanganDesimal);
        System.out.println("Heksadesimal: " + bilanganHeksadesimal);
    }

}
