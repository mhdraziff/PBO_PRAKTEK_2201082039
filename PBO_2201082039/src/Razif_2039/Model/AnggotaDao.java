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
public class AnggotaDao {
    private List<Anggota> data = new ArrayList();
    
    public AnggotaDao(){
        data.add(new Anggota("A001", "Ali", "Padang", "L"));
        data.add(new Anggota("A002", "Ani", "Padang", "P"));
   
    }
    
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    
    public void update(int index,Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
     
    public List<Anggota> getAll(){
         return data;
    }
    
    
    
}
