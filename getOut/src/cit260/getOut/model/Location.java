/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.model;

import java.io.Serializable;

/**
 *
 * @author jayme
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private double timeTraveled;

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

    public double getTimeTraveled() {
        return timeTraveled;
    }

    public void setTimeTraveled(double timeTraveled) {
        this.timeTraveled = timeTraveled;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.row;
        hash = 47 * hash + this.column;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.timeTraveled) ^ (Double.doubleToLongBits(this.timeTraveled) >>> 32));
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
        if (Double.doubleToLongBits(this.timeTraveled) != Double.doubleToLongBits(other.timeTraveled)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", timeTraveled=" + timeTraveled + '}';
    }
    
}
