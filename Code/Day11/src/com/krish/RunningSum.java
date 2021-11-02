package com.krish;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));

    }
    public static int[] runningSum(int[] nums) {

        int[] sum = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {

            for(int j = 0; j <= i; j++) {
                sum[i] += nums[j];
            }

        }
        return sum;
    }
}
