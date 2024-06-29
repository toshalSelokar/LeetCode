package leetCode;


import java.util.Scanner;

/*An array is considered special if every pair of its adjacent elements contains two numbers with different parity. You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.

Example 1:

Input: nums = [1]
Output: true

Explanation:
There is only one element. So the answer is true.

Example 2:

Input: nums = [2,1,4]
Output: true

Explanation:There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.

Example 3:

Input: nums = [4,3,1,6]
Output: false

Explanation:
nums[1] and nums[2] are both odd. So the answer is false.

Constraints:
        1 <= nums.length <= 100
        1 <= nums[i] <= 100    */




//public class SpecialArray1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter the size of an array: ");
//        int n = sc.nextInt();
//
//        int[] nums = new int[n];
//
//        for (int i = 0; i < n; i++) {
//
//            System.out.print(i +" index value: ");
//            nums[i]=sc.nextInt();
//
//        }
//
//        System.out.println(isArraySpecial(nums));
//    }
//
//    public static boolean isArraySpecial(int[] nums) {
//
//        isParity(){
//            int x=0;
//            while(x< nums.length){
//                if (nums[x] % 2 == 1) {
//                    return false;
//                } else
//                    return true;
//            }
//        }
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            if(isParity(nums[i])==isParity(nums[i-1])){
//                return false;
//            } else
//                return true;
//
//        }
//        return false;
//    }
//
//    private static boolean isParity(int[] nums, int x){
//        if(nums[x]%2==1){
//            return false;
//        } else
//            return true;
//    }
//}


public class SpecialArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of an array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i + " index value: ");
            nums[i] = sc.nextInt();
        }

        System.out.println(isArraySpecial(nums));
    }

    public static boolean isArraySpecial(int[] nums) {
        if (nums.length == 0) {
            return false; // Empty array is not considered special
        }

        for (int i = 1; i < nums.length; i++) {
            if (isParity(nums[i]) == isParity(nums[i - 1])) {
                return false; // Two consecutive numbers have the same parity
            }
        }
        return true; // The array has alternating even and odd numbers
    }

    public static boolean isParity(int num) {
        return num % 2 == 0; // Returns true if even, false if odd
    }
}