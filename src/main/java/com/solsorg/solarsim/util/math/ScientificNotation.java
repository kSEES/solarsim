package com.solsorg.solarsim.util.math;

import jakarta.persistence.Embeddable;

@Embeddable
@Deprecated
public class ScientificNotation {
    private boolean signed;
    private double exponent;
    private double significand;

    public ScientificNotation(boolean signed, double significand, double exponent) {
        this.significand = significand;
        this.exponent = exponent;
        this.signed = signed;
    }

    public ScientificNotation(double significand, double exponent){
        this.signed = false;

        this.significand = significand;
        this.exponent = exponent;
    }

    public ScientificNotation(){
        this.signed = false;
        this.exponent = 0;
        this.significand = 0;
    }

    public static ScientificNotation compare(ScientificNotation a, ScientificNotation b) throws Exception{
        if(a.isSigned() || b.isSigned()){
            throw new Exception("Unable to compare scientific notations with negative symbols.");
        }

        if(a.getExponent() > b.getExponent()){
            return a;
        } else if(a.getExponent() < b.getExponent()){
            return b;
        }

        if(a.getSignificand() > b.getSignificand()){
            return a;
        } else if(b.getSignificand() > a.getSignificand()){
            return b;
        }

        return a;
    }

    public static ScientificNotation interpretNotation(String scientificNotation) throws Exception{
        double significand, exponent;

        exponent = Double.parseDouble(scientificNotation.substring(scientificNotation.indexOf("^")));

        if(scientificNotation.startsWith("-")){
            significand = Double.parseDouble(scientificNotation.substring(1, scientificNotation.indexOf(" ")));

            return new ScientificNotation(true, significand, exponent);
        }

        significand = Double.parseDouble(scientificNotation.substring(0, scientificNotation.indexOf(" ")));

        return new ScientificNotation(false, significand, exponent);
    }

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    public double getExponent() {
        return exponent;
    }

    public void setExponent(double exponent) {
        this.exponent = exponent;
    }

    public double getSignificand() {
        return significand;
    }

    public void setSignificand(double significand) {
        this.significand = significand;
    }
}
