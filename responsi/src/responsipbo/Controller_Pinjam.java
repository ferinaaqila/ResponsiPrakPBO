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

public class Controller_Pinjam {
    Model_Pinjam model;
    View_Pinjam view;
    JFrame f;

    public Controller_Pinjam(View_Pinjam view, Model_Pinjam model) {
        this.view = view;
        this.model = model;
        
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

        view.bTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String MemberId = view.getMemberId();
                String MemberName = view.getMemberName();
                String BookId = view.getBookId();
                String BookName = view.getBookName();
                model.insertData(MemberId, MemberName, BookId, BookName);
            }
        });
        
        view.bBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                view.fMemberId.setText("");
                view.fMemberName.setText("");
                view.fBookId.setText("");
                view.fBookName.setText("");
            }
        });
    }
}