class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] ans = {0, 0};
        int w = board[0] / 2;
        int h = board[1] / 2;
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")){
                ans[1]++;
                if (ans[1] > h){
                    ans[1]--;
                }
            } else if (keyinput[i].equals("down")) {
                ans[1]--;
                if (ans[1] < h * -1){
                    ans[1]++;
                }
            } else if (keyinput[i].equals("right")) {
                ans[0]++;
                if (ans[0] > w){
                    ans[0]--;
                }
            }else {
                ans[0]--;
                if (ans[0] < w * -1){
                    ans[0]++;
                }
            }
        }
        return ans;
    }
}