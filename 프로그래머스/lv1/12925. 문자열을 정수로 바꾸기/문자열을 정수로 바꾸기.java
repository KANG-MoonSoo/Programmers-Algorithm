class Solution {
    public int solution(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '+'){
                continue;
            }
            str += s.charAt(i);
        }
        if (s.charAt(0) == '-'){
            return Integer.parseInt(str) * -1;
        }else
            return Integer.parseInt(str);
    }
}