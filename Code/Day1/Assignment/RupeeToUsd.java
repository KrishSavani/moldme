package com.company.Assignments;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class RupeeToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter amount in rupees :");
        double rupee = in.nextDouble();
        double usd = rupee * 0.013;
        System.out.println("Amount in usd = " + usd);

    }
}
