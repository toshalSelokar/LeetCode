package leetCode;

/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+ " Index Value: ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Target: ");
        int k = sc.nextInt();

        System.out.println(subarraySum(nums, n, k));
    }

    public static int subarraySum(int[] nums, int n, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        var res = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return res;
    }
}
