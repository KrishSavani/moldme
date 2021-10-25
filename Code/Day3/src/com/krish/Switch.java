package com.krish;

import javax.swing.*;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String empDepartment = in.next();

        switch (empId) {
            case 1 -> System.out.println("Krish Savanmi");
            case 2 -> System.out.println("Meet Patel");
            case 3 -> {
                System.out.print("Naivedhya Patel");
                switch (empDepartment) {
                    case "IT" -> System.out.println(" IT department");
                    case "BCA" -> System.out.println(" BCA department");
                    default -> System.out.println("Unknown department");
                }
            }
            default -> System.out.println("Unknown Employee");
        }


    }
}
