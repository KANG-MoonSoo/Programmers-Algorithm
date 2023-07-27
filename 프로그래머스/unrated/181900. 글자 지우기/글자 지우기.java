class Solution {
    public String solution(String my_string, int[] indices) {
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = '0'; 
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0'){
                continue;
            }
            ans += arr[i];
        }
        return ans;
    }
}