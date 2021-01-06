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
public class MVC_Tampil {
    View_Tampil view = new View_Tampil();
    Model_Tampil model = new Model_Tampil();
    Controller_Tampil control = new Controller_Tampil(view, model); 
}
