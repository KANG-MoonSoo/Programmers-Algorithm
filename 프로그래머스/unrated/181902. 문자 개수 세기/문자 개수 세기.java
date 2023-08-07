class Solution {
    public int[] solution(String my_string) {
        int[] ans = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            if ('A' <= my_string.charAt(i) && my_string.charAt(i) <= 'Z'){
                ans[my_string.charAt(i) - 65]++;
            }else {
                ans[my_string.charAt(i) - 71]++;
            }
        }
        return ans;
    }
}