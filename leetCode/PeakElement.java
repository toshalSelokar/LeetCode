package leetCode;

public class PeakElement {

    public int findPeakElement(int[] nums) {

        int lo = 0;
        int hi = nums.length-1;

        while(lo<hi){
            int mi = lo + (hi-lo)/2;

            if(nums[mi]<nums[mi+1]){
                lo = mi + 1;
            } else
                hi = mi;
        }

        return hi;

    }

}

