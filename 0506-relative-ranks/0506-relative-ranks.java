import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int n = score.length;
        
        String[] str = new String[n];
        
        int[] sortedArr = Arrays.copyOf(score, n);
        
        Arrays.sort(sortedArr);
        for (int i = 0; i < n / 2; i++) {
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[n - i - 1];
            sortedArr[n - i - 1] = temp;
        }
        
        for(int i = 0; i < sortedArr.length; i++)
            map.put(sortedArr[i], i);
        
        for(int i = 0; i < score.length; i++){
            int idx = map.get(score[i]);
            
            if(idx == 0)
                str[i] = "Gold Medal";
            else if(idx == 1)
                str[i] = "Silver Medal";
            else if(idx == 2)
                str[i] = "Bronze Medal";
            else
                str[i] = String.valueOf(idx + 1);
        }
        
        return str;
    }
}
