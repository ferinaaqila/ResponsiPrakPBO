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
public class MVC_Daftar {
    View_Daftar view = new View_Daftar();
    Model_Daftar model = new Model_Daftar();
    Controller_Daftar control = new Controller_Daftar(view, model);
}

