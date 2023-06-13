/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_11_Teori_Razif_13062023;

/**
 *
 * @author ACER
 */
public class Circle extends Shape { 
    
    private int r;
    private final double phi = 3.14;
    private double area;
    
    public int getR(){        
        return r;   
    }
    
    public void setR(int r){
        this.r = r;
    }
    
    public String getName(){
        
        return "Lingkaran";   
    }

    public double getArea() {
        area = (phi)*(r*r);
        return area;
    }
    
    private double s;
    
    public double getS(){        
        return s;   
    }
    
    public void setS(int s){
        this.s = s;
    }
    
    public String getName2(){
        
        return "Persegi";   
    }

    public double getArea2() {
        area = s*s;
        return area;
    }
    
}
