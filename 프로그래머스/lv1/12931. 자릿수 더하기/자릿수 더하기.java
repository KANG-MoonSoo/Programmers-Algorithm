import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            ans += str.charAt(i) - '0';
        }
        return ans;
    }
}