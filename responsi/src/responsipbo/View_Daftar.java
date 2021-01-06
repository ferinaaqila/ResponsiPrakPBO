/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ASUS
 */
public class View_Daftar extends JFrame {
    JLabel jltitle = new JLabel("DAFTAR");
    JLabel jluser = new JLabel("Username ");
    JTextField jtuser = new JTextField();
    JLabel jlpass = new JLabel("Password ");
    JTextField jtpass =  new JTextField();
    
    JButton btndaftar = new JButton("Daftar");
    JButton btnbatal = new JButton("Batal");
    
    public View_Daftar()
    {
        setTitle("Daftar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400,350);
        setLocationRelativeTo(null);
        
        //TITLE =================================================================
        add(jltitle);
        jltitle.setBounds(170, 30, 90, 20);
        
        //USER =================================================================
        add(jluser);
        jluser.setBounds(70, 100, 90, 20);
        add(jtuser);
        jtuser.setBounds(140, 100, 120, 20);
        
        //PASS =================================================================
        add(jlpass);
        jlpass.setBounds(70, 150, 90, 20);
        add(jtpass);
        jtpass.setBounds(140, 150, 120, 20);
        
        // BUTTON ==============================================================
        add(btndaftar);
        btndaftar.setBounds(50, 210, 90, 20);
        add(btnbatal);
        btnbatal.setBounds(180, 210, 90, 20);
        
    }

    public String getUser() {
        return jtuser.getText();
    }

    public String getPass() {
        return jtpass.getText();
    }
    
}
