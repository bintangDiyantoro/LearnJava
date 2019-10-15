package com.tutorial;

public class Main {
    public static void main(String[] args){
        // unary = operasi yang dilakukan pada satu variable saja

        //unary + dan -
        int angka = 1;
        System.out.printf("Unary '-' dari %d = %d\n", angka, -angka);
        System.out.printf("Unary '+' dari %d = %d\n", angka, +angka);

        //unary decrement dan increment
        int angka2 = 10;
        angka2--;
        System.out.printf("Nilai dengan '--' %d\n", angka2);
        angka2++;
        System.out.printf("Nilai dengan '++' %d\n", angka2);

        int a = 5;
        System.out.printf("nilai a dengan prefix '++a' = %d\n", ++a);
        int b = 5;
        System.out.printf("nilai b dengan postfix 'b++' = %d\n", b++);
        System.out.printf("nilai hasil dari postfix 'b++' = %d\n", b);

        // unary boolean dengan ! untuk negasi
        boolean hap = true;
        System.out.printf("nilai boolean hap adalah %b \n", hap);
        System.out.printf("nilai boolean hap adalah %b \n", !hap);
    }
}

