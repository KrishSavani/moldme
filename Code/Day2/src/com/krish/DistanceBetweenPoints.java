package com.krish;

import java.util.Scanner;

// Calculate Distance Between Two Points d=√((x_2-x_1)²+(y_2-y_1)²)
public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter point one in x y format :");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("Enter point two in x y format :");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double distance =  Math.pow(Math.pow((x2 -x1) , 2) + Math.pow((y2 -y1) , 2) , 0.5);
        System.out.println(distance + "is the distance between both the points!");


    }
}
