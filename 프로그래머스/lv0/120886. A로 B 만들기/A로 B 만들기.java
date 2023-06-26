class Solution {
    public int solution(String before, String after) {
        for (int i = 0; i < before.length(); i++) {
            after = after.replaceFirst("" + before.charAt(i), "");
        }
        if (after.equals("")){
            return 1;
        }
        return 0;
    }
}