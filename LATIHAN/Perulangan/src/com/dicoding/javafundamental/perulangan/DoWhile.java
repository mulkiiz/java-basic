package com.dicoding.javafundamental.perulangan;

public class DoWhile { //minimal 1x akan tereksekusi
    public static void main(String[] args) {
        int value = 2;
        do {
            System.out.println("Angka : " + value);
            value++;
        } while (value <= 1);
    }
}
