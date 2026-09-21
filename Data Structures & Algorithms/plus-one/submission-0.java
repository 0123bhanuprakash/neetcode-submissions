class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + carry;
            ans.add(temp%10);
            int remainder=temp/10;
            if(remainder>0){
                carry=remainder;
            }
            else{
                carry=0;
            }
        }
        if(carry>0){
            ans.add(carry);
        }
        
        int arr[]=new int [ans.size()];
        int k=0;
        for(int i=ans.size()-1;i>=0;i--){
            arr[k++]=ans.get(i);
        }
        return arr;
    }
}
