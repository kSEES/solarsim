package com.solsorg.solarsim.model;

import com.solsorg.solarsim.util.math.ScientificNotation;
import jakarta.persistence.Entity;

@Entity
public class Star extends SpaceEntity{
    private String name;
    private double radius;

    public Star(double x, double y, double z, ScientificNotation mass, String name){
        super(x, y, z, mass);

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
