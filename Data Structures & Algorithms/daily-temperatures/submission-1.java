class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        for (int i = 0; i < temp.length-1; i++) {
            int count = 1;
            for (int j = i+1; j < temp.length; j++) {
                if(temp[j]>temp[i]){
                    ans[i]=count;
                    break;
                }
                else{
                    count++;
                }
            }
        }
        return ans ;
    }
}
