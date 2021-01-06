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
import javax.swing.table.DefaultTableModel;


public class View_Tampil extends JFrame{
    View_Pinjam pinjam;
    JLabel lJudul = new JLabel("PERPUSTAKAAN");
      
    JButton bHome = new JButton("Home");
    JButton bPinjam= new JButton("Pinjam");
    JButton bTampil = new JButton("Tampil");
    JButton bAbout = new JButton("About");
    JButton bLogout = new JButton("LogOut");
    JButton bEdit = new JButton("Edit");
    JButton bHapus = new JButton("Hapus");
     
    public String MemberId, MemberName, BookId, BookName;
    int jmlData;
    String data[][] = new String[400][4];
    
    JTable tabel;
    DefaultTableModel tableModel; //otomatis dibuat kalo buat JTable
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID","Nama","ID Buku","Judul Buku"}; //membuat kolom dgn array tipe object;

     
    public View_Tampil(){
        tabel = new JTable(data,namaKolom); //tabel merupakan variabel untuk tabelnya dengan isi tablemodel
        scrollPane = new JScrollPane(tabel);
        add(scrollPane);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(825,400);
        add(scrollPane);
        scrollPane.setBounds(300, 30, 500, 300);
        

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
        add(bEdit);
        add(bHapus);
         
        bHome.setBounds(40, 240, 100, 20);
        bPinjam.setBounds(170, 240, 100, 20);
        bTampil.setBounds(40, 280, 100, 20);
        bAbout.setBounds(170, 280, 100, 20);
        bLogout.setBounds(90, 320, 100, 20);
        bEdit.setBounds(200, 320, 100, 20);
        bHapus.setBounds(300, 320, 100, 20);
    }
    
    public String getMemberId() {
        return pinjam.fMemberId.getText();
    }
    
    public String getMemberName() {
        return pinjam.fMemberName.getText();
    }
     
    public String getBookId() {
        return pinjam.fBookId.getText();
    }
    
    public String getBookName() {
        return pinjam.fBookName.getText();
    }
}
