class Solution {
    public int solution(int[][] dots) {
        if (line(dots[0], dots[1]) == line(dots[2], dots[3])){
            return 1;
        }
        if (line(dots[0], dots[2]) == line(dots[1], dots[3])){
            return 1;
        }
        if (line(dots[0], dots[3]) == line(dots[1], dots[2])){
            return 1;
        }
        return 0;
    }
    private static double line(int[] dot1, int[] dot2){
        return (double) (dot1[1] - dot2[1]) / (dot1[0] - dot2[0]);
    }
}