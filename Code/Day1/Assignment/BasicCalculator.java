package com.company.Assignments;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter first number :");
        float num1 = in.nextFloat();
        System.out.print("Please enter operator (+, -, *, /):");
        char operator = in.next().charAt(0);
        System.out.print("Please enter second number :");
        float num2 = in.nextFloat();

        // (+, -, *, /)

        if(operator == '+') {
            System.out.println("Answer = " + (num1 + num2));
        }
        if(operator == '-') {
            System.out.println("Answer = " + (num1 - num2));
        }
        if(operator == '*') {
            System.out.println("Answer = " + (num1 * num2));
        }
        if(operator == '/') {
            System.out.println("Answer = " + (num1 / num2));
        }
        else {
            System.out.println("You entered an invalid operator");
        }


    }
}
