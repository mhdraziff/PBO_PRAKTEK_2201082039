/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_10_razif_18042023;

/**
 *
 * @author ACER
 */
public class StudenRecordExample {
    public static void main(String[] args) {
        StudenRecord anna = new StudenRecord();
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(10);
        anna.setMathGrade(80);
        anna.setEnglishGrade(70);
        anna.setScienceGrade(80);
        anna.setStudentCount(5);
        //////
        System.out.println("Nama        : "+anna.getName());
        System.out.println("Alamat      : "+anna.getAddress());
        System.out.println("Umur        : "+anna.getAge());
        System.out.println("Matematika  : "+anna.getMathGrade());
        System.out.println("B. Inggris  : "+anna.getEnglishGrade());
        System.out.println("Pengetahuan : "+anna.getScienceGrade());
        System.out.println("Rata-Rata   : "+anna.getAverage());
        ///System.out.println("Jumlah Siswa:"+anna.getStudentCount ());
        
        StudenRecord ali = new StudenRecord();
        ali.setName("Ali");
        ali.setAddress("Padang");
        ali.print("");
        ali.print(80, 70, 90);
        
        StudenRecord budi = new StudenRecord("Budi, Padang");
        budi.print("");
        budi.print(80, 70, 90);
        
        System.out.println("Jumlah Siswa    : "+StudenRecord.getStudentCount());
    }
    
}
