/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

/**
 *
 * @author Samuel Prettyman
 */
public class doorControl {
    
    public static double calcWeight(double liters, double pounds){
        
    
    
          
           if(pounds < 0.1 || pounds > 40){
            return -3;
        }
    
            if (liters < 0 ){
              return -1;
            }
            
            if(liters > 15){ 
              return -2;
            }
            
            if (pounds == liters){ 
              return 1;
            }
            
            else {
              return -3;  
            }
                     
            double weight = liters * 2.2;
            return weight;
            
            

}

