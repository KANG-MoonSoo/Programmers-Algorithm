class Solution {
    public long[] solution(int x, int n) {
        long xl = x;
        long[] ans = new long[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = xl;
            xl += x;
        }
        return ans;
    }
}