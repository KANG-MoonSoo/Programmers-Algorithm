import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        int[] comparison = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            comparison[i] = arr[i];
        }
        while (true){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 +1;
                }
            }
            if (Arrays.equals(comparison, arr)){
                break;
            }
            for (int i = 0; i < arr.length; i++) {
                comparison[i] = arr[i];
            }
            cnt++;
        }
        return cnt;
    }
}