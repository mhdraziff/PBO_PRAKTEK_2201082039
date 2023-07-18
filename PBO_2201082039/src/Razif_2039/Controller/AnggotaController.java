/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razif_2039.Controller;
import Razif_2039.View.*;
import Razif_2039.Model.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    
    public AnggotaController(FormAnggota formanggota){
        this.formAnggota = formanggota;
        anggotaDao = new AnggotaDao();
    }
    
    public void clearForm(){
        formAnggota.getTxtKodeAnggota().setText(" ");
        formAnggota.getTxtNamaAnggota().setText(" ");
        formAnggota.getTxtAlamat().setText(" ");
        formAnggota.getCboJenisKelamin().removeAllItems();
        formAnggota.getCboJenisKelamin().addItem("L");
        formAnggota.getCboJenisKelamin().addItem("P");   
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAll();
        for (Anggota a : list ){
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().
                getSelectedItem().toString());
        anggotaDao.insert(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert OK");
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTabelAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.update(index, anggota);
        JOptionPane.showMessageDialog(formAnggota, "Update OK");
    }
    
     public void getAnggota(){
        int index = formAnggota.getTabelAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.getTxtKodeAnggota().
                    setText(anggota.getKodeAnggota());
            formAnggota.getTxtNamaAnggota().
                     setText(anggota.getNamaAnggota());
            formAnggota.getTxtAlamat().
                     setText(anggota.getAlamat());
            formAnggota.getCboJenisKelamin().
                    addItem(anggota.getJenisKelamin());
                }
     }
     
     public void deleteAnggota(){
        int index = formAnggota.getTabelAnggota().getSelectedRow();
        anggotaDao.delete(index);
        JOptionPane.showMessageDialog(formAnggota, "Delete OK");
    }
}
