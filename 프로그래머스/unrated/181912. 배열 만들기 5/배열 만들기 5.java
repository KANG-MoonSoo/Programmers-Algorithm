import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int intValue = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (k < intValue) {
                list.add(intValue);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}