class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            while(stack.isEmpty() == false && heights[stack.peek()] >= heights[i]){
                int tp = stack.pop();
                int curr = heights[tp]*(stack.isEmpty() ? i : (i-stack.peek()-1));
                res = Math.max(res,curr);
            }
            stack.push(i);
        }

        while(stack.isEmpty() ==false){
            int tp = stack.pop();
            int curr = heights[tp]*(stack.isEmpty() ? n : (n-stack.peek()-1));
            res = Math.max(res, curr);
        }
        return res;
    }
}