class Solution {
    public int solution(int n) {
        int ans = 0;
        if (n % 2 != 0){
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0){
                    ans += i;
                }
            }
        }else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0){
                    ans += Math.pow(i, 2);
                }
            }
        }
        return ans;
    }
}