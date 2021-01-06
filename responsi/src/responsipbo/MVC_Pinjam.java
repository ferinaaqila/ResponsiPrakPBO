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
public class MVC_Pinjam {
    View_Pinjam view = new View_Pinjam();
    Model_Pinjam model = new Model_Pinjam();
    Controller_Pinjam control = new Controller_Pinjam(view, model); 
}