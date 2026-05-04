class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int k=0;k<n;k++){
            for(int j=k;j<n;j++){
                int temp=matrix[k][j];
                matrix[k][j]=matrix[j][k];
                matrix[j][k]=temp;
                
            }
        }
        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        
        
        
        
    }
}