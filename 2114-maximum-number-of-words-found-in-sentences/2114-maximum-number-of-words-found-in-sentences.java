class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for(int i = 0; i < sentences.length; i++){
            String str = sentences[i];
            
            int cnt =  1;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ' ')
                    cnt++;
            }
            
            max = Math.max(max, cnt);
        }
        
        
        return max;
    }
}