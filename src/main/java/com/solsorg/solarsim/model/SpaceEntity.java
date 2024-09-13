package com.solsorg.solarsim.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class SpaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double x;
    private double y;
    private double z;

    private double mass;

    /*
        UNITS FOR DATA VARIABLES

        VARIABLE NAME       UNIT
        ---------------------------------------
        - x, y, z     ->    Astronomical Unit (AU)
        - mass        ->    Kilogram (kg)
     */

    public SpaceEntity(double x, double y, double z, double mass) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.mass = mass;
    }

    public SpaceEntity() {}

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

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
