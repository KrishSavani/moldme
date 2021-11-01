package com.krish;

import java.util.Arrays;

public class ReverseArrayItems {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
