package com.erikriosetiawan;

public class Lingkaran {

    private static final double PHI = 3.14;

    protected static double luas(double jariJari) {
        double luas;
        luas = PHI * Math.pow(jariJari, 2);
        return luas;
    }

    protected static double keliling(double jariJari) {
        double diameter;
        double keliling;
        diameter = jariJari * 2;
        keliling = PHI * diameter;
        return keliling;
    }
}
