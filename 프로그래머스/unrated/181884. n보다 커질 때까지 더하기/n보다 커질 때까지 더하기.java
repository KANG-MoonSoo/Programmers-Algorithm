class Solution {
    public int solution(int[] numbers, int n) {
        int ans = 0;
        for (int i = 0; i < numbers.length; i++) {
            ans += numbers[i];
            if (ans > n){
                return ans;
            }
        }
        return ans;
    }
}