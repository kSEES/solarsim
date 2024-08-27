package com.solsorg.solarsim.model;

import jakarta.persistence.Entity;

@Entity
public class Planet extends SpaceEntity{
    private String name;
    private double radius;

    public Planet(double x, double y, double z, double mass, double radius, String name){
        super(x, y, z, mass);

        this.radius = radius;
        this.name = name;
    }

    public Planet(){
        super();
    }

    @Override
    public boolean equals(Object o) {
        Planet currentPlanet = this;
        Planet otherPlanet = (Planet) o;
        boolean doesEqual = false;

        // Try doing Star.java first, the same principle lives.

        return doesEqual;
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
