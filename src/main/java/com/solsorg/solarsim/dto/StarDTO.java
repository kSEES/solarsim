package com.solsorg.solarsim.dto;

import java.util.List;

@Deprecated
public class StarDTO {
    private long id;
    private String name;
    private double mass;
    private double radius;
    private List<PlanetDTO> planets;
    private double x;
    private double y;
    private double z;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public List<PlanetDTO> getPlanets() {
        return planets;
    }

    public void setPlanets(List<PlanetDTO> planets) {
        this.planets = planets;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
