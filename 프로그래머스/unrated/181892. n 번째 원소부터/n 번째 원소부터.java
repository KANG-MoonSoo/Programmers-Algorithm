class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] ans = new int[num_list.length - (n - 1)];
        int index = 0;
        for (int i = n-1; i < num_list.length; i++) {
            ans[index] = num_list[i];
            index++;
        }
        return ans;
    }
}