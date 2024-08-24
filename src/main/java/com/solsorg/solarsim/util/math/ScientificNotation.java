package com.solsorg.solarsim.util.math;

public class ScientificNotation {
    private boolean signed;
    private double exponent;
    private double significand;

    public ScientificNotation(boolean signed, double significand, double exponent) {
        this.signed = signed;

        this.significand = significand;
        this.exponent = exponent;
    }

    public ScientificNotation(double significand, double exponent){
        this.signed = false;

        this.significand = significand;
        this.exponent = exponent;
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
