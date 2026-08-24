class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer>entries:map.entrySet()){
            if(entries.getValue()!=1){
                return true;
            }
        }
        return false;
    }
}