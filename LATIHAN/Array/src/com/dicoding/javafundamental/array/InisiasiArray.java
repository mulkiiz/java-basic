package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args){
        int[] arrInt = new int[]{1,2,3,4,5};
        arrInt[0] = 6; //contoh pengisian nilai array yang lain
        arrInt[1] = 7;

        int[] arrIntx = {55, 66}; //contoh inisialisasi arr yang lebih sederhana

        System.out.println("nilai arrInt index ke-0 = " + arrInt[0]);
        System.out.println("nilai arrInt index ke-1 = " + arrInt[1]);
        System.out.println("nilai arrInt index ke-2 = " + arrInt[2]);
        System.out.println("-----");
        System.out.println("nilai arrIntx index ke-2 = " + arrIntx[0]);
        System.out.println("nilai arrIntx index ke-2 = " + arrIntx[1]);

    }
}
