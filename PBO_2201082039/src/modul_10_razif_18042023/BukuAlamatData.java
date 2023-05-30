/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_10_razif_18042023;

/**
 *
 * @author ACER
 */
public class BukuAlamatData {
    private LatihanEntriBukuAlamat data[] = new LatihanEntriBukuAlamat[100];
    private int index;
    
    public void insert(LatihanEntriBukuAlamat entriBukuAlamat){
        data[index] = entriBukuAlamat;
        index++;
    }
    
    public void update(int index, LatihanEntriBukuAlamat entriBukuAlamat){
        data[index] = entriBukuAlamat;
    }
    
    public void detete(int index){
        data[index] = null;
    }
    
    public LatihanEntriBukuAlamat[] getData(){
        return data;
    }
    
    public static void main(String[] args){
        BukuAlamatData data = new BukuAlamatData();
        LatihanEntriBukuAlamat data1 = new LatihanEntriBukuAlamat();
        data1.setNama("Ali");
        data1.setAlamat("Padang");
        data1.setnoHp("082285868279");
        data1.setEmail("ali11@gmail.com");
        data.insert(data1);
        
        LatihanEntriBukuAlamat[] temp = data.getData();
        for (int i=0; i<temp.length; i++){
            if(temp[i]!=null){
                System.out.println("Data ke--> " + (i+1));
                System.out.println("Nama    : " + temp[i].getNama());
                System.out.println("Alamat  : " + temp[i].getAlamat());
                System.out.println("NoHp    : " + temp[i].getnoHp());
                System.out.println("E-mail  : " + temp[i].getEmail());
            }
        }
    }
}

