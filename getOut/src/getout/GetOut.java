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
//        try{
            StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
//        }
//        catch (Throwable e){
//            System.out.println("Main Class error");
//        }
        
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
