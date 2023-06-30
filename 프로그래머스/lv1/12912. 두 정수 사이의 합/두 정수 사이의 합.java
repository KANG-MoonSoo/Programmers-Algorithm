class Solution {
    public long solution(int a, int b) {
        if (b == a){
            return a;
        }
        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        long ans = 0;
        for (int i = a; i <= b; i++) {
            ans += i;
        }
        return ans;
    }
}