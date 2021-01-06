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
public class View_Login extends JFrame{
    JLabel jltitle = new JLabel("LOGIN");
    JLabel jluser = new JLabel("Username ");
    JTextField jtuser = new JTextField();
    JLabel jlpass = new JLabel("Password ");
    JPasswordField jtpass =  new JPasswordField();
    
    JButton btnlogin = new JButton("Login");
    JButton btndaftar = new JButton("Daftar");
    
    public View_Login()
    {
        setTitle("Login");
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
        add(btnlogin);
        btnlogin.setBounds(50, 210, 90, 20);
        add(btndaftar);
        btndaftar.setBounds(180, 210, 90, 20);
        
    }

    public String getUser() {
        return jtuser.getText();
    }

    public String getPass() {
        return jtpass.getText();
    }
    
}
