package com.tutorial;

public class Main {
    public static void main(String[] args){
        //program konversi tipe data
        int nilaiInt = 256; //32 bit
        System.out.println("Nilai int = " + nilaiInt);
        //memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);
        //memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt; //casting operator untuk mengkorversi type data
        System.out.println("nilai byte = " + nilaiByte);
        //cek
        System.out.println("nilai maksimal byte = " + Byte.MAX_VALUE);
        System.out.println("nilai minimal byte = " + Byte.MIN_VALUE);

        //casting pembagian
        int a = 10;
        float b = 4;
        float c = a/b;
        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;
        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
