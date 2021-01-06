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
public class MVC_Home{
    View_Home view = new View_Home();
    Model_Home model = new Model_Home();
    Controller_Home control = new Controller_Home(view, model);
}
