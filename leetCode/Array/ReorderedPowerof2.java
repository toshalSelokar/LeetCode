package leetCode.Array;

/*
You are given an integer n. We reorder the digits in any order (including the original order) such that the leading digit is not zero.

Return true if and only if we can do this so that the resulting number is a power of two.



Example 1:

Input: n = 61   //as 16 is the power of 2
Output: true

Example 2:

Input: n = 10
Output: false

Example 3:

Input: n = 182   // as 1228 is the power of 2
Output: true



Constraints:

1 <= n <= 109
 */

import java.util.Scanner;

public class ReorderedPowerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Integer value you want to check if it is a Power of 2 or not. n = ");
        int n = sc.nextInt();

        System.out.println(reorderedPowerOf2(n));

    }

    private static boolean reorderedPowerOf2(int n) {
        // Negative numbers or zero can't be a power of 2
        if (n < 1) {
            return false;
        }

        // Step 1: Get the frequency of each digit in the input number
        int[] inputDigitFreq = digitFreq(n);

        // Step 2: Loop through powers of 2 up to 2^30
        // Why 31? Because 2^30 is the largest power of 2 that fits in a 32-bit int
        for (int i = 0; i < 31; i++) {
            int powerOf2 = (int) Math.pow(2, i);

            // Step 3: Get the digit frequency for this power of 2
            int[] powerOf2DigitFreq = digitFreq(powerOf2);

            // Step 4: Compare both frequency arrays
            if (compareArray(inputDigitFreq, powerOf2DigitFreq)) {
                // If they match, it means we can rearrange `n`'s digits to form this power of 2
                return true;
            }
        }

        // If no power of 2 matches, return false
        return false;
    }

    /**
     * Compares two digit frequency arrays.
     * Each array represents how many times digits 0–9 appear.
     * Returns true if they are identical, false otherwise.
     */
    private static boolean compareArray(int[] arr, int[] nums) {
        for (int i = 0; i < 10; i++) {
            if (arr[i] != nums[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns an array representing the frequency of each digit in the number.
     * Example: n = 128 → returns [0,1,1,0,0,0,0,0,1,0]  // digits 1, 2, and 8 occur once.
     */
    private static int[] digitFreq(int n) {
        int[] digitFreqArr = new int[10]; // index = digit, value = frequency

        // Extract digits until number becomes 0
        while (n > 0) {
            int digit = n % 10;       // Get the last digit
            digitFreqArr[digit]++;    // Increase count for that digit
            n = n / 10;               // Remove the last digit
        }

        return digitFreqArr;
    }
}
