class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        ArrayList<String>ans=new ArrayList<>();
        ArrayList<String>ans1=new ArrayList<>();
       for(int i=0;i<s.length();i++){
        String q=""+s.charAt(i);
        ans.add(q);
       }
       for(int i=0;i<t.length();i++){
        String q=""+t.charAt(i);
        ans1.add(q);
       }
       
       Collections.sort(ans);
       Collections.sort(ans1);
      
       return ans.equals(ans1);
    }
}
