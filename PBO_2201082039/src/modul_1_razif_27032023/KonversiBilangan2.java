/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_razif_27032023;

/**
 *
 * @author ACER
 */
public class KonversiBilangan2 {
    public static void main(String[] args) {
        String bilanganBiner = "1001001101";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganBiner, 2);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke heksadesimal
        String bilanganHeksadesimal = Integer.toHexString(bilanganDesimal);
        System.out.println("Heksadesimal: " + bilanganHeksadesimal);

        // Konversi ke oktal
        String bilanganOktal = Integer.toOctalString(bilanganDesimal);
        System.out.println("Oktal: " + bilanganOktal);
    }
    
}
