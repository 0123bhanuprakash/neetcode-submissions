class Solution {
    public StringBuilder multiplier(char ch, String num2) {
        StringBuilder s = new StringBuilder();
        int carry = 0;
        int d1 = ch - '0';
        for (int i = num2.length() - 1; i >= 0; i--) {
            int d2 = num2.charAt(i) - '0';
            int m = (d1 * d2) + carry;
            s.insert(0, m % 10);
            carry = m / 10;
        }
        if (carry > 0) {
            s.insert(0, carry);
        }
        return s;
    }
    public String sum(String finalOutput, StringBuilder str) {
        StringBuilder s = new StringBuilder();
        int flength = finalOutput.length() - 1;
        int strlength = str.length() - 1;
        int carry = 0;
        while (flength >= 0 || strlength >= 0 || carry > 0) {
            int d1 = 0;
            int d2 = 0;
            if (flength >= 0) {
                d1 = finalOutput.charAt(flength--) - '0';
            }
            if (strlength >= 0) {
                d2 = str.charAt(strlength--) - '0';
            }
            int sum = d1 + d2 + carry;
            s.insert(0, sum%10);
            carry = sum / 10;
        }
        return s.toString();
    }

    public String multiply(String num1, String num2) {
        if (num1.length() == 1 && num1.charAt(0) == '0') {
            return "0";
        }
        if (num2.length() == 1 && num2.charAt(0) == '0') {
            return "0";
        }
        StringBuilder s = new StringBuilder();
        String finalOutput = "0";
        String c = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            char ch = num1.charAt(i);
            if (i < num1.length() - 1) {
                c = c + "0";
            }
            s.append(multiplier(ch, num2));
            s.append(c);
            
            finalOutput = sum(finalOutput, s);

            s.setLength(0);
        }
        return finalOutput;
    }
}

// first we have to call one function where are passing num1 with num[idx] in that function we will
// create one convertor string to int  and sum function that will add two numbers
