class Solution {
    public int solution(int[] box, int n) {
        int ans = 1;
        for (int i = 0; i < box.length; i++) {
            int a = box[i] / n;
            ans *= a;
        }
        return ans;
    }
}