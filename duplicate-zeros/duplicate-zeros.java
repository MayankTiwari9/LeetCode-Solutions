class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        
        int[] temp = new int[n * 2]; 
        
        int i = 0, j = 0;
        
        while (i < n && j < n * 2) { 
            if (arr[i] == 0) {
                temp[j++] = 0;
                temp[j++] = 0;
                i++;
            } else {
                temp[j++] = arr[i++];
            }
        }
        
        for (i = 0; i < n; i++)
            arr[i] = temp[i];
        
    }
}