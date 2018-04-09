/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.exceptions.GameControlExceptions;
import cit260.getOut.exceptions.MapControlExceptions;
import cit260.getOut.model.Actor;
import cit260.getOut.model.Game;
import cit260.getOut.model.Map;
import cit260.getOut.model.Player;
import cit260.getOut.view.ErrorView;
import getout.GetOut;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        game.setActor(Actor.Victim);
        int noOfRows = 10;
        int noOfColumns = 10;

        Map map = MapControl.createMap(noOfRows, noOfColumns);
        if (map == null) {
            throw new MapControlExceptions("Map creatation failure");
        }
        game.setMap(map);

        return 1;
    }

    public static void saveGame(Game game, String filePath) throws GameControlExceptions, IOException {

        if (game == null || filePath == null) {
            throw new GameControlExceptions("Game and Path cannot be null");
        }

        try(FileOutputStream out = new FileOutputStream(filePath)){;
            try (ObjectOutputStream outObject = new ObjectOutputStream(out)) {
               outObject.writeObject(game);
            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }

    public static void getGame(String filePath) throws GameControlExceptions, IOException {
        Game game = null;
        
        if (filePath == null) {
            throw new GameControlExceptions("File path cannot be null");
        }
        try (FileInputStream in = new FileInputStream(filePath)) {
            try (ObjectInputStream inObject = new ObjectInputStream(in)) {
                game = (Game) inObject.readObject();
                GetOut.setCurrentGame(game);
                GetOut.setPlayer(game.getPlayer());

            } catch (ClassNotFoundException ex) {
                System.out.println("could not load game");
            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}
