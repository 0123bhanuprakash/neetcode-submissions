class Solution {
    public int evalRPN(String[] nums) {
        Stack<Integer> stack = new Stack<>();
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            String token=""+nums[i];
            if ((nums[i].equals("+")) || (nums[i].equals("-")) || (nums[i].equals("*"))
                || (nums[i].equals("/"))) {
                int a = stack.pop();
                int b = stack.pop();

                if (token.equals("+")) {
                    val = b + a;
                } else if (token.equals("-")) {
                    val = b - a;
                } else if (token.equals("*")) {
                    val = b * a;
                } else {
                    val = b / a;
                }
                stack.push(val);
            }
            else{
                stack.push(Integer.parseInt(nums[i]));
            }
        }
        return stack.peek();
    }
}
