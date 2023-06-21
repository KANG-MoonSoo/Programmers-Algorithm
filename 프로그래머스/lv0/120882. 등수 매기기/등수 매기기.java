import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] sum = new int[score.length];
        int[] rankList = new int[sum.length];
        for (int i = 0; i < score.length; i++) {
           sum[i] = score[i][0] + score[i][1];
        }
        for (int i = 0; i < sum.length; i++) {
            int n = sum[i];
            int rank = 1;
            for (int j = 0; j < sum.length; j++) {
                if (i == j){
                    continue;
                }
                if (n < sum[j]){
                    rank++;
                }
            }
            rankList[i] = rank;
        }
        return rankList;
    }
}