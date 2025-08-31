package leetCode.Array;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]



Constraints:

    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?
 */

import java.util.Scanner;

public class MoveZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of Nums Array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+ " index value: ");
            nums[i] = sc.nextInt();
        }
        optimizedMoveZeroes(nums);
        moveZeroes(nums);

    }

    public static void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[j]!=0){
                    nums [i] = nums[j];
                    if(j>i){
                        nums[j] =0;
                    }
                    break;
                }
            }
        }
    }

    // optimized solution
    public static void optimizedMoveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return;
        }

        int j =0;
        for(int i = j ; i<n ; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }


        for(int k = j ; k < n ; k++){
            nums[k] = 0;
        }
        System.out.println(nums);

    }
}
