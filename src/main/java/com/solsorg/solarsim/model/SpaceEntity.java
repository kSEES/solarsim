package com.solsorg.solarsim.model;

public abstract class SpaceEntity {
    double x;
    double y;
    double z;

    double mass;

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
}
