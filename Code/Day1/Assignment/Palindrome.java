package com.company.Assignments;

import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string :");
        String str = in.next();
        boolean isPalindrome = false;
        int i = 0;
        int j = str.length() - 1;
        while(i<j) {
            if (str.charAt(i) == str.charAt(j))
            {
                isPalindrome = true;
            }
            else {
                isPalindrome =false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome) {
            System.out.println("Given string is a palindrome!");
        }
        else {
            System.out.println("Given string is not a palindrome!");
        }
    }
}
