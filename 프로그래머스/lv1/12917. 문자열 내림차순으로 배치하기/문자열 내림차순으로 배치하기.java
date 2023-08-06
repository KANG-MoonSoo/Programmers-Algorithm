import java.util.*;
class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String ans = "";
        for (int i = arr.length-1; i >= 0; i--) {
            ans += arr[i];
        }
        return ans;
    }
}