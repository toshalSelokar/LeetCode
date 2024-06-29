package leetCode;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 */



import java.util.Arrays;
import java.util.Scanner;

public class MissingNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+ " Index Value: ");
            nums[i] = sc.nextInt();
        }

        missingNums(nums, n);
        missingNum(nums, n);
    }


//    Optimal Method

    public static int missingNum(int[] nums, int n) {
        int sum = n * (n+1)/2;

        for (int i = 0; i <n; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }

//    Brute Force Method
    private static int missingNums(int[] nums, int n) {

        Arrays.sort(nums);
        while(nums[n-1]==n) {
            for (int i = n - 1; i > 0; i--) {
                int sub = nums[i] - nums[i - 1];

                if (sub != 1) {
                    int res = nums[i] - 1;
                    return res;
                }
            }
            return 0;
        }
        return n;
    }

    
}
