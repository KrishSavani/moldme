package com.company.Assignments;

//Take name as input and print a greeting message for that name.
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter you name :");
        String name = in.next();

        System.out.println("Heyyyyy ssup " + name);
    }
}
