package com.dicoding.javafundamental.accessmodifier.package1;

public class KelasA {
    private int memberA = 5; //tidak bisa diakses dari kelas luar

    char memberB = 'A'; //modifier: default
    double memberC = 1.5;

    private int functionA() {
        return memberA;
    } //tidak bisa diakses dari kelas luar

    int functionB() { //bisa diakses dari kelas luar
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    protected void methodC(){
        System.out.println("Percobaan access modifier!!!");
    }
}
