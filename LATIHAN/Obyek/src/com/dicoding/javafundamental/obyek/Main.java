package com.dicoding.javafundamental.obyek;

public class Main {
    public static void main(String[] args){
        Hewan Elang = new Hewan(); //ciptakan dulu objeknya dari nama kelasnya
        Hewan Kucing = new Hewan();

        Elang.namaHewan("Elang"); //objek Elang dari kelas Hewan mempunyai properti namaHewan
        Elang.beratHewan(5); //objek Elang dari kelas Hewan mempunyai properti beratHewan
        Elang.jumlahKakiHewan(2); //objek Elang dari kelas Hewan mempunyai properti jumlahKakiHewan
        Elang.cetakHewan(); //objek Elang dari kelas Hewan mempunyai properti cetakHewan

        Kucing.namaHewan("Kucing");
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
