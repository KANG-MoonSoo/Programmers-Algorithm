import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] ans = Arrays.stream(myString.split("[x]+|[x]$")).filter(str -> !str.equals("")).toArray(String[]::new);
        Arrays.sort(ans);
        return ans;
    }
}