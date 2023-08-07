class Solution {
    public boolean solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!('0' <= s.charAt(i) && s.charAt(i) <= '9')){
                return false;
            }
        }
        if (s.length() == 4 || s.length() == 6){
            return true;
        }
        return false;
    }
}