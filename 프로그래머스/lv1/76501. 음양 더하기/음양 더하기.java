class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int ans = 0;
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]){
                absolutes[i] *= -1;
            }
        }
        for (int i = 0; i < absolutes.length; i++) {
            ans += absolutes[i];
        }
        return ans;
    }
}