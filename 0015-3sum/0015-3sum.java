class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(n < 3){
            return ans;
        }
        
        for(int i = 0; i < n; ++i){
            if(nums[i] > 0)
                break;
            
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            
            int low = i + 1, high = n - 1;
            
            while(low < high){
                int sum = nums[i] + nums[low] +  nums[high];
                
                if(sum > 0)
                    high--;
                else if(sum < 0)
                    low++;
                else{
                    ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    int lowLastOcc = nums[low];
                    int highLastOcc = nums[high];
                    
                    while(low < high && nums[low] == lowLastOcc)
                        low++;
                    
                    while(low < high && nums[high] == highLastOcc)
                        high--;
                }
            }
        }
        return ans;
    }
}