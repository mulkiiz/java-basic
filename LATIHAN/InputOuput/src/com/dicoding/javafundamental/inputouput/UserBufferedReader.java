package com.dicoding.javafundamental.inputouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args){
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan");
        int value = 1; //inisialisasi variabel pada java sangat penting
        int anotherValue = 8; //setidaknya isikan dengan nilai defaultnya, int=0

        try {
            System.out.print("masukkan angka: ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("masukkan angka lagi: ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e){
            e.printStackTrace();
        }
        int result = value + anotherValue;
        System.out.println("hasilnya adalah = " +result);

    }
}
