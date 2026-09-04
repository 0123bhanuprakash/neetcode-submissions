class Solution {
    public boolean isPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asciiValue = (int) ch;
            if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)
                || (asciiValue >= 48 && asciiValue <= 57)) {
                ans += ch;
            }
        }
        int inc = 0;
        int dcr = ans.length() - 1;
        String finalAnswer= ans.toLowerCase();
        System.out.println(finalAnswer);
        while (inc <= dcr) {
            System.out.println(finalAnswer.charAt(inc));
            System.out.println(finalAnswer.charAt(dcr));
            if (finalAnswer.charAt(inc) == finalAnswer.charAt(dcr)) {
                inc++;
                dcr--;
            } else {
                return false;
            }
        }
        return true;
    }
}
