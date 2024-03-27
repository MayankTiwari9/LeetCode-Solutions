class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int startRow = 0;
        int startCol = 0;
        int lastRow = row - 1;
        int lastCol = col - 1;
        
        int i = 0;
        
        
        while(i < row * col){
            for(int j = startCol; j <= lastCol; j++){
                list.add(matrix[startRow][j]);
                i++;
            }
            startRow++;
            
            if(i == row * col)
                break;
            
            for(int j = startRow; j <= lastRow; j++){
                list.add(matrix[j][lastCol]);
                i++;
            }
            lastCol--;
            
            if(i == row * col)
                break;
            
            for(int j = lastCol; j >= startCol; j--){
                list.add(matrix[lastRow][j]);
                i++;
            }
            lastRow--;
            
            if(i == row * col)
                break;
            
            for(int j = lastRow; j >= startRow; j--){
                list.add(matrix[j][startCol]);
                i++;
            }
            startCol++;
        }
        
        return list;
    }
}