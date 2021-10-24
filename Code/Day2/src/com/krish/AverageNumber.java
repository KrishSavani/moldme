package com.krish;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of numbers :");
        int n = in.nextInt();
        int i = 1;
        int average = 0;
        while(i<=n) {
            System.out.print("Enter a number :");
            average = average + in.nextInt();
            i++;
        }
        average /= n;
        System.out.println(average + " is the average!");

    }
}
