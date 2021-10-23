package com.company.Assignments;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter first number :");
        int num1 = in.nextInt();

        System.out.print("Please enter second number :");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number!");
        }
        else {
            System.out.println(num2 + " is the largest number!");
        }
    }
}
