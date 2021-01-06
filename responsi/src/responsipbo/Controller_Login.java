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
public class Controller_Login {
    Model_Login model;
    View_Login view;
    
    public Controller_Login(View_Login vl, Model_Login ml) {
        this.view = view;
        this.model = model;
        
        if (model.getBanyakData() != 0) {
            String dataMahasiswa[][] = model.readLogin();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view.btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try {
                String sql = "SELECT * FROM akun WHERE Username='"+view.getUser()+"' AND Password='"+view.getPass()+"'";
                ResultSet rs = model.statement.executeQuery(sql);
                if(rs.next()){
                    if(view.getUser().equals(rs.getString("Username")) && view.getPass().equals(rs.getString("Password"))){
                        JOptionPane.showMessageDialog(null, "Berhasil login");
                         view.setVisible(false);
                        new MVC_Home();
                        
                    }
                }
                else if (view.getUser().equals("") && view.getPass().equals("")){
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                 }
                else {
                        JOptionPane.showMessageDialog(null, "Username atau Password salah");
                }
                
                
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Gagal Login");
                System.out.println(ex.getMessage());
            }
            }
        
        });
        view.btndaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new MVC_Daftar();
            }
        
        });
        
        
        
    }

    
}
