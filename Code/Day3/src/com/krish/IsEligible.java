package com.krish;

import java.util.Scanner;

public class IsEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Tell me ur age :");
        int age = in.nextInt();


        if (isEligible(age)) {
            System.out.println("You are eligible for voting!");
        }
        else {
            System.out.println("You are a kid go away!!!");
        }
    }

    private static boolean isEligible(int age) {
        return age >= 18;
    }
}
