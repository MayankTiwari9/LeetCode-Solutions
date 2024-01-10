class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        
        int charArr = 256;
        
        int[] count = new int[charArr];
        
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        
        for(int i = 0; i < count.length; i++)
            if(count[i] != 0)
                return false;

        return true;
    }
}