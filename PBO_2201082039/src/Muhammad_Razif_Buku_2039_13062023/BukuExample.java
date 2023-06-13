/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Muhammad_Razif_Buku_2039_13062023;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class BukuExample {
    private List<Buku> data = new ArrayList<Buku>();

    public BukuExample() {
        data.add(new Buku("B001", "Pascal", "Andi", "1990"));
        data.add(new Buku("B002", "Matematika", "Andi", "1995"));
    }
    
    public void insert(Buku m){
        data.add(m);
    }
    
    public void update(int index,Buku m){
        data.set(index,m);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAllBuku(){
        return data;
    }
}
