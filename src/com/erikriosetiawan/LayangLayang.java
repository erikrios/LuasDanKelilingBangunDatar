package com.erikriosetiawan;

public class LayangLayang {

    protected static double luas(double diagonalSatu, double diagonalDua) {
        double luas;
        luas = 0.5 * diagonalSatu * diagonalDua;
        return luas;
    }

    protected static double keliling(double panjangAB, double panjangBC) {
        double keliling;
        keliling = 2 * panjangAB * panjangBC;
        return keliling;
    }
}
