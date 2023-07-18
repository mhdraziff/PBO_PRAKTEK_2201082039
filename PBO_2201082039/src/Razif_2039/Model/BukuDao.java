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
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku("A001", "PBO", "Afrizal", "PT Yudistira"));
        data.add(new Buku("A002", "Sistem Digita", "Munnawarah", "Makmur"));
   
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index,Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
     
    public List<Buku> getAll(){
         return data;
    }

}
