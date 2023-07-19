import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]){
                    arr[i] = 0;
                }
            }
        }
        arr = Arrays.stream(arr).filter(n -> n != 0).toArray();
        return arr;
    }
}