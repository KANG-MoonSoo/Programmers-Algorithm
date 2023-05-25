import java.util.*;
class Solution {
    public String solution(String str) {
        int index = 0;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (str.charAt(i) == str.charAt(j)){
                    cnt++;
                }
            }
            if (cnt == 0){
                s += str.charAt(i);
            }
        }
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        return ans;
    }
}