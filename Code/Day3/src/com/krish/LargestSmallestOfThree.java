package com.krish;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class LargestSmallestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        largestNumber(num1,num2,num3);
        smallestNumber(num1,num2,num3);




    }

    private static void smallestNumber(int num1, int num2, int num3) {

        int min = num1;

        if(num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("Largest number is :" + min);
    }

    private static void largestNumber(int num1, int num2, int num3) {

        int max = num1;

        if(num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Largest number is :" + max);


    }
}
