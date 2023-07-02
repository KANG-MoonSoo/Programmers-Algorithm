class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int ans = 0;
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]){
                ans += absolutes[i] * -1;
            }else
                ans += absolutes[i];
        } 
        return ans;
    }
}