class Solution {
    public String solution(String phone_number) {
        String ans = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            ans += "*";
        }
        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            ans += phone_number.charAt(i);
        }
        return ans;
    }
}