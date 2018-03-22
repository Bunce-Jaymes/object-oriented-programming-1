/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jayme
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private Actor actor;
    private Map map;
    private ArrayList<RegularSceneType> sceneType = new ArrayList<RegularSceneType>();
    private boolean visited;
    
     private RegularSceneType scene;

    public Map getMap() {
        return map;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public ArrayList<RegularSceneType> getSceneType() {
        return sceneType;
    }

    public void setSceneType(ArrayList<RegularSceneType> sceneType) {
        this.sceneType = sceneType;
    }

    public RegularSceneType getScene() {
        return scene;
    }

    public void setScene(RegularSceneType scene) {
        this.scene = scene;
    }
     
     
  
  

    public Location() {
    }
    

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.row;
        hash = 43 * hash + this.column;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + '}';
    }

    public void isVisited(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
