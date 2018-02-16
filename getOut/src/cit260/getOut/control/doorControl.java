
package cit260.getOut.control;


/**
 *packa
 * @author Samuel Prettyman
 */

public class doorControl {
    
    public static double calcWeight(double guessLiters, double pounds){
        
        //pounds = Math.random() * 40 + 1;
        
        if (pounds < 1.0 || pounds > 40.0){
            return -3.0;
        }
           
        if (guessLiters < 0 ){
            return -1;
        }
            
        if(guessLiters > 15){
            return -2;
        }
            
        double guessWeight = guessLiters * 2.2;
            
        if (pounds == guessWeight){
            return 1;
        }
        else{
            return -3;
        }    
    }




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
    
    public static double calcForceTwo(double massTwo, double acellerationTwo){



    if (massTwo <= 0){
        return -1.0;
    }

    if (acellerationTwo <=0 ){
        return -2.0;
}   
    double forceTwo = massTwo * acellerationTwo;

    if(forceTwo >= 450 && forceTwo <= 650){
        return forceTwo;
        }
    else{
        return 0;
}

}
}





