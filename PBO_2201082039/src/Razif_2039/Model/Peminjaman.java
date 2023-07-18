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
public class Peminjaman {
    private String kodeAnggota;
    private String kodeBuku;
    private String tglpinjam;
    private String tglkembali;
    
    
    public Peminjaman(){
        
    }
    
    public Peminjaman(String kodeAnggota, String kodeBuku, String tglpinjam, String tglkembali){
        this.kodeAnggota = kodeAnggota;
        this.kodeBuku = kodeBuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
        
    }

    

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeanggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodebuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
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
    
    

//    public Object getTglPeminjaman() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Object getTglKembali() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void setKodeAnggota(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void setKodeBuku(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void setPengarang(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void setPenerbit(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    

    
}
