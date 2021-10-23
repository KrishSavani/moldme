package com.company;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2 ;

        System.out.println("Sum = " + sum);
    }
}
