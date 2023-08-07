class Solution {
    public int[] solution(int[] arr) {
        int first = 0;
        int last = 0;
        int[] exception = {-1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                first = i;
                break;
            }
            if (i == arr.length-1){
                return exception;
            }
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 2){
                last = i;
                break;
            }
        }
        int[] ans = new int[last - first +1];
        int index = 0;
        for (int i = first; i <= last; i++) {
            ans[index] = arr[i];
            index++;
        }
        return ans;
    }
}