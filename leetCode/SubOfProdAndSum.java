package leetCode;

/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:
Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21
 */

import java.util.Scanner;

public class SubOfProdAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the num: ");
        int n = sc.nextByte();
        System.out.print(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {

        int sum = 0;
        int prod = 1;

        while(n>0){
            int i = n%10;
            sum = sum + i;
            prod = prod * i;
            n = n/10;
        }

        int res = prod - sum;
        return res;
    }
}
