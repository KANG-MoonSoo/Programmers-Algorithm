class Solution {
    public int[] solution(int n) {
        int length = 0;
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                length++;
            }
        }
        int[] ans = new int[length];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                ans[index] = i;
                index++;
            }
        }
        return ans;
    }
}