package com.krish;

import java.util.Scanner;

/* Write a program to print the sum of negative numbers,
 sum of positive even numbers and the sum of positive odd numbers
 from a list of numbers (N) entered by the user. The list terminates
 when the user enters a zero.

*/
public class NumberMarket {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int negativeNumberSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;
        while(true) {
            System.out.print("Enter a number :");
            int number = in.nextInt();
            if(number == 0) {
                break;
            }
            else if(number < 0) {
                negativeNumberSum += number;
            }
            else if(number % 2 == 0) {
                positiveEvenSum += number;
            }
            else {
                positiveOddSum += number;
            }

        }
        System.out.println("sum of negative numbers : " + negativeNumberSum + " sum of positive even numbers :" + positiveEvenSum + " sum of positive odd numbers :" + positiveOddSum);

    }
}
