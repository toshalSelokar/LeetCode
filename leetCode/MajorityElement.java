package leetCode;

/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */


import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+" index: ");
            nums[i] = sc.nextInt();
        }

        System.out.println(majorityElement(nums, n));
        System.out.println(majorityElement1(nums, n));
    }


//  Below method gives the Desired result but with Time and Space Complexity of O(n)
    public static int majorityElement(int[] nums, int n) {
        HashMap<Integer, Integer> resg = new HashMap<>();

        int entry=0;
        for (int i = 0; i < nums.length; i++) {

            entry = nums[i];

            if(resg.containsKey(entry)){
                resg.put(entry, resg.getOrDefault(entry,0)+1);
            } else {
                resg.put(entry, resg.getOrDefault(entry,0)+1);
            }

            if(resg.get(entry)>n/2){
                return entry;
            }
        }



        return entry;
    }


//    Below method gives the Desired result but with Time Complexity of O(n) and Space Complexity of O(1)
    public static int majorityElement1(int[] nums, int n){
        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==majority){
                count++;
            } else{
                count--;
                if(count==0){
                    majority = nums[i];
                    count = 1;
                }
            }
        }
        return majority;
    }

}
