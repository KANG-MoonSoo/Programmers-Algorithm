class Solution {
    public int solution(int[] dot) {
        int ans = 0;
        if (dot[0] >= 1 && dot[1] >= 1){
            ans = 1;
        } else if (dot[0] >= 1 && dot[1] <= -1) {
            ans = 4;
        } else if (dot[0] <= -1 && dot[1] >= 1) {
            ans = 2;
        }else {
            ans = 3;
        }
        return ans;
    }
}