package com.krish;

import java.util.Scanner;

public class Occurrence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the number :");
        int number = in.nextInt();
        System.out.print("Enter the digit u wanna check occurrence for :");
        int n = in.nextInt();
        int count = 0;
        int digit = 0;

        while(number > 0) {

            digit = number % 10;
            if(digit == n) {
                count++;
            }
            number/= 10;

        }
        System.out.println(count);
    }
}
