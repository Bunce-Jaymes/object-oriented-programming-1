/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.model;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Samuel Prettyman
 */
public enum Actor{
    
    Victim("Raphael", "He has been captured by Sinaloa Cartel", new Point(0,0));
   
    private String name;
    private String description;
    private Point coordinates;
    private Game game; 
    private ArrayList<Player> player1 = new ArrayList<Player>();
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    

    public Point getCoordinates() {
        return coordinates;
    }


    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    Actor(String name, String description, Point coordainates) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
}
}

