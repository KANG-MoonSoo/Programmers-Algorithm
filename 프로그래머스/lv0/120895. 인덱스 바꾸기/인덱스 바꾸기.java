class Solution {
    public String solution(String str, int num1, int num2) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == num1){
                ans += str.charAt(num2);
                continue;
            }
            if (i == num2){
                ans += str.charAt(num1);
                continue;
            }
            ans += str.charAt(i);
        }
        return ans;
    }
}