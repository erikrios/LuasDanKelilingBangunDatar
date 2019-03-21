package com.erikriosetiawan;

public class JajarGenjang {

    protected static double luas(double alas, double tinggi) {
        double luas = alas * tinggi;
        return luas;
    }

    protected static double keliling(double panjangAB, double panjangBC, double panjangCD, double panjangAD) {
        double keliling;
        keliling = panjangAB + panjangBC + panjangCD + panjangAD;
        return keliling;
    }
}