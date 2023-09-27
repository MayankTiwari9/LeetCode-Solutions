class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int i;
        int res[] = new int[nums.length-k+1];
        for(i = 0; i < k; i++){
            while(!q.isEmpty() && nums[i] >= nums[q.peekLast()])
                q.removeLast();
            
            q.addLast(i);
        }
        
        int j = 0;
        for(; i < nums.length;i ++){
            res[j] = nums[q.peek()]; 
            
            while(!q.isEmpty() && q.peek() <= i-k)
                q.removeFirst();
            
            while(!q.isEmpty() && nums[i] >= nums[q.peekLast()])
                q.removeLast();
            
            q.addLast(i);
            
            j++;
        }
        
        res[j] = nums[q.peek()];
        
        return res;
    }
}