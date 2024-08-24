package com.solsorg.solarsim.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Planet extends SpaceEntity{
    private String name;
    private double radius;

    @ManyToOne
    @JoinColumn(name = "star_id")
    private Star star;

    public Planet(double x, double y, double z, double mass, double radius, String name){
        super(x, y, z, mass);

        this.radius = radius;
        this.name = name;
    }

    public Planet(){
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
