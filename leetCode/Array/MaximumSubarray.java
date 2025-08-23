package leetCode.Array;

/*
Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:

1 <= nums.length <= 10^5
 */

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArrayOptimized(nums));

        int[] result = maxSumSubArray(nums);

        for(int i: result){
            System.out.println(i);
        }

    }

    public static int maxSubArray(int[] nums) {
        if(nums.length==0 || nums==null){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(nums[i]>sum){
                sum = nums[i];
            }

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    private static int maxSubArrayOptimized(int[] nums){
        int maxSum = nums[0], currSum = 0;

        for (int i : nums) {
            currSum += i;
            maxSum = currSum > maxSum ? currSum : maxSum;
            if (currSum < 0) currSum = 0;
        }

        return maxSum;
    }

    private static int[] maxSumSubArray(int[] nums){
        if(nums.length==0 || nums==null || nums.length==1){
            return nums;
        }

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(nums[i]>sum){
                sum = nums[i];
                start = i;
            }

            if(sum > maxSum){
                maxSum = sum;
                end = i;
            }
        }

        int[] ans = new int[end - start +1];
        int j = 0;
        for (int i = start; i <= end; i++) {
            ans[j++] = nums[i];
        }

        return ans;
    }
}
