class Solution {
    public String solution(String my_string, int m, int c) {
        String ans = "";
        for (int i = c-1; i < my_string.length(); i += m) {
            ans += my_string.charAt(i);
        }
        return ans;
    }
}