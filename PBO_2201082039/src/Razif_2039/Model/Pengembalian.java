/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razif_2039.Model;

/**
 *
 * @author ACER
 */
public class Pengembalian {
    private String kodeAnggota;
    private String namaAnggota;
    private String kodeBuku;
    private String judulBuku;
    private String tglpinjam;
    private String tglkembali;
    private String tgldikembalikan;
    private int terlambat;
    private double denda;


    public Pengembalian(){
        
    }

    public Pengembalian(String kodeAnggota, String namaAnggota, String kodeBuku, String judulBuku, String tglpinjam, String tglkembali, String tgldikembalikan, int terlambat, double denda){
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
        this.tgldikembalikan = tgldikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
        
    }
    

    
    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public String getTgldikembalikan() {
        return tgldikembalikan;
    }

    public void setTgldikembalikan(String tgldikembalikan) {
        this.tgldikembalikan = tgldikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(Double denda) {
        this.denda = denda;
    }

    
    
    
}


