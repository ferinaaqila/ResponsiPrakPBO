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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class View_Home extends JFrame{
    JLabel lJudul = new JLabel("SILAHKAN ISI DATA ANDA");
        
    JButton bHome = new JButton("Home");
    JButton bPinjam= new JButton("Pinjam");
    JButton bTampil = new JButton("Tampil");
    JButton bAbout = new JButton("About");
    JButton bLogout = new JButton("LogOut");

     
    public View_Home(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(825,400);
        

        //ADD COMPONENT
        add(lJudul);
        
        //LABEL
        lJudul.setBounds(90, 30, 200, 20);
        
        //BUTTON
        add(bHome);
        add(bPinjam);
        add(bTampil);
        add(bAbout);
        add(bLogout);
         
        bHome.setBounds(40, 240, 100, 20);
        bPinjam.setBounds(170, 240, 100, 20);
        bTampil.setBounds(40, 280, 100, 20);
        bAbout.setBounds(170, 280, 100, 20);
        bLogout.setBounds(90, 320, 100, 20);
    }
}