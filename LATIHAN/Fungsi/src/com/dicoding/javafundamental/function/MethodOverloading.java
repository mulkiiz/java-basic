package com.dicoding.javafundamental.function;

public class MethodOverloading {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);
        System.out.println("=======");
        int pn = 7;
        int lb = 6;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = " + hsl);
    }
    public static double hitungLuas(double panjang, double lebar) {
        System.out.println("var in: double doubel");
        double luas = panjang * lebar;
        return luas;
    }
    public static int hitungLuas(int panjang, int lebar) {
        System.out.println("var in: int int");
        int luas = panjang * lebar;
        return luas;
    }
}
