package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int num = (int)(67.34f);
        System.out.println(num);

        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); // 257 % 256 = 1

        byte c = 40;
        byte d = 50;
        byte e = 100;

        int f = c*d/e;
        // here c*d is done using integers
       // b = b*2 hence this wud give an error

        int number = 'A';
        // ascii value will be given -- Automative type conversion(unicode)


    }
}
