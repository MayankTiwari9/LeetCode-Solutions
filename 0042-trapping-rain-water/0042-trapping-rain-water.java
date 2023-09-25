class Solution {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack<>();
        int n = height.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && height[s.peek()] < height[i]){
                int popH = height[s.peek()];
                s.pop();
                if(s.isEmpty()){
                    break;
                }
                
                int dis = i - s.peek() - 1;
                int minH = Math.min(height[s.peek()], height[i])-popH;
                ans += dis * minH;
            }
            s.push(i);
        }
        return ans;        
    }
}