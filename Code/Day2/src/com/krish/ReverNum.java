package com.krish;

import java.util.Scanner;

public class ReverNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int newnumber = 0;
        while(number>0) {
            int digit = number % 10;
            newnumber = newnumber * 10 + digit;
            number /= 10;

        }
        System.out.println(newnumber);

    }
}
