/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_9_razif11042023;

/**
 *
 * @author ACER
 */
public class EqualsTest {
    public static void main(String[] args){
        String str1, str2;
        str1 = "Free the bound periodicals.";
        str2 = str1;
        
        System.out.println("String1: "+ str1);
        System.out.println("String2: "+ str2);
        System.out.println("Same object "+ (str1.equals(str2)));
        
        str2 = str1;
        
        System.out.println("String1: "+ str1);
        System.out.println("String2: "+ str2);
        System.out.println("Same object? "+ (str1.equals(str2)));
        System.out.println("Same value? "+ str1.equals(str2));
    }
}
