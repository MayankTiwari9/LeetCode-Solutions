class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}