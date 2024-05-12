class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        
        for(int i = 1; i < n - 1; ++i){
            for(int j = 1; j < n - 1; ++j){
                int temp = 0;
                
                for(int k = i - 1; k <= i + 1; ++k){
                    for(int l = j - 1; l <= j + 1; ++l){
                        temp = Math.max(temp, grid[k][l]);
                    }
                }
                
                grid[i - 1][j - 1] = temp;
            }
        }
        
        int[][] result = new int[n - 2][n - 2];
        for(int i = 0; i < n - 2; ++i){
            System.arraycopy(grid[i], 0, result[i], 0, n - 2);
        }
        
        return result;
    }
}