package com.dicoding.javafundamental.propertimetode;

public class Main {
    public static void main(String[] args) {
        // Kita tambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
        Hewan kucing = new Hewan(2);
        kucing.cetakUmur();
        kucing.makan();
        kucing.jalan();
        kucing.lari();
    }
}
