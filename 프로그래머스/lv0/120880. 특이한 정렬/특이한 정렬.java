import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int ans[] = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            ans[i] = Math.abs(numlist[i] - n);
        }
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ans[i] + n;
        }
        for (int i = 0; i < ans.length; i++) {
            int cnt = 0;
            for (int j = 0; j < numlist.length; j++) {
                if (ans[i] == numlist[j]){
                    cnt++;
                }
            }
            if (cnt == 0){
                ans[i] = (ans[i] - n) * -1 + n;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            int a = ans[i];
            for (int j = 0; j < ans.length; j++) {
                if (i == j){
                    continue;
                }
                if (a  == ans[j]){
                    ans[j] = (ans[j] - n) * -1 + n;
                }
            }
        }
        return ans;
    }
}