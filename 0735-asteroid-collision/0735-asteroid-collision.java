class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean shouldPush = true;
            
            while (!st.isEmpty() && st.peek() > 0 && asteroid < 0) {
                int top = st.pop();
                if (top == -asteroid) {
                    shouldPush = false;
                    break;
                } else if (top > -asteroid) {
                    st.push(top);
                    shouldPush = false;
                    break;
                }
            }
            
            if (shouldPush) {
                st.push(asteroid);
            }
        }
        
        int[] result = new int[st.size()];
        int index = st.size() - 1;
        
        while (!st.isEmpty()) {
            result[index--] = st.pop();
        }
        
        return result;
    }
}