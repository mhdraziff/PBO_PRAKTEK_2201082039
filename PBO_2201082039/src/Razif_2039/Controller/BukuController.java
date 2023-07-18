/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razif_2039.Controller;
import Razif_2039.Model.*;
import Razif_2039.View.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class BukuController {
    private FormBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
    
    
    public BukuController(FormBuku formbuku){
        this.formBuku = formbuku;
        bukuDao = new BukuDao();
    }

    
    public void clearForm(){
        formBuku.getTxtKodeBuku().setText(" ");
        formBuku.getTxtJudulBuku().setText(" ");
        formBuku.getTxtPengarang().setText(" ");
        formBuku.getTxtPenerbit().setText(" "); 
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formBuku.getTabelBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAll();
        for (Buku a : list ){
            Object[] row = {
                a.getKodeBuku(),
                a.getJudulBuku(),
                a.getPengarang(),
                a.getPenerbit()
            };
            tabelModel.addRow(row);
        }
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.insert(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert OK");
    }
    
    public void updateBuku(){
        int index = formBuku.getTabelBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update OK");
    }
    
     public void getBuku(){
        int index = formBuku.getTabelBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku!=null){
            formBuku.getTxtKodeBuku().
                    setText(buku.getKodeBuku());
            formBuku.getTxtJudulBuku().
                     setText(buku.getJudulBuku());
            formBuku.getTxtPengarang().
                     setText(buku.getPengarang());
            formBuku.getTxtPenerbit().
                     setText(buku.getPenerbit());
            
                }
     }
     
     public void deleteBuku(){
        int index = formBuku.getTabelBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku, "Delete OK");
    }
}

    

