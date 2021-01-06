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
public class Controller_About {
     View_About view;
    
    public Controller_About(View_About va) {
        this.view = view;
        
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
                view.setVisible(true);
                
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
