class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        System.out.println(map);
       for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(map.containsKey(diff) && map.get(diff)!=i){
            ans[0]=i;
            ans[1]=map.get(diff);
            break;
        }
       }
       return ans;
    }
}
