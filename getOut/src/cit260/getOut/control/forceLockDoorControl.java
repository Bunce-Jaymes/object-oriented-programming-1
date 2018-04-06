/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.exceptions.ForceExceptions;

/**
 *
 * @author Sam Prettyman
 */
public class forceLockDoorControl {
     public static double calcForce(double mass, double acceleration) throws ForceExceptions{

        //pounds = Math.random() * 40 + 1;

        if (mass <= 0){
            throw new ForceExceptions("Mass cannot be less than 0");
        }

        else if (acceleration <=0 ){
            throw new ForceExceptions("Acceleration cannot be less than 0");
        }
      double force = mass * acceleration;
      
        if(force >= 450 && force <= 650){
          return force;
        }
        else{
            throw new ForceExceptions("You slam the door, but it doesn't budge. Maybe we need more or less force");
        }
    }   
}
