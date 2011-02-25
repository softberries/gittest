/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.softwarepassion.abstractfactorypattern;

/**
 *
 * @author kris
 */
public abstract class Car {

    private String color;
    private boolean diesel;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }
}
