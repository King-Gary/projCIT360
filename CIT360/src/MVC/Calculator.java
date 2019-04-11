/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Gary
 */
public class Calculator {
    
    public static void main(String[] args) {

    	

    	View theView = new View();

        

    	Model theModel = new Model();

        

        Controller theController = new Controller(theView,theModel);

        

        theView.setVisible(true);

        

    }
}
