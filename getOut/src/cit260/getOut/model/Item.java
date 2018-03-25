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
         
         Hammer("Hammer", "Hammer"),
         DriftPin("Drift Pin","Drift Pin"),
         LockPick("Lock Pick", "Lock Pick"),
         TwoLiterBottle("Two Liter Bottle","Two Liter Bottle"),
         Sand("Sand", "Sand");
         
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



