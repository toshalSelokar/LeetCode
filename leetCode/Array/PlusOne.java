package leetCode.Array;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,0,9};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] ans;
//  if in input array, first input is 9 then because of 9+1 = 10 possibility we are increasing the size by 1 of our ans array
//  But need of bigger array will only be there is input array's first input is also changing otherwise will have to lessen the size
        if(digits[0]==9){
            ans = new int[n+1];
            for (int i = 0; i < n; i++) {
                ans[i+1] = digits[i];
            }
        } else {
            ans = digits;
        }
        ans[ans.length-1] = digits[n-1] +1;

        int i = ans.length-1;
        while(i>=0){
            if(ans[i] == 10) {
                ans[i] = 0;
                ans[i - 1] = ans[i - 1] + 1;
            }
            i--;
        }

//  In case of unchanges input array's first input, we will have "0" at zeroth index in our ans, to remove that possibility we are using following loop.
        if(ans[0]==0){
            int[] res = new int[n];
            for (int j = 0; j < n; j++) {
                res[j] = ans[j+1];
            }
            return res;
        }

        return ans;
    }
}
