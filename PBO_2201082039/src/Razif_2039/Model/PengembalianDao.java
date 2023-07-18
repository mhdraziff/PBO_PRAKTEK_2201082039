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
public class PengembalianDao {
    private List<Pengembalian> data = new ArrayList();
    
    public PengembalianDao(){
        //data.add(new Pengembalian("A", "Ali", "A01", "PBO", "23-07-2023", "29-07-2023", "01-08-2023", "1", "20000"));
       
    }
    
    public void insert(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    
    public void update(int index,Pengembalian pengembalian){
        data.set(index, pengembalian);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pengembalian getPengembalian(int index){
        return data.get(index);
        
    }
     
    public List<Pengembalian> getAll(){
         return data;
    }

    
}
