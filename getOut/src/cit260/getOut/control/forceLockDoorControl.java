/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

/**
 *
 * @author Sam Prettyman
 */
public class forceLockDoorControl {
     public static double calcForce(double mass, double acceleration){

        //pounds = Math.random() * 40 + 1;

        if (mass <= 0){
            return -1.0;
        }

        if (acceleration <=0 ){
            return -2.0;
        }
      double force = mass * acceleration;
      
        if(force >= 450 && force <= 650){
          return force;
        }
        else{
            return 0;
        }
    }   
}
