package leetCode.Array;

/*
Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */


import java.awt.*;
import java.util.Scanner;

public class MaxProdSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("array size n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+" index: ");
            nums[i]= sc.nextInt();
        }

        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
//        int maxProd = nums[0];
//        int prod = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            prod =prod * nums[i];
//
//            if(prod>maxProd){
//                maxProd = prod;
//            } else if(nums[i]>maxProd){
//                maxProd = nums[i];
//            }
//        }


//        Somehow it is working for most of the test cases but  [0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0]
//        int prod = 1;
//        int maxProd = nums[0];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                prod *= nums[j];
//
//                if(prod>maxProd){
//                    maxProd = prod;
//                } else if(nums[i]>maxProd){
//                    maxProd = nums[i];
//                }
//            }
//            prod = 1;
//        }
//
//
//        return maxProd;

        int n = nums.length;

        double max = Integer.MIN_VALUE;
        double pre=1,post=1;

        for(int i=0;i<n;i++)
        {
            if(pre == 0) pre =1;
            if(post==0) post =1;

            pre *= nums[i];
            post *= nums[n-i-1];
            max = Math.max(max, Math.max(pre,post));
        }

        return (int)max;
    }
}
