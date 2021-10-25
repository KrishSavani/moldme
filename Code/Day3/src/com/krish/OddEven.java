package com.krish;

import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.
public class OddEven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = in.nextInt();


        if (isEven(num)) {
            System.out.println("Its Even");
        }
        else {
            System.out.println("Its False");
        }
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
