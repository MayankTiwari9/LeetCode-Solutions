class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length-1;
        
        int c = matrix[0].length;   
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(target >= matrix[mid][0] && target <= matrix[mid][c - 1])
                return search1D(matrix[mid], target);
            
            if(target < matrix[mid][0])
                end = mid - 1;
            
            else
                start = mid + 1;
        }
        
        return false;
    }
    
    public boolean search1D(int matrix[], int target){
        int start = 0;
        int end = matrix.length;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(matrix[mid] == target)
                return true;
            
            else if(target < matrix[mid])
                end = mid - 1;
            
            else
                start = mid + 1;
        }
        
        return false;
    }
}