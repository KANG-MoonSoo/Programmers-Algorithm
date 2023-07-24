class Solution {
    public String solution(int[] numLog) {
        String ans = "";
        int start = numLog[0];
        for (int i = 1; i < numLog.length; i++) {
            if (start == numLog[i] + 1){
                ans += "s";
            } else if (start == numLog[i] - 1) {
                ans += "w";
            } else if (start == numLog[i] + 10) {
                ans += "a";
            }else {
                ans += "d";
            }
            start = numLog[i];
        }
        return ans;
    }
}