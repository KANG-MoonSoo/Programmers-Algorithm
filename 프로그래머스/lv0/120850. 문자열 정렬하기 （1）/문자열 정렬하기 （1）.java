import java.util.*;
class Solution {
    public int[] solution(String str) {
        String room = "";
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                room += str.charAt(i);
            }
        }
        int[] ans = new int[room.length()];
        for (int i = 0; i < room.length(); i++) {
             int n = room.charAt(i) - '0';
             ans[i] = n;
        }
        Arrays.sort(ans);
        return ans;
    }
}