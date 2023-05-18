class Solution {
    public int solution(int n) {
        int ans = 0;
        for (int i = 1; i <= 10; i++) {
            if (n >= factorial(i)){
                ans = i;
            }
        }
        return ans;
    }

    private static int factorial(int i) {
        if (1 < i) return i * factorial(i - 1);
        return i;
    }
}