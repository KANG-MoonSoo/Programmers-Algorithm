class Solution {
    public String solution(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                continue;
            }
            ans += str.charAt(i);
        }
        return ans;
    }
}