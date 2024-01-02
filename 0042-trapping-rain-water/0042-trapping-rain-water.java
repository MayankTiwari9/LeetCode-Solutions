class Solution {
    public int trap(int[] height) {
        int res = 0;
        
        for(int i = 1; i < height.length - 1; i++){
            
            int lMax = height[i];
            
            for(int j = 0; j < i; j++){
                lMax = Math.max(lMax, height[j]);
            }
            
            int rMax = height[i];
            
            for(int j = i + 1; j < height.length; j++){
                rMax = Math.max(rMax, height[j]);
            }
            
            res = res + Math.min(lMax, rMax) - height[i];
        }
        
        return res;
    }
}