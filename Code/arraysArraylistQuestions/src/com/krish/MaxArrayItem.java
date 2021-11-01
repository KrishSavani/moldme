package com.krish;

public class MaxArrayItem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(maxItem(arr));
    }

    private static int maxItem(int[] arr) {
        int max = arr[0];
        for (int i: arr
             ) {
            if(i > max)
            max = i;

        }
        return max;
    }
}
