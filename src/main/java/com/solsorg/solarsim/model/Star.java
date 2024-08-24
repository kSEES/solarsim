package com.solsorg.solarsim.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Star extends SpaceEntity{
    private String name;
    private double radius;

    @OneToMany(mappedBy = "star", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Planet> planets;

    public Star(double x, double y, double z, double mass, double radius, String name, List<Planet> planets){
        super(x, y, z, mass);

        this.radius = radius;
        this.name = name;
        this.planets = planets;
    }

    public Star() {
        super();
        this.planets = new ArrayList<Planet>();
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

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }
}
