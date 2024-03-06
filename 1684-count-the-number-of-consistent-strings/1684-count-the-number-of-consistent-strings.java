class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr = new int[26];
        
        int cnt = words.length;
        
        for(char c : allowed.toCharArray())
            arr[c - 'a']++;
        
        for(String word : words){
            for(char c : word.toCharArray()){
                if(arr[c - 'a'] == 0){
                    cnt--;
                    break;
                }
            }
        }
        
        return cnt;
        
    }
}