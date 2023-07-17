class Solution {
    public String solution(String[] str_list, String ex) {
        String ans = "";
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].contains(ex)){
                continue;
            }else 
                ans += str_list[i];
        }
        return ans;
    }
}