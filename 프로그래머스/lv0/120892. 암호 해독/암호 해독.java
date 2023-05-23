class Solution {
    public String solution(String cipher, int code) {
        String ans = "";
        for (int i = code - 1; i < cipher.length(); i += code) {
            ans += cipher.charAt(i);
        }
        return ans;
    }
}