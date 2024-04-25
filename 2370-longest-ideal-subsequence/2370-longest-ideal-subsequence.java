class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int dp[] = new int[26];
        
        int maxLen = 0;
        
        for(int i = 0; i < n; i++){
            char curr = s.charAt(i);
            int idx = curr - 'a';
            int best = 0;
            
            
            for(int prev = 0; prev < 26; prev++){
                if(Math.abs(curr - 'a' - prev) <= k)
                    best = Math.max(best, dp[prev]);
            }
            
            dp[idx] = best + 1;
            maxLen = Math.max(maxLen, dp[idx]);
        }
        
        return maxLen;
    }
}