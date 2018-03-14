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
public class DemoDoorNum3 extends View {

    public DemoDoorNum3() {
    }
    
     @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("=======================================\n" 
                + "W - Check out that pile of wood \n" 
                + "F - are you hungry? look in the fridge \n" 
                + "C -Check out those super dope cabinetss\n" 
                + "E - Exit\n"
                + "=======================================\n"
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
       
           
           default : System.out.println("Invalid menu item.");
       }
        return false;
    }
    private void viewWood() {
        System.out.println("You found a rusty hammer.”");
        System.out.println("=======================================");
       
    }

    private void viewRefrige() {
        System.out.println("You found a drift pen.");
        System.out.println("=======================================");
    }
    private void viewCabinets() {
        System.out.println("You found a mysterious red key.");
        System.out.println("=======================================");
      

    }

}



