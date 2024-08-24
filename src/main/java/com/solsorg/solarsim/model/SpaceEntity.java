package com.solsorg.solarsim.model;

import com.solsorg.solarsim.util.math.ScientificNotation;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class SpaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double x;
    private double y;
    private double z;

    @Embedded
    private ScientificNotation mass;

    public SpaceEntity(double x, double y, double z, ScientificNotation mass) {
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

    public ScientificNotation getMass() {
        return mass;
    }

    public void setMass(ScientificNotation mass) {
        this.mass = mass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
