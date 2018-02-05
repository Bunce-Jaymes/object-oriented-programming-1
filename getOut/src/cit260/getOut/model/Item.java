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

    @Override
    public String toString() {
        return "Item{" + "itemType=" + itemType + ", description=" + description + '}';
    }
         
    }



