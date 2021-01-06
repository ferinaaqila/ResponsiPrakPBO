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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class View_Pinjam extends JFrame{
    JLabel lJudul = new JLabel("PERPUSTAKAAN");
    JTextField fMemberId = new JTextField();// panjang karakter yang bisa diinputkan adalah 10
        JLabel lMemberId = new JLabel("ID Anggota ");
    JTextField fMemberName = new JTextField();// panjang karakter yang bisa diinputkan adalah 10
        JLabel lMemberName = new JLabel("Nama ");
    JTextField fBookId = new JTextField();// panjang karakter yang bisa diinputkan adalah 10
        JLabel lBookId = new JLabel("IB Buku ");
    JTextField fBookName = new JTextField();// panjang karakter yang bisa diinputkan adalah 10
        JLabel lBookName = new JLabel("Judul Buku ");
    
    JButton bTambah = new JButton("Tambah");
    JButton bBatal= new JButton("Batal");
    
    JButton bHome = new JButton("Home");
    JButton bPinjam= new JButton("Pinjam");
    JButton bTampil = new JButton("Tampil");
    JButton bAbout = new JButton("About");
    JButton bLogout = new JButton("LogOut");
     
    public View_Pinjam(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(825,400);
        

        //ADD COMPONENT
        add(lJudul);
        add(fMemberId);
        add(lMemberId);
        add(fMemberName);
        add(lMemberName);
        add(fBookId);
        add(lBookId);
        add(fBookName);
        add(lBookName);
        
        //LABEL
        lJudul.setBounds(90, 30, 200, 20);
        lMemberId.setBounds(5, 65, 120, 20);
        lMemberName.setBounds(5, 100, 120, 20);
        lBookId.setBounds(5,135,120,20);
        lBookName.setBounds(5,170,170,20);
        
        //TEXTFIELD
        fMemberId.setBounds(110, 65, 160, 20);
        fMemberName.setBounds(110, 100, 160, 20);
        fBookId.setBounds(110, 135, 160, 20);
        fBookName.setBounds(110, 170,160,20);
        
        //BUTTON
        add(bHome);
        add(bPinjam);
        add(bTampil);
        add(bAbout);
        add(bLogout);
        add(bTambah);
        add(bBatal);
        
        bHome.setBounds(40, 240, 100, 20);
        bPinjam.setBounds(170, 240, 100, 20);
        bTampil.setBounds(40, 280, 100, 20);
        bAbout.setBounds(170, 280, 100, 20);
        bLogout.setBounds(90, 320, 100, 20);
        bTambah.setBounds(200, 320, 100, 20);
        bBatal.setBounds(300, 320, 100, 20);
    }

    public String getMemberId() {
        return fMemberId.getText();
    }
    
    public String getMemberName() {
        return fMemberName.getText();
    }
     
    public String getBookId() {
        return fBookId.getText();
    }
    
    public String getBookName() {
        return fBookName.getText();
    }
}
