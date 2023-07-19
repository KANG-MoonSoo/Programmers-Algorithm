class Solution {
    public String solution(String myString) {
        String ans = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 'l'){
                ans += "l";
            }else
                ans += myString.charAt(i);
        }
        return ans;
    }
}