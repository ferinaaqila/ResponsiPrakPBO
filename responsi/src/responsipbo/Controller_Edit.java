/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class Controller_Edit {
     Model_Edit model;
     View_Edit view;
    
    public Controller_Edit(View_Edit view, Model_Edit model) {
        this.view = view;
        this.model = model;
        
        if (model.getBanyakData() != 0) {
            String dataMahasiswa[][] = model.readPeminjam();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view.jbtambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idanggota = view.getIdanggota();
                String nama = view.getNama();
                String idbuku = view.getIdbuku();
                String judul = view.getJudul();
                model.updatePeminjam(idanggota,nama,idbuku);

                String dataDaftar[][] = model.readPeminjam();
            }
            
        });
        
        view.jbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new MVC_Home();
            }
            
        });
        
        view.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new MVC_Pinjam();
                
            }
            
        });
        
        view.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new MVC_Tampil();
                
            }
            
        });
        
        view.jbabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new MVC_About();
            }
            
        });
                
                
        view.jbhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new MVC_Home();
                
            }
            
        });
        
         view.jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Logout ?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    view.setVisible(false);
                    new MVC_Login();
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Logout");
                }
                
            }
            
        });
    }
    
    
}