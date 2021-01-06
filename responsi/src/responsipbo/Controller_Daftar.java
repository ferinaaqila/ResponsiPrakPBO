/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Controller_Daftar {
    Model_Daftar model;
    View_Daftar view;
    
    public Controller_Daftar(View_Daftar view, Model_Daftar model) {
        this.view = view;
        this.model = model;
        
        if (model.getBanyakData() != 0) {
            String dataMahasiswa[][] = model.readDaftar();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view.btndaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = view.getUser();
                String pass = view.getPass();
                model.insertDaftar(user, pass);

                String dataDaftar[][] = model.readDaftar();
            }
            
        });
        
        view.btnbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new MVC_Login();
            }
            
        });
    }
}

