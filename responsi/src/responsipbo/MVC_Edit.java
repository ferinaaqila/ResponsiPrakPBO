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
public class MVC_Edit {
    View_Edit view = new View_Edit();
    Model_Edit model = new Model_Edit();
    Controller_Edit control = new Controller_Edit(view, model);
}
