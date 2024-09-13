package com.solsorg.solarsim.model;

import jakarta.persistence.Entity;

@Entity
public class Asteroid extends SpaceEntity{
    private String name;
    private String composition;
    private double size;

    /*
        UNITS FOR DATA VARIABLES
        * See superceded values in SpaceEntity.

        VARIABLE NAME           UNIT
        ---------------------------------------
        - Composition     ->    N/A (n/a)
        - Size            ->    Kilometers (km)
    */

    public Asteroid(double x, double y, double z, double mass, String name, String composition, double size){
        super(x, y, z, mass);

        this.name = name;
        this.composition = composition;
        this.size = size;
    }

    public Asteroid(String name, String composition, double size) {
        this.name = name;
        this.composition = composition;
        this.size = size;
    }

    public Asteroid(){
        this.name = "Undefined";
        this.composition = "Undefined";
        this.size = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
