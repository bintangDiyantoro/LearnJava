package com.tutorial;

public class Main {
    public static void main(String[] args){
        // operator komparasi akan menghasilkan nilai dalam bentuk boolean
        int a;
        int b;

        //operator equal/persamaan
        System.out.println("=====PERSAMAAN=====");
        a = 10;
        b = 10;
        System.out.printf("%d == %d? --> %s \n", a,b, (a == b));
        a = 11;
        b = 10;
        System.out.printf("%d == %d? --> %s \n", a,b, (a == b));

        //operator not equal/pertidak-samaan
        System.out.println("=====PERTIDAK-SAMAAN=====");
        a = 10;
        b = 10;
        System.out.printf("%d != %d? --> %s \n", a,b, (a != b));
        a = 11;
        b = 10;
        System.out.printf("%d != %d? --> %s \n", a,b, (a != b));

        //operator less/kurang-dari
        System.out.println("=====KURANG DARI=====");
        a = 10;
        b = 10;
        System.out.printf("%d < %d? --> %s \n", a,b, (a < b));
        a = 9;
        b = 10;
        System.out.printf("%d < %d? --> %s \n", a,b, (a < b));

        //operator less than equal/kurang dari sama dengan
        System.out.println("=====KURANG DARI SAMA DENGAN=====");
        a = 10;
        b = 10;
        System.out.printf("%d <= %d? --> %s \n", a,b, (a <= b));
        a = 9;
        b = 10;
        System.out.printf("%d <= %d? --> %s \n", a,b, (a <= b));

        //operator greater/lebih dari
        System.out.println("=====LEBIH DARI=====");
        a = 10;
        b = 10;
        System.out.printf("%d > %d? --> %s \n", a,b, (a > b));
        a = 11;
        b = 10;
        System.out.printf("%d > %d? --> %s \n", a,b, (a > b));

        //operator greater than equal/lebih dari sama dengan
        System.out.println("=====LEBIH DARI SAMA DENGAN=====");
        a = 10;
        b = 10;
        System.out.printf("%d >= %d? --> %s \n", a,b, (a >= b));
        a = 11;
        b = 10;
        System.out.printf("%d >= %d? --> %s \n", a,b, (a >= b));
    }
}
