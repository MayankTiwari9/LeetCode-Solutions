class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(n < 3){
            return ans;
        }
        
        if(nums[0] > 0){
            return ans;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; ++i){
            map.put(nums[i], i);
        }
        
        for(int i = 0; i < n-2 ; ++i){
            if(nums[i] > 0){
                break;
            }
            
            for(int j = i + 1; j < n - 1; ++j){
                int req = -1 * (nums[i] + nums[j]);
                if(map.containsKey(req) && map.get(req) > j){
                    ans.add(Arrays.asList(nums[i], nums[j], req));
                }
                j = map.get(nums[j]);
            }
            i = map.get(nums[i]);
        }
        return ans;
    }
}