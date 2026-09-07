class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        String ans = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = "" + s.charAt(i);
            while(ans.contains(String.valueOf(str))){
                ans=ans.substring(1);
            }
            ans+=str;
            count=Math.max(count,ans.length());
        }
        return count;
    }
}
