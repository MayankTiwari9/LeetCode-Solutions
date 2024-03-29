class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        if(nums[low] <= nums[high])
            return nums[low];
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(mid > 0 && nums[mid] < nums[mid-1])
                return nums[mid];
            
            if(nums[mid] > nums[high])
                low = mid+1;
            else
                high = mid - 1;
        }
        
        return nums[low];
    }
}