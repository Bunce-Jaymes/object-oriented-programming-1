/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Samuel Prettyman
 */
     public enum Item {
         
         Hammer("Hammer", "A rusty old hammer, could be useful in breaking something"),
         DriftPin("Drift Pin","A drift pen, could be useful in breaking something"),
         Paper("Paper", "A torn piece of paper, it has '(X / 2 + 32)^24' written on it"),
         TwoLiterBottle("Two Liter Bottle","A plastic two liter bottle, used to hold Coke back in the day"),
         Sand("Sand", "Sand, its sandy");
         
         private String itemType;
         private String description;
         private Game game;
         private Actor actor;
         
         
         Item(String itemType, String description){
             this.itemType = itemType;
             this.description = description;
         }
         

    public String getItemType() {
        return itemType;
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

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    

    @Override
    public String toString() {
        return "Item{" + "itemType=" + itemType + ", description=" + description + '}';
    }
         
    }



