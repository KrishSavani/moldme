package com.company.Assignments;

import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers. Xn = Xn-1 + Xn-2
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Total numbers in the Fibonacci Series :");
        int n = in.nextInt();
        int i = 1;
        int first = 0;
        int second = 1;
        int number = 0;
        System.out.println("Fibonacci Series:");
        System.out.println(0);
        System.out.println(1);

        while(i<n-1) {
            number = first+second;
            System.out.println(number);
            first = second;
            second = number;
            i++;


        }
    }
}
