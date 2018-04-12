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
public class RoomThree extends View {

    public RoomThree() {
    }
    
     @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("=======================================\n" 
                + "W - Check out that pile of wood \n" 
                + "F - are you hungry? look in the fridge \n" 
                + "C -Check out those super dope cabinetss\n" 
                + "E - Exit\n"
                + "======================================="
                + "\n Enter a key: ");
        inputs[0] = mainInput;

        return inputs;

    }

    public boolean doAction(String[] inputs) {
      String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       switch (menuItem) {
           case "W": viewWood();
           break;
           case "F": viewRefrige();
           break;
           case "C": viewCabinets();
           break;
       
           
           default : ErrorView.display(this.getClass().getName(),"Invalid menu item");
       }
        return false;
    }
    private void viewWood() {
        this.console.println("You found a rusty hammer.”");
        this.console.println("=======================================");
       
    }

    private void viewRefrige() {
        this.console.println("You found a drift pen.");
        this.console.println("=======================================");
    }
    private void viewCabinets() {
        this.console.println("You found a mysterious red key.");
        this.console.println("=======================================");
      

    }

}



