class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        if (s.length() < 2) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String str = "" + s.charAt(i);
            System.out.println(str);
            if (str.equals("{") || str.equals("[") || str.equals("(")) {
                stack.push(str);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((stack.peek().equals("{") && str.equals("}"))
                    || (stack.peek().equals("[") && str.equals("]"))
                    || (stack.peek().equals("(") && str.equals(")"))) {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
