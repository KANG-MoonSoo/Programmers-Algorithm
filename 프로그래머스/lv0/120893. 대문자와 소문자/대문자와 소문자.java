class Solution {
    public String solution(String str) {
         String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                answer += Character.toLowerCase(str.charAt(i));
            } else {
                answer += Character.toUpperCase(str.charAt(i));
            }
        }
        return answer;
    }
}