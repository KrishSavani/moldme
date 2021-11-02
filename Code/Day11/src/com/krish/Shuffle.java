package com.krish;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr)));



    }
    public static int[] shuffle(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i = 0; i<nums.length; i++) {
            if(i%2 == 0) {
                arr[i] = nums[i/2];
            }
            else {
                arr[i] = nums[(nums.length + i-1)/2];
            }
        }
        return arr;
    }
}
