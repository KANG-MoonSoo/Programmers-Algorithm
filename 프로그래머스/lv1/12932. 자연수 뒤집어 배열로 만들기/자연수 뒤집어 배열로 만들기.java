class Solution {
    public int[] solution(long n) {
        StringBuilder str = new StringBuilder(Long.toString(n));
        String reverseStr = str.reverse().toString();
        int[] ans = new int[reverseStr.length()];
        for (int i = 0; i < reverseStr.length(); i++) {
            ans[i] = reverseStr.charAt(i) - '0';
        }
        return ans;
    }
}