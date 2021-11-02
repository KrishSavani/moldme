package com.krish;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));


    }
    public static int[] getConcatenation(int[] nums) {


        int[] ans = new int[nums.length * 2];
        int n = nums.length;

        for(int i =0; i < 2*n; i++) {
            if(i<n) {
                ans[i] = nums[i];
            }
            else {
                ans[i] = nums[i-n];
            }
        }

        return ans;
    }
}

