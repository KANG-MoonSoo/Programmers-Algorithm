class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            length += arr[i];
        }
        int[] ans = new int[length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                ans[index] = arr[i];
                index++;
            }
        }
        return ans;
    }
}