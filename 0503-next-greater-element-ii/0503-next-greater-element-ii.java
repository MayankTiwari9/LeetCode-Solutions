class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int resultPointer=res.length-1;
        Stack<Integer> s = new Stack<>();
        
        for(int i = nums.length-1;i >= 0; i--){
            if(!s.isEmpty() && s.peek() <= nums[i]){
                s.pop();
            }
            s.push(nums[i]);
        }   
        
        for(int i = nums.length-1;i >= 0; i--){
            while(!s.isEmpty() && s.peek() <= nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[resultPointer--] = -1;
                s.push(nums[i]);
            }else{
                res[resultPointer--] = s.peek();
                s.push(nums[i]);
            }
            s.push(nums[i]);
        }
        
        while(!s.empty() && s.peek() <= nums[nums.length-1]) {
                s.pop();
            }
            if(!s.empty()) {
                res[res.length-1] = s.pop();
            }
            
            return res;
    }
}