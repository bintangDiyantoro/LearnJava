package com.tutorial;

public class Main {
    public static void main(String[] args){
        //Operasi aritmatika
        int var1 = 5;
        int var2 = 6;
        int hasil;
        // 1. Penjumlahan
        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);
        // 2. pengurangan
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n",var1,var2,hasil);
        // 3. perkalian
        hasil = var1 * var2;
        System.out.println(var1 + " x " + var2 + " = " + hasil);
        // 4. Pembagian
        float v2 = 6;
        float v1 = 5;
        float hasilbg = v2 / v1;
        System.out.println(v2 + " : " + v1 + " = " + hasilbg);
        // 5. Modulus
        hasil = var1 % var2;
        System.out.println(var1 + " % " + var2 + " = " + hasil);
    }
}
