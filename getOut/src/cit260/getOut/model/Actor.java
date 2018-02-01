/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.model;

/**
 *
 * @author Samuel Prettyman
 */
public enum Actor{
    private String name;
    private String description;
    private Point coordinates;

Actor(String name, String description, Point coordainates) {
this.name = name;
this.description = description;
this coordinates = coordinates;
}
