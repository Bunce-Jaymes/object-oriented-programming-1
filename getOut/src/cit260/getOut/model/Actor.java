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
    
    Victim("Raphael", "He has been captured by Sinaloa Cartel", 1, 1);
   
    private String name;
    private String description;
    private int x;
    private int y;
    private Game game; 
    private ArrayList<Player> player1 = new ArrayList<Player>();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Player> getPlayer1() {
        return player1;
    }

    public void setPlayer1(ArrayList<Player> player1) {
        this.player1 = player1;
    }
    
    
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

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", x=" + x + ", y=" + y + ", game=" + game + ", player1=" + player1 + '}';
    }

    private Actor(String name, String description, int x, int y) {
        this.name = name;
        this.description = description;
        this.x = x;
        this.y = y;
    }
    
    
}

