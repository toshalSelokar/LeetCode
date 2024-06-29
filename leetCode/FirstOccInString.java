package leetCode;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */


import java.util.Scanner;

public class FirstOccInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("String1: ");
        String haystack = sc.next();

        System.out.print("String2: ");
        String needle = sc.next();


        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {


        }
        return 1;
    }

}
