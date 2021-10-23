package com.company.Assignments;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal in rupees :");
        float principal = in.nextFloat();
        System.out.print("Enter time in years :");
        int time = in.nextInt();
        System.out.print("Enter rate in rupees :");
        float rate = in.nextFloat();

        float simpleInterest = principal * time * rate;
        System.out.print("Your Simple interst is :" + simpleInterest);



    }
}
