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
import javax.swing.SwingUtilities;

public class DataSwingMVC {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    RunMVC();
                } catch (Exception e) {
                }
            }
        });
    }
    public static void RunMVC() throws Exception {
        new MVC_Pinjam();
    }
}
