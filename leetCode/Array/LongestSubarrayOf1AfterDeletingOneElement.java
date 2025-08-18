package leetCode.Array;

/*
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.



Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.


Constraints:

1 <= nums.length <= 10^5
nums[i] is either 0 or 1.
 */

public class LongestSubarrayOf1AfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    private static int longestSubarray(int[] nums) {
        int i =0;
        int j = 0;
        int count = 0;
        int zeroCount = 0;
        int maxOnes = 0;

        while(j < nums.length){
            if(nums[j] == 1){
                count++;
            } else if (nums[j] == 0 && zeroCount < 1) {
                count++;
                zeroCount++;
            } else{
                zeroCount = 0;
                count = 0;
                j = ++i;
                continue;
            }

            maxOnes = Math.max(maxOnes, count-1);   // as we need to delete one zero to get to maximum one count
            j++;
        }
        return maxOnes;
    }
}
