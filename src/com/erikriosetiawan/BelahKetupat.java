package com.erikriosetiawan;

public class BelahKetupat {

    protected static double luas(double diagonalSatu, double diagonalDua) {
        double luas;
        luas = 0.5 * diagonalSatu * diagonalDua;
        return luas;
    }

    protected static double keliling(double sisi) {
        double keliling;
        keliling = 4 * sisi;
        return keliling;
    }
}
