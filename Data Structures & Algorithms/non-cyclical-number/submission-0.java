class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n > 0) {
            int sum=0;
            while (n > 0) {
                int temp = n % 10;
                sum += Math.pow(temp, 2);
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n=sum;
        }
        return true;
    }
}
