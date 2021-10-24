package com.krish;

import java.util.Scanner;

// Factorial Program In Java
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter the number :");
        int number = in.nextInt();
        int i = 1;
        int answer = 1;
        while(i<= number) {
            answer *= i;
            i++;
        }
        System.out.println(answer + " is the factorial!");
    }
}
