class Solution {
    public int[] solution(int n, int[] list) {
        int cnt = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % n == 0){
                cnt++;
            }
        }
        int index = 0;
        int[] ans = new int[cnt];
        for (int i = 0; i < list.length; i++) {
            if (list[i] % n == 0){
                ans[index] = list[i];
                index++;
            }
        }
        return ans;
    }
}