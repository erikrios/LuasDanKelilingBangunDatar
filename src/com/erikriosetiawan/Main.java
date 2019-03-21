package com.erikriosetiawan;

import java.util.Scanner;

public class Main {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        programTitle();
        askForRun();
    }

    private static void programTitle() {
        print("========= PROGRAM LUAS DAN KELILING BANGUN DATAR =========");
        print("");
        System.out.printf("\t\t\t%s : %s\n", "Dibuat Oleh", "Erik Rio Setiawan");
        System.out.printf("\t\t\t%s : %s\n", "Pada Tanggal", "19 Maret 2019");
        print("----------------------------------------------------------");
    }

    private static void print(String message) {
        System.out.printf("%s\n", message);
    }

    private static void askForRun() {
        String answer;
        System.out.printf("%s : ", "Apakah Anda ingin menjalankan program ini? (Y/T)");
        answer = userInput.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            programRun();
        } else if (answer.equalsIgnoreCase("T")) {
            System.exit(1);
        } else {
            System.out.printf("%s\n", "Pilihan salah! Coba Kembali.");
            askForRun();
        }
    }

    private static int askForChoice() {
        int choice;
        print("--------- Pilihan Bangun Datar ---------");
        print("1. Persegi");
        print("2. Persegi Panjang");
        print("3. Jajar Genjang");
        print("4. Trapesium");
        print("5. Layang-Layang");
        print("6. Segitiga");
        print("7. Belah Ketupat");
        print("8. Lingkaran");
        System.out.printf("%s : ", "Masukkan pilihan");
        choice = userInput.nextInt();
        return choice;
    }

    private static void programRun() {
        int choice;
        double luas, keliling;
        choice = askForChoice();
        switch (choice) {
            case 1:
                double sisiPersegi;
                System.out.printf("%s : ", "Masukkan panjang sisi");
                sisiPersegi = userInput.nextDouble();
                luas = Persegi.luas(sisiPersegi);
                keliling = Persegi.keliling(sisiPersegi);
                showResult("Persegi", luas, keliling);
                askForRunAgain();
                break;
            case 2:
                double panjangPersegiPanjang, lebarPersegiPanjang;
                System.out.printf("%s : ", "Masukkan panjang");
                panjangPersegiPanjang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan lebar");
                lebarPersegiPanjang = userInput.nextDouble();
                luas = PersegiPanjang.luas(panjangPersegiPanjang, lebarPersegiPanjang);
                keliling = PersegiPanjang.keliling(panjangPersegiPanjang, lebarPersegiPanjang);
                showResult("Persegi Panjang", luas, keliling);
                askForRunAgain();
                break;
            case 3:
                double alasJajarGenjang, tinggiJajarGenjang;
                double panjangABJajarGenjang, panjangBCJajarGenjang, panjangCDJajarGenjang, panjangADJajarGenjang;
                System.out.printf("%s : ", "Masukkan alas");
                alasJajarGenjang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan tinggi");
                tinggiJajarGenjang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang AB");
                panjangABJajarGenjang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang BC");
                panjangBCJajarGenjang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang CD");
                panjangCDJajarGenjang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang AD");
                panjangADJajarGenjang = userInput.nextDouble();
                luas = JajarGenjang.luas(alasJajarGenjang, tinggiJajarGenjang);
                keliling = JajarGenjang.keliling(panjangABJajarGenjang, panjangBCJajarGenjang, panjangCDJajarGenjang, panjangADJajarGenjang);
                showResult("Jajar Genjang", luas, keliling);
                askForRunAgain();
                break;
            case 4:
                double sisiSejajarTrapesium, tinggiTrapesium;
                double panjangABTrapesium, panjangBCTrapesium, panjangCDTrapesium, panjangDATrapesium;
                System.out.printf("%s : ", "Masukkan sisi sejajar");
                sisiSejajarTrapesium = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan tinggi");
                tinggiTrapesium = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang AB");
                panjangABTrapesium = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang BC");
                panjangBCTrapesium = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang CD");
                panjangCDTrapesium = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang DA");
                panjangDATrapesium = userInput.nextDouble();
                luas = Trapesium.luas(sisiSejajarTrapesium, tinggiTrapesium);
                keliling = Trapesium.keliling(panjangABTrapesium, panjangBCTrapesium, panjangCDTrapesium, panjangDATrapesium);
                showResult("Trapeium", luas, keliling);
                askForRunAgain();
                break;
            case 5:
                double diagonalSatuLayangLayang, diagonalDuaLayangLayang;
                double panjangABLayangLayang, panjangBCLayangLayang;
                System.out.printf("%s : ", "Masukkan diagonal satu");
                diagonalSatuLayangLayang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan diagonal dua");
                diagonalDuaLayangLayang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang AB");
                panjangABLayangLayang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang BC");
                panjangBCLayangLayang = userInput.nextDouble();
                luas = LayangLayang.luas(diagonalSatuLayangLayang, diagonalDuaLayangLayang);
                keliling = LayangLayang.keliling(panjangABLayangLayang, panjangBCLayangLayang);
                showResult("Layang-layang", luas, keliling);
                askForRunAgain();
                break;
            case 6:
                double alasSegitiga, tinggiSegitiga;
                double panjangABSegitiga, panjangBCSegitiga, panjangACSegitiga;
                System.out.printf("%s : ", "Masukkan alas");
                alasSegitiga = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan tinggi");
                tinggiSegitiga = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang AB");
                panjangABSegitiga = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang BC");
                panjangBCSegitiga = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang AC");
                panjangACSegitiga = userInput.nextDouble();
                luas = Segitiga.luas(alasSegitiga, tinggiSegitiga);
                keliling = Segitiga.keliling(panjangABSegitiga, panjangBCSegitiga, panjangACSegitiga);
                showResult("Segitiga", luas, keliling);
                askForRunAgain();
                break;
            case 7:
                double diagonalSatuBelahKetupat, diagonalDuaBelahKetupat;
                double sisiBelahKetupat;
                System.out.printf("%s : ", "Masukkkan diagonal satu");
                diagonalSatuBelahKetupat = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan diagonal dua");
                diagonalDuaBelahKetupat = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan panjang sisi");
                sisiBelahKetupat = userInput.nextDouble();
                luas = BelahKetupat.luas(diagonalSatuBelahKetupat, diagonalDuaBelahKetupat);
                keliling = BelahKetupat.keliling(sisiBelahKetupat);
                showResult("Belah Ketuat", luas, keliling);
                askForRunAgain();
                break;
            case 8:
                double jariJariLingkaran;
                System.out.printf("%s : ", "Masukkan jari-jari");
                jariJariLingkaran = userInput.nextDouble();
                luas = Lingkaran.luas(jariJariLingkaran);
                keliling = Lingkaran.keliling(jariJariLingkaran);
                showResult("Lingkaran", luas, keliling);
                askForRunAgain();
                break;
        }
    }

    private static void showResult(String namaBangunDatar, double luas, double keliling) {
        System.out.printf("%s %s %s %f\n%s %s %s %f\n", "Luas", namaBangunDatar, "adalah", luas, "Keliling", namaBangunDatar, "adalah", keliling);
    }

    private static void askForRunAgain() {
        String answer;
        System.out.printf("%s", "Apakah Anda ingin menjalankan program lagi? (Y/T) : ");
        answer = userInput.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            programRun();
        } else if (answer.equalsIgnoreCase("T")) {
            System.exit(1);
        } else {
            System.out.printf("%s\n", "Pilihan salah! Coba kembali.");
            askForRunAgain();
        }
    }
}
