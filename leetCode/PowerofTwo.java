package leetCode;

/*
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:

Input: n = 3
Output: false

 */

import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to check: ");
        int n = sc.nextInt();

        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOf2(n));
    }


//    With using Loop
    public static boolean isPowerOfTwo(int n) {
        int i = 0;

        while(i<=n){
            double res = Math.pow(2,i);
            if(res==n){
                return true;
            }
            i++;
        }
        return false;
    }


//    Without Using loops

    public static boolean isPowerOf2(int n){
        if(n<=0){
            return false;
        }



    return false;
    }
}

