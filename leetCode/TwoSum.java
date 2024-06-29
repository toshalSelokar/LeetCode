package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <= n-1; i++) {
            System.out.print("Enter the number at "+ i + " index: ");
            arr[i] = sc.nextInt();

        }

//        int[] nums = {2, 4, 3, 1, 5, 7, 9, 0, 6, 8};
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int[] result = twoSum(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> dict = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            int tar = target - nums[i];

            if(dict.containsKey(tar)){
                System.out.println(dict.get(tar));
                return new int[]{dict.get(tar), i};
            }
            dict.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
