class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        
        int curr = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                cnt++;
                
            }else{
                curr = Math.max(curr, cnt);
                cnt = 0;
            }
        }
        return (Math.max(curr, cnt));
    }
}