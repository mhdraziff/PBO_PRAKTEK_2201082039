/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razif_2039.Model;
import java.util.*;


/**
 *
 * @author ACER
 */
public class PeminjamanDao {
    private List<Peminjaman> data = new ArrayList();
    
    public PeminjamanDao(){
        data.add(new Peminjaman("A1", "001", "23-06-2023", "26-06-2023"));
    }
    
    public void insert(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    public void update(int index,Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
        
    }
     
    public List<Peminjaman> getAll(){
         return data;
    }

}

