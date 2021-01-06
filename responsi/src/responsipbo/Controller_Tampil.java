/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller_Tampil {
    Model_Tampil model;
    View_Tampil view;
    View_Pinjam pinjam;
    JFrame f;

    public Controller_Tampil(View_Tampil view, Model_Tampil model) {
        this.view = view;
        this.model = model;
        
        if (model.getBanyakData()!= 0) {
            String data[][] = model.readData();
            view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view.bHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MVC_Home();
            }
        });
        
        view.bPinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                new MVC_Pinjam();
            }
        });
        view.bTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new MVC_Tampil();
            }
        });
        
        view.bAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        view.bLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            
            }
        });
        
        view.bEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String MemberId = pinjam.getMemberId();
                String MemberName = pinjam.getMemberName();
                String BookId = pinjam.getBookId();
                String BookName = pinjam.getBookName();
                model.updateData(MemberId, MemberName, BookId, BookName);
                
                String dataMahasiswa[][] = model.readData();
                view.tabel.setModel(new JTable(dataMahasiswa, view.namaKolom).getModel());
            }
        });
        
        view.bHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               String MemberId = pinjam.getMemberId();
                
               int input = JOptionPane.showConfirmDialog(null,"Menghapus view ini?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

               if (input == 0) {
               model.deleteData(MemberId);
               String dataMahasiswa[][] = model.readData();
               view.tabel.setModel(new JTable(dataMahasiswa, view.namaKolom).getModel());
               }else{
               JOptionPane.showMessageDialog(null, "Hapus Gagal!");
               }
            }
        });
        
        view.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = view.tabel.getSelectedRow();

                String MemberId = view.tabel.getValueAt(baris, 0).toString();
                String MemberName = view.tabel.getValueAt(baris, 1).toString();
                String BookId = view.tabel.getValueAt(baris, 2).toString();
                String BookName = view.tabel.getValueAt(baris, 3).toString();
                
                pinjam.fMemberId.setText(MemberId);
                pinjam.fMemberName.setText(MemberName);
                pinjam.fBookId.setText(BookId);
                pinjam.fBookName.setText(BookName);
            }
        });
    }
}