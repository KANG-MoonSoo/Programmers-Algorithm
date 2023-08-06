import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] length = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            length[strArr[i].length()] += 1;
        }
        Arrays.sort(length);
        return length[length.length-1];
    }
}