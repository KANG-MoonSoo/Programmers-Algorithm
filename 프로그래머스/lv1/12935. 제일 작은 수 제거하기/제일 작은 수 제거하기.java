import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int finalMin = min;
        return Arrays.stream(arr).filter(n -> n != finalMin).toArray();
    }
}