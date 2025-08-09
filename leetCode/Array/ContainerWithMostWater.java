package leetCode.Array;

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.



Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1


Constraints:

n == height.length
2 <= n <= 10^5
0 <= height[i] <= 10^4
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,3,2,5,25,24,5};
        System.out.println(maxArea(height));            // Good
        System.out.println(maxAreaOptimized(height));   // better
        System.out.println(optimizedMaxArea(height));    // best ans

    }

    private static int optimizedMaxArea(int[] height) {
        if(height.length<=1 || height==null ){
            return 0;
        }
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;

        while(i<j) {
            int h = Math.min(height[i], height[j]);
            int area = h * (j-i);
            maxArea = Math.max(area, maxArea);

            while(height[i]<=h && i<j){
                i++;
            }
            while(height[j]<=h && i<j){
                j--;
            }
        }
        return maxArea;
    }

    // got the optimized approach, but still failing, because some time we are i can give you the ans with say
    // j-4 but before getting to that it might happen that i is getting incremented i++ so it never get to store the desired maxArea


    private static int maxAreaOptimized(int[] height) {
        if(height.length<=1 || height==null ){
            return 0;
        }
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        int maxHeight = 0;

        while(i<j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(area, maxArea);
            if(height[i]> height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxArea;
    }

    public static int maxArea(int[] height) {
        if(height.length<=1 || height==null ){
            return 0;
        }

//        int maxDistance = 0;
//        int maxHeight = 0;
        int maxArea = 0;
        int heightDiff = Integer.MAX_VALUE;

        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                int distance = j-i;
                int initialHeightDiff = height[j] - height[i];
                if(initialHeightDiff<heightDiff){
                    int area = distance * Math.min(height[j], height[i]);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
    }
}
