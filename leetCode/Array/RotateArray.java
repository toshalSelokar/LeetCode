package leetCode.Array;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//  Size or Array
        System.out.print("size of array: ");
        int n = sc.nextInt();
//  Initiation and declaration of array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.print(i+" index value: ");
            nums[i] = sc.nextInt();
        }
//  Value with which array needs to be rotated
        System.out.print("Value to rotate: ");
        int k = sc.nextInt();

        System.out.println(rotate(nums, k, n));
    }

    public static int[] rotate(int[] nums, int k, int n) {

//        Transpose of a Matrix
        for (int i = 0; i <= k; i++) {
            int temp = nums[i];
            nums[i] = nums[n-1-i];
            nums[n-1-i] = temp;
        }



        return nums;
    }






}
