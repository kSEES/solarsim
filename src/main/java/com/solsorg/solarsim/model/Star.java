package com.solsorg.solarsim.model;

import jakarta.persistence.Entity;

@Entity
public class Star extends SpaceEntity{
    private String name;
    private double radius;

    /*
        UNITS FOR DATA VARIABLES
        * See superceded values in SpaceEntity.

        VARIABLE NAME         UNIT
        ---------------------------------------
        - Radius        ->    Kilometers (km)
    */

    public Star(double x, double y, double z, double mass, double radius, String name){
        super(x, y, z, mass);

        this.radius = radius;
        this.name = name;
    }

    public Star() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
