package com.dicoding.javafundamental.obyek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    // Ini merupakan konstruktor dari kelas hewan.
    // konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.

    public void namaHewan(String namaHewan){
        nama = namaHewan; //isi variabel diambil dari args voidnya
    }
    public void beratHewan(int beratHewan){
        berat = beratHewan; //isi variabel diambil dari args voidnya
    }

    public  void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan; //isi variabel diambil dari args voidnya
    }

    public void cetakHewan(){
        System.out.println("Nama hewan : " + nama);
        System.out.println("Berat hewan : " + berat + " kg");
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }

}
