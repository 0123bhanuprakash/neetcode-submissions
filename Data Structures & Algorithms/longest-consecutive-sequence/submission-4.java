class Solution {
    public boolean isValid(int i, int j){
        if(i+1==j){
            return true;
        }
        return false;
    }

    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int num[]=new int[set.size()];
        int incr=0;
        for(int val:set){
            num[incr++]=val;
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int count=1;
        int finalCount=1;
        for(int i=0;i<num.length-1;i++){
            if(isValid(num[i],num[i+1])){
                count++;
                if(count>finalCount){
                    finalCount=count;
                }
            }
            else{
                count=1;
            }
        }
        
        return finalCount;
    }
}
