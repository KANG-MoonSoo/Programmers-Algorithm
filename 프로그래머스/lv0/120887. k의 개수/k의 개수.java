class Solution {
    public int solution(int i, int j, int k) {
        int ans = 0;
        for (int l = i; l <= j; l++) {
            for (int m = 0; m < Integer.toString(l).length(); m++) {
                if (Integer.toString(l).charAt(m) == k + '0'){
                    ans++;
                }
            }
        }
        return ans;
    }
}