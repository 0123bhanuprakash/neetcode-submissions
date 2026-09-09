class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
               end=mid;
            }
        }
        return nums[start];
    }
}

// class Solution {
//     public int lowest(int[] nums, int start, int end) {
//         int lowest = Integer.MIN_VALUE;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             lowest = nums[mid];
//             if ((nums[mid + 1] > lowest) && (nums[mid - 1]) > lowest ) {
//                 return lowest;
//             } else if ((nums[mid + 1] > lowest) && (nums[mid - 1] < lowest)) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return lowest;
//     }
//     public int findMin(int[] nums) {
//         int start = 0;
//         int end = nums.length - 1;
//         int mid = end / 2;
//         int low = Math.min(lowest(nums, start, mid), lowest(nums, mid, end));
//         return low;
//     }
// }
