import java.util.*;
class Solution {
    public String solution(String str) {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}