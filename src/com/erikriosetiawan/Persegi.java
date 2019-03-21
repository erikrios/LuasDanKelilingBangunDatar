package com.erikriosetiawan;

import java.lang.Math;

public class Persegi {

    protected static double luas(double sisi) {
        double luas;
        luas = Math.pow(sisi, 2);
        return luas;
    }

    protected static double keliling(double sisi) {
        double keliling;
        keliling = 4 * sisi;
        return keliling;
    }

}
