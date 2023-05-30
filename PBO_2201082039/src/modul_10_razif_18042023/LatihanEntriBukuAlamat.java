/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_10_razif_18042023;

/**
 *
 * @author ACER
 */
public class LatihanEntriBukuAlamat {
    private String nama;
    private String alamat;
    private String noHp;
    private String email;

    public LatihanEntriBukuAlamat(String nama, String alamat, String noHp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.email = email;
    }

    LatihanEntriBukuAlamat() {
        }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getnoHp() {
        return noHp;
    }

    public void setnoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void display() {
        System.out.println("Nama    : " + nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("No Hp   : " + noHp);
        System.out.println("Email: " + email);
    }
}
