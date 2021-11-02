package com.krish;

import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] acc = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(acc));

    }
    public static int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;

            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
