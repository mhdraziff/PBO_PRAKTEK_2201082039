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
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;
    
    
    public PeminjamanController(FormPeminjaman formpeminjaman){
        this.formPeminjaman = formpeminjaman;
        peminjamanDao = new PeminjamanDao();
    }
     
    public void clearForm(){
        formPeminjaman.getTxtKodeAnggota().setText(" ");
        formPeminjaman.getTxtKodeBuku().setText(" ");
        formPeminjaman.getTxtTglPeminjaman().setText(" ");
        formPeminjaman.getTxtTglKembali().setText(" "); 
    }

     public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman a : list ){
            Object[] row = {
                a.getKodeAnggota(),
                a.getKodeBuku(),
                a.getTglpinjam(),
                a.getTglkembali()
            };
            tabelModel.addRow(row);
        }
    }
     
     public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setKodeanggota(formPeminjaman.getTxtKodeAnggota().getText());
        peminjaman.setKodebuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.insert(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Insert OK");
    }
     
      public void updatePeminjaman(){
        int index = formPeminjaman.getTabelPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        peminjaman.setKodeanggota(formPeminjaman.getTxtKodeAnggota().getText());
        peminjaman.setKodebuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(index, peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Update OK");
    }
    
     public void getPeminjaman(){
        int index = formPeminjaman.getTabelPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman!=null){
            formPeminjaman.getTxtKodeAnggota().
                    setText(peminjaman.getKodeAnggota());
            formPeminjaman.getTxtKodeBuku().
                     setText(peminjaman.getKodeBuku());
            formPeminjaman.getTxtTglPeminjaman().
                     setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglKembali().
                     setText(peminjaman.getTglkembali());
            
                }
     }
     
     public void deletePeminjaman(){
        int index = formPeminjaman.getTabelPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        JOptionPane.showMessageDialog(formPeminjaman, "Delete OK");
    }
   
}
