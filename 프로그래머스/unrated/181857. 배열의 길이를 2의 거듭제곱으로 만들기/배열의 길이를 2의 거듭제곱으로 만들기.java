class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        int[] list = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        for (int i = 0; i < list.length; i++) {
            if (arr.length == list[i]){
                return arr;
            }else if (arr.length < list[i]){
                length = list[i];
                break;
            }
        }
        int[] ans = new int[length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}