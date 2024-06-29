package leetCode;

public class FirstLastOcc {
    public int[] searchRange(int[] nums, int target) {
        int first = firstFind(nums, target);
        int last = lastFind(nums, target);
        int[] ans = new int[2];
        if(first==-1){
            ans[0] =-1;
            ans[1] = -1;
        } else {
            ans[0] =first;
            ans[1] = last;
        }

        return ans;

    }

    public int firstFind(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int firstOcc = -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                firstOcc= mid;
                high = mid -1;
            } else if(nums[mid] > target){
                high = mid -1;
            } else{
                low = mid + 1;
            }

        }
        return firstOcc;
    }

    public int lastFind(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int lastOcc = -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                lastOcc = mid;
                low = mid + 1;
            } else if(nums[mid] < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }

        }
        return lastOcc;
    }
}

