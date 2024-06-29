package leetCode;

/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3

Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.

Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
 */


import java.util.Scanner;

public class UglyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the num: ");
        int n = sc.nextInt();

        System.out.println(isUgly(n));

    }

    public static boolean isUgly(int n) {
        int[] arr ={5,3,2};

        for (int i = 0; i < arr.length; i++) {

            while(n%arr[i]==0){
                n=n/arr[i];
            }

        }

        return n==1;

    }

}
