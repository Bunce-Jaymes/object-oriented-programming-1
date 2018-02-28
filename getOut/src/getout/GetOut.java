/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getout;

import cit260.getOut.model.*;
import cit260.getOut.view.*;

/**
 *
 * @author jayme
 */
public class GetOut {
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        // TODO code application logic here
        //Player playerOne = new Player();
        //playerOne.setName("Juan Cena");
        //playerOne.setBestTime(7.00);
        
        //Map map1 = new Map();
        //map1.setRowCount(1);
        //map1.setColumnCount(2);
        
        //Location loco1 = new Location();
        //loco1.setRow(1);
        //loco1.setColumn(3);
        
        //String playerOneName = playerOne.getName();
        //double playerOneTime = playerOne.getBestTime();
                
        //System.out.println(Actor.Victim.getName());
        //System.out.println(Actor.Victim.getDescription());
        
        //System.out.println(playerOne.toString());
        //System.out.println(map1.toString());
        
        //System.out.println(Item.DriftPin.getItemType());
        //System.out.println(Item.DriftPin.getDescription());
        
        //System.out.println(loco1.toString());

        //Question questionOne = new Question();
        //questionOne.setQuestion("Is this working?");
        //questionOne.setAnswer("Yes it is working.");
        
        //System.out.println(questionOne.toString());
        
        //RegularSceneType sceneOne = new RegularSceneType();
        //sceneOne.setBlocked("No");
        //sceneOne.setDescription("A large red door");
        //sceneOne.setSymbol("/");
        
        //System.out.println(sceneOne.toString());
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        GetOut.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        GetOut.player = player;
    }
    }
