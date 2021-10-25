package com.krish;

// Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        sumof(num1,num2);

    }

    private static void sumof(int num1, int num2) {
        int sum = num1 + num2;
        System.out.print("Sum is :" + sum);

    }
}
