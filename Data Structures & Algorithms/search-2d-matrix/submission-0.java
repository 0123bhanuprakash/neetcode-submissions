class Solution {
    public boolean binarySearch(ArrayList<Integer>list , int target){
        System.out.println(list);
        int start=0;
        int end=list.size()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(list.get(mid)==target){
                return true;
            }
            else if(list.get(mid)>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                list.add(matrix[i][j]);
            }
        }
        return binarySearch(list,target);
    }
}
