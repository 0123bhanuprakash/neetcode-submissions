class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans.add(matrix[i][j]);
            }
        }
        System.out.println(ans);
        // System.out.println(matrix[0].length-1);
        int k=matrix.length-1;
        int i=0;
        int idx=0;
        while(k>=0){
           while(i<=matrix.length-1){
            matrix[i++][k]=ans.get(idx++);
           }
          
           k--;
           i=0;
        }
    }
}
