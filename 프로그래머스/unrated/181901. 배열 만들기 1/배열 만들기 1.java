class Solution {
    public int[] solution(int n, int k) {
        int[] ans = new int[n / k];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0){
                ans[index] = i;
                index++;
            }
        }
        return ans;
    }
}