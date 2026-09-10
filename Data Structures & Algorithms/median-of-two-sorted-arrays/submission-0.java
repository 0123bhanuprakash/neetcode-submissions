class Solution {
    public double findMedianSortedArrays(int[] nums, int[] nums1) {
        int arr[] = new int[nums.length + nums1.length];

        int idx = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length && j < nums1.length) {
            if (nums[i] < nums1[j]) {
                arr[idx++] = nums[i];
                i++;
            } else {
                arr[idx++] = nums1[j];
                j++;
            }
        }
        while (i < nums.length) {
            arr[idx++] = nums[i];
            i++;
        }
        while (j < nums1.length) {
            arr[idx++] = nums1[j];
            j++;
        }
        double ans = 0;
        int mid = arr.length / 2;
        if (arr.length % 2 == 0) {
            ans = (arr[mid] + arr[mid - 1])/2.0;
            return ans;
        } else {
            ans = arr[mid];
        }
        return ans;
    }
}
