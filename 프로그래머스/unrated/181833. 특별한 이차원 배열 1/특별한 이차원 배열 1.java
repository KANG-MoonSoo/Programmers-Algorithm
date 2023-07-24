class Solution {
    public int[][] solution(int n) {
        int[][] ans = new int[n][n];
        for (int i = 0; i < ans.length; i++) {
            ans[i][i] = 1;
        }
        return ans;
    }
}