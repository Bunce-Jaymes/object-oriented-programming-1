/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getout;

import cit260.getOut.model.Player;

/**
 *
 * @author jayme
 */
public class GetOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Juan Cena");
        playerOne.setTime(7.00);
        
        String playerOneName = playerOne.getName();
        double playerOneTime = playerOne.getTime();
        
        System.out.println(playerOne.toString());
        
    }
    }
