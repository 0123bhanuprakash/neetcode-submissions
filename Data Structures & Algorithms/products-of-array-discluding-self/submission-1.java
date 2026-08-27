class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalvalue = 1;
        int totalzerocount=0;
        int zeroindex=-1;
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
             if(nums[i]==0){
               totalzerocount++;
               zeroindex=i;
             }
             else{
                totalvalue*=nums[i];
             }
        }
        System.out.println(totalvalue);
        System.out.println(zeroindex);
        if(totalzerocount>1){
            return ans;
        }
        if(totalzerocount==1){
            ans[zeroindex] = totalvalue;
            System.out.println("jkdfbkd"+ans[zeroindex]);
            return ans;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i]=totalvalue/nums[i];
        }
        return ans;
    }
}
