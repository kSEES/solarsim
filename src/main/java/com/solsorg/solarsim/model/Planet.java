package com.solsorg.solarsim.model;

import jakarta.persistence.Entity;

@Entity
public class Planet extends SpaceEntity{
    private String name;
    private double radius;

    private double dayLength;
    private double yearLength;
    private float eccentricity;
    private float axialTilt;
    private double perihelion;
    private double aphelion;

    /*
        UNITS FOR DATA VARIABLES
        * See superceded values in SpaceEntity.

        VARIABLE NAME         UNIT
        ---------------------------------------
        - Radius        ->    Kilometer (km)
        - DayLength     ->    Second (s)
        - YearLength    ->    Second (s)
        - Eccentricity  ->    Ratio
        - AxialTilt     ->    Degree (°)
        - Perihelion    ->    Kilometer (km)
        - Aphelion      ->    Kilometer (km)
     */

    public Planet(double x, double y, double z, double mass, String name, double radius, double dayLength, double yearLength, float eccentricity, float axialTilt, double perihelion, double aphelion) {
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

    public double getDayLength() {
        return dayLength;
    }

    public void setDayLength(double dayLength) {
        this.dayLength = dayLength;
    }

    public double getYearLength() {
        return yearLength;
    }

    public void setYearLength(double yearLength) {
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

    public double getPerihelion() {
        return perihelion;
    }

    public void setPerihelion(double perihelion) { this.perihelion = perihelion; }

    public double getAphelion() {
        return aphelion;
    }

    public void setAphelion(double aphelion) {
        this.aphelion = aphelion;
    }
}
