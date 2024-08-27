package com.solsorg.solarsim.model;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Star extends SpaceEntity{
    private String name;
    private double radius;

    public Star(double x, double y, double z, double mass, double radius, String name){
        super(x, y, z, mass);

        this.radius = radius;
        this.name = name;
    }

    public Star() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        boolean doesEqual = false;

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
