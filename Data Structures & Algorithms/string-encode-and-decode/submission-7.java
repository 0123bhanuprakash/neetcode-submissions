class Solution {
    public String encode(List<String> str) {
        if(str.size()==0){
            return null;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.size(); i++) {
            String check = "" + str.get(i);
            System.out.println("check length"+check.length());
            if (check.length() == 0) {
                s.append("%20");
                s.append("%30");
            } else {
                s.append(check);
                s.append("%30");
            }
        }
        String ans = s.toString();
        return ans;
    }

    public List<String> decode(String str) {
        System.out.println("ff" + str);
        List<String> ans = new ArrayList<>();
        if(str==null){
            return ans;
        }
        String check[] = str.split("%30");
        String ssr = "";
        for (int i = 0; i < check.length; i++) {
            String s = "" + check[i];
            if (s.equals("%20")) {
                ans.add(ssr);
            } else {
                ans.add(check[i]);
            }
        }
        return ans;
    }
}
