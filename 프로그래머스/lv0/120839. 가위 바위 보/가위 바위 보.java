class Solution {
    public String solution(String rsp) {
         String ans = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '0'){
                ans += "5";
            }
            else if (rsp.charAt(i) == '2'){
                ans += "0";
            }
            else {
                ans += "2";
            }
        }
        return ans;
    }
}