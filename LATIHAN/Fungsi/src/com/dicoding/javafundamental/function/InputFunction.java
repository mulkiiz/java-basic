package com.dicoding.javafundamental.function;

public class InputFunction {
    public static void main(String[] args) {
        // memanggil fungsi
        hitungLuas(7, 6.5); //langsung panggil nama fungsinya
    }

    public static void hitungLuas(double panjang, double lebar) {
        //gunakan void jika tidak ada return
        double luas;
        luas = panjang * lebar;
        System.out.println(luas); //langsung cetak dari fungsinya
    }
}
