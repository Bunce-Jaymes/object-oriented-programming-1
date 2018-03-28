/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.geOut.exceptions.GameControlExceptions;
import cit260.geOut.exceptions.MapControlExceptions;
import cit260.getOut.model.Actor;
import cit260.getOut.model.Game;
import cit260.getOut.model.Map;
import cit260.getOut.model.Player;
import getout.GetOut;

/**
 *
 * @author jayme
 */
public class GameControl {

    public static Player savePlayer(String name) throws GameControlExceptions {
        if (name == null || name.length() < 1) {
            throw new GameControlExceptions("Name cannot be blank.");
        }
        Player player = new Player();
        player.setName(name);
        GetOut.setPlayer(player);

        return player;
    }

    public static int createNewGame(Player player) throws MapControlExceptions {
        if (player == null) {
            throw new MapControlExceptions("There is no player saved");
        }
        Game game = new Game();
        game.setPlayer(player);
        GetOut.setCurrentGame(game);
        int noOfRows = 10;
        int noOfColumns = 10;
        
        Map map = MapControl.createMap(noOfRows, noOfColumns);
            if (map == null) {
                throw new MapControlExceptions("Map creatation failure");
            }
            game.setMap(map);
        
        return 1;
    }
    
    





  
    
    
    
}
