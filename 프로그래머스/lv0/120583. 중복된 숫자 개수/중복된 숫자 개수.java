class Solution {
    public int solution(int[] arr, int n) {
       int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                cnt++;
            }
        }
        return cnt;
    }
}