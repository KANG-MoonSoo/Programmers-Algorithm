class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String ans = "";
        for (int i = 0; i < my_strings.length; i++) {
            ans += my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }
        return ans;
    }
}