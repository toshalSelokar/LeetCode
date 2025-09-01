package leetCode.Array;

/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]


Constraints:
1 <= numRows <= 30
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if(numRows < 1){
            return ans;
        }

        List<Integer> pre, one, row = null;
        one = new ArrayList<>();
        one.add(1);

        ans.add(one);

        if(numRows == 1){
            return ans;
        }

        pre = new ArrayList<>();
        pre.add(1);
        pre.add(1);

        ans.add(pre);

        if(numRows == 2){
            return ans;
        }

        for (int i = 2; i < numRows; i++) {
            row = new ArrayList<>();
            row.add(1);

            for (int j = 0; j < pre.size() -1; j++) {
                row.add(pre.get(j) + pre.get(j+1));
            }

            row.add(1);

            ans.add(row);

            pre = row;
        }


        return ans;
    }
}
