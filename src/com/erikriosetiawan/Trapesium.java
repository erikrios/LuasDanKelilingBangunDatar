package com.erikriosetiawan;

public class Trapesium {

    protected static double luas(double sisiSejajar, double tinggi) {
        double luas;
        luas = 0.5 * sisiSejajar * tinggi;
        return luas;
    }

    protected static double keliling(double panjangAB, double panjangBC, double panjangCD, double panjangDA) {
        double keliling;
        keliling = panjangAB + panjangBC + panjangCD + panjangDA;
        return keliling;
    }
}
