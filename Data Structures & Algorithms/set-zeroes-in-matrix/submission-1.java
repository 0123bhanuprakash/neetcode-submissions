class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col= matrix[0].length;
        boolean checker[][]=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    checker[i][j]=true;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(checker[i][j]){
                    for(int rows=0;rows<col;rows++){
                        matrix[i][rows]=0;
                    }
                    for(int cols=0;cols<row;cols++){
                        matrix[cols][j]=0;
                    }
                }
            }
        }
    }
}
