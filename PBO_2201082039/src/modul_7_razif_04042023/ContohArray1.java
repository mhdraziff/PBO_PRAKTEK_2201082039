/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7_razif_04042023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class ContohArray1 {
    @SuppressWarnings("empty-statement")
    public static void main (String[] args){
        int angka[] = new int[10];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            for(int i=0; i<angka.length; i++) {
                 System.out.print("Nilai ke " + (i+1) + " ---> " );
                 angka[0] = Integer.parseInt(dataIn.readLine());
            }
        }catch (IOException | NumberFormatException ex) {
        };
        int max = 0;
        for (int i=0; i<angka.length; i++) {
            max = (angka[i] > max)? angka[i] : max;
        }
        
        for(int i=0; i<angka.length; i++){
            System.out.println("Nilai ke " + (i+1) + "--->" +angka[0]);
        }
        System.out.println("Nilai Max = " +max);
    }
}