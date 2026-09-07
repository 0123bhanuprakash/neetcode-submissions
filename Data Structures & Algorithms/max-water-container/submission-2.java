class Solution {
    public int maxArea(int[] heights) {
        int maxValue = Integer.MIN_VALUE;
        // for (int i = 0; i < heights.length; i++) {
        //     for (int j = i + 1; j < heights.length; j++) {
        //         int height = Math.min(heights[i], heights[j]);
        //         int width = j - i;
        //         int value = height * width;
        //         if (value > maxValue){
        //             maxValue=value;
        //         }
        //     }
        // }
        // return maxValue;
        int left= 0;
        int right = heights.length-1;

        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int width = right-left;
            int value = height * width;
            maxValue = Math.max(maxValue,value);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
       return maxValue; 
    }
}
