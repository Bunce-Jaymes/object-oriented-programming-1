/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.model.Item;
import java.util.Arrays;

/**
 *
 * @author jayme
 */
public class ItemSort {
    
    public static String[] sortList(){
        String[] items = new String[5];
        
        items[0]= "H - " + Item.Hammer.name();
        items[1]= "D - " + Item.DriftPin.name();
        items[2]= "P - " + Item.Paper.name();
        items[3]= "S - " + Item.Sand.name();
        items[4]= "T - " + Item.TwoLiterBottle.name();
        
        Arrays.sort(items);
        
        return items;
        
    }
}
