package com.erikriosetiawan;

public class PersegiPanjang {

    protected static double luas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        return luas;
    }

    protected static double keliling(double panjang, double lebar) {
        double keliling;
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
