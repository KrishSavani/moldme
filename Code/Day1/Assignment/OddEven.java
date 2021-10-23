package com.company.Assignments;

// Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number :");
        int number = in.nextInt();
        if(number % 2 == 0) {
            System.out.println("Number you entered is even");
        }
        else {
            System.out.println("Number you entered is odd");
        }

    }
}
