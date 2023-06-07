class Solution {
    public int solution(int[] arr) {
        String str = "";
        
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        
        int cnt = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '7'){
                cnt++;
            }
        }
        
        return cnt;
    }
}