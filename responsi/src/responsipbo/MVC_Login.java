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
public class MVC_Login {
    View_Login view = new View_Login();
    Model_Login model = new Model_Login();
    Controller_Login control = new Controller_Login(view, model);
}
