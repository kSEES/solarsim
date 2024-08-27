package com.solsorg.solarsim.model;

import jakarta.persistence.Entity;

@Entity
public class Planet extends SpaceEntity{
    private String name;
    private double radius;

    private long dayLength;
    private long yearLength;
    private float eccentricity;
    private float axialTilt;
    private long perihelion;
    private long aphelion;

    public Planet(double x, double y, double z, double mass, String name, double radius, long dayLength, long yearLength, float eccentricity, float axialTilt, long perihelion, long aphelion) {
        super(x, y, z, mass);
        
        this.name = name;
        this.radius = radius;
        this.dayLength = dayLength;
        this.yearLength = yearLength;
        this.eccentricity = eccentricity;
        this.axialTilt = axialTilt;
        this.perihelion = perihelion;
        this.aphelion = aphelion;
    }

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

    public long getDayLength() {
        return dayLength;
    }

    public void setDayLength(long dayLength) {
        this.dayLength = dayLength;
    }

    public long getYearLength() {
        return yearLength;
    }

    public void setYearLength(long yearLength) {
        this.yearLength = yearLength;
    }

    public float getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(float eccentricity) {
        this.eccentricity = eccentricity;
    }

    public float getAxialTilt() {
        return axialTilt;
    }

    public void setAxialTilt(float axialTilt) {
        this.axialTilt = axialTilt;
    }

    public long getPerihelion() {
        return perihelion;
    }

    public void setPerihelion(long perihelion) {
        this.perihelion = perihelion;
    }

    public long getAphelion() {
        return aphelion;
    }

    public void setAphelion(long aphelion) {
        this.aphelion = aphelion;
    }
}
