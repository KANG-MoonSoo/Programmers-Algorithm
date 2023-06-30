import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                length++;
            }
        }
        int[] ans;
        if (length == 0) {
            ans = new int[1];
            ans[0] = -1;
        } else {
            ans = new int[length];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    ans[index] = arr[i];
                    index++;
                }
            }
            Arrays.sort(ans);
        }
        return ans;
    }
}