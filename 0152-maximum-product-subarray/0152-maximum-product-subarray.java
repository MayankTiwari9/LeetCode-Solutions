class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        
        if(nums.length == 1){
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            int currMax = 1;

            for (int j = i; j < nums.length; j++) {
                currMax *= nums[j];
                max = Math.max(currMax, max);
            }
        }

        return max;
    }
}