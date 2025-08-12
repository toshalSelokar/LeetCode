package leetCode.Array;

public class FindPeakElement {
    public static void main(String[] args) {

    }

    public static int findPeakElement(int[] nums) {
        if(nums==null || nums.length < 2){
            return 0;
        }
        if(nums.length<3){
            if(nums[0]>nums[1]){
                return 0;
            } else{
                return 1;
            }
        }

        int peak = 0;

        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i]> nums[i+1] && nums[i]> nums[i-1]){
                return i;
            } else{
                return nums[nums.length-1];
            }

        }
        return peak;        // solve for [1,2,3,1]
    }
}
