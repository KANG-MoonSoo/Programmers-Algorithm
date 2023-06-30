import java.util.*;
class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i];
        }
        return Long.parseLong(ans);
    }
}