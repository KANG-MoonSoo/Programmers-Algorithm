import java.util.*;
class Solution {
    public int solution(int[] arr, int n) {
        int ans = 0;
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Math.abs(n - arr[i]);
        }
        int index = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (index > arr2[i]){
                index = arr2[i];
                ans = arr[i];
            }
        }
        if (index == arr2[0]){
            ans = arr[0];
        }
        return ans;
    }
}