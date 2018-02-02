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
 * @author jayme
 */
public class RegularSceneType implements Serializable {
    private String description;
    private String blocked;
    private String symbol;
    private double room;
    private double door;
    private Location location;
    

    public RegularSceneType() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getRoom() {
        return room;
    }

    public void setRoom(double room) {
        this.room = room;
    }

    public double getDoor() {
        return door;
    }

    public void setDoor(double door) {
        this.door = door;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.blocked);
        hash = 37 * hash + Objects.hashCode(this.symbol);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.room) ^ (Double.doubleToLongBits(this.room) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.door) ^ (Double.doubleToLongBits(this.door) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.location);
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
        final RegularSceneType other = (RegularSceneType) obj;
        if (Double.doubleToLongBits(this.room) != Double.doubleToLongBits(other.room)) {
            return false;
        }
        if (Double.doubleToLongBits(this.door) != Double.doubleToLongBits(other.door)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    
    
}