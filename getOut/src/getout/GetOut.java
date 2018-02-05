/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getout;

import cit260.getOut.model.Actor;
import cit260.getOut.model.Map;
import cit260.getOut.model.Player;
import cit260.getOut.model.Question;
import cit260.getOut.model.RegularSceneType;

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
        playerOne.setBestTime(7.00);
        
        Map map1 = new Map();
        map1.setRowCount(1);
        map1.setColumnCount(2);
        
        
        
        String playerOneName = playerOne.getName();
        double playerOneTime = playerOne.getBestTime();
        
                
        System.out.println(Actor.Victim.getName());
        System.out.println(Actor.Victim.getDescription());
        
        System.out.println(playerOne.toString());
        System.out.println(map1.toString());
        
        
        Question questionOne = new Question();
        questionOne.setQuestion("Is this working?");
        questionOne.setAnswer("Yes it is working.");
        
        System.out.println(questionOne.toString());
        
        RegularSceneType sceneOne = new RegularSceneType();
        sceneOne.setBlocked("No");
        sceneOne.setDescription("A large red door");
        sceneOne.setSymbol("/");
        
        System.out.println(sceneOne.toString());
    }
    }
