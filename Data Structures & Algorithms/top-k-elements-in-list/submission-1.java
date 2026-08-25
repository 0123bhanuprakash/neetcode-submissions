class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(k);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
            list1.add(entry.getValue());
        }

        for (int i = 0; i < k; i++) {
            int max = Integer.MIN_VALUE;
            int val = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j) > max) {
                    max = list1.get(j);
                    val = list.get(j);
                    maxIndex = j;
                }
            }
            list1.set(maxIndex, -1);

            list2.add(val);
        }

        int ans[] = new int[k];

        for (int i = 0; i < list2.size(); i++) {
            ans[i] = list2.get(i);
        }
        return ans;
    }
}
