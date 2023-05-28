class Solution {
    public int[] solution(int[] arr) {
        int[] ans = new int[2];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                ans[0] = arr[i];
                ans[1] = i;
            }
        }
        return ans;
    }
}