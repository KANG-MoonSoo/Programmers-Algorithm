class Solution {
    public int[] solution(String[] strlist) {
        String str = "";
        int[] ans = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            str = strlist[i];
            ans[i] = str.length();
        }
        return ans;
    }
}