class Solution {
    public int solution(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans++;
            ans = jump(ans);
        }
        return ans;
    }
    private static int jump(int num){
        if (num % 3 == 0 || Integer.toString(num).contains("3")){
            return jump(num + 1);
        }
        return num;
    }
}