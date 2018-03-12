/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

/**
 *
 * @author Samuel Prettyman
 */
public interface ViewInterface {
    
    public void display();
    public String[] getInputs();
    public String getInputs(String promptMessage);
    public boolean doAction(String[] inputs);
    
}
