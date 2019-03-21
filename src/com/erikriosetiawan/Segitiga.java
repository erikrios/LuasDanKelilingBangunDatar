package com.erikriosetiawan;

public class Segitiga {

    protected static double luas(double alas, double tinggi) {
        double luas;
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    protected static double keliling(double panjangAB, double panjangBC, double panjangAC) {
        double keliling;
        keliling = panjangAB + panjangBC + panjangAC;
        return keliling;
    }
}