class Solution {
    public int[] solution(int num, int total) {
        int[] ans = new int[num];
        int first = total / num - ((num - 1) / 2);
        for (int i = 0; i < ans.length; i++) {
            ans[i] = first;
            first++;
        }
        return ans;
    }
}