/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.control.forceLockDoorControl;
import cit260.getOut.control.pinCodeDoorControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @Samuel Prettyman
 */
class DemoTestView02 {

    void displayDemoTestView02() {
        boolean endView = false;
        do {
            boolean inputs = getInputs();
            if (inputs != true){
                return;
            }
            endView = doAction();
        } while (endView != true);
    }

    private boolean getInputs() {
                
        boolean valid = false;
        while (valid == false){
   

        System.out.println("This door is locked and you need to break the lock," );
        System.out.println("\nYou need to configure the force by entering the mass of the hammer and speed of your swing ");
        
        System.out.println("=======================================");
           System.out.println("Enter an how fast you are swinging the hammer in meters/second: ");
           Scanner input;
           input = new Scanner(System.in);
           double acceleration = input.nextInt();
           System.out.println("=======================================");
           
           System.out.println("=======================================");
           System.out.println("Enter how much mass the hammer has : ");
           Scanner input2;
           input2 = new Scanner(System.in);
           double mass = input2.nextInt();
           System.out.println("=======================================");
           
           double length = String.valueOf(acceleration).length();
           double force = mass * acceleration; 
           
        
           
                double endForce = forceLockDoorControl.calcForce(mass,acceleration);
                
                if(endForce >= 450 && endForce <= 6501){
                    
                    break;
                }
                if (endForce < 450){
                    System.out.println("You need more force to break the lock\n");
                    System.out.println("=======================================");
                    continue;
                }
                
                 if (endForce > 650){
                    System.out.println("Thats to much force, make it a little softer to unlock the door\n");
                    System.out.println("=======================================");
                    continue;
                }
            }
        
        return true;
        } 

    private boolean doAction() {
        System.out.println("You entered the correct force, the door is now unlocked.");
        return true;
    }
}
