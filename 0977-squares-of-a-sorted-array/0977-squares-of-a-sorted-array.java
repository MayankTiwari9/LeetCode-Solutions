class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
            nums[n] = nums[i]*nums[i];
            n++;
        }
        Arrays.sort(nums);
        return nums;
    }
}