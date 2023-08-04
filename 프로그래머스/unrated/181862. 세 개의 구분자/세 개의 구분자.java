import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] exception = {"EMPTY"};
        String[] arr = Arrays.stream(myStr.split("a|b|c")).filter(str -> !str.equals("")).toArray(String[]::new);
        if (arr.length == 0){
            return exception;
        }
        return arr;
    }
}