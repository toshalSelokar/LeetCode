package leetCode;

/*
Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0

Example 3:
Input: n = 1
Output: 0
 */

import IntialPractise.Scaler;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        if (n<=2) {
            return 0;
        }
        int count = 0;
        int i = 2;
        while(i<n){
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    i++;
                    j=1;
                }
            }
            if(i<n){
                count++;
                i++;
            }
        }
        return count;
    }
}
