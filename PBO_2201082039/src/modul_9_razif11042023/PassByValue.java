/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_9_razif11042023;

/**
 *
 * @author ACER
 */
public class PassByValue {
    public static void main(String[] args){
        int i = 10;
        // Mencetak nilai i
        System.out.println("Nilai i sebelum method dipanggil: " + i);

        // Memanggil method test
        // Passing i sebagai parameter
        test(i);

        // Mencetak nilai i setelah method dipanggil
        System.out.println("Nilai i setelah method dipanggil: " + i);
    }

    public static void test(int j) {
        // Merubah nilai parameter j
        j = 33;
        System.out.println("Nilai j di dalam method: " +j);
    }
}
