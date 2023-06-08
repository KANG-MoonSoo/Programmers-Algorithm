class Solution {
    public int solution(int[][] dots) {
        double a = Math.sqrt(Math.pow(dots[0][0] - dots[1][0], 2) + Math.pow(dots[0][1] - dots[1][1], 2));
        double b = Math.sqrt(Math.pow(dots[0][0] - dots[2][0], 2) + Math.pow(dots[0][1] - dots[2][1], 2));
        double c = Math.sqrt(Math.pow(dots[0][0] - dots[3][0], 2) + Math.pow(dots[0][1] - dots[3][1], 2));

        if (a >= b && a >= c){
            a = 1;
        } else if (b >= a && b >= c) {
            b = 1;
        }else {
            c = 1;
        }

        return (int) (a * b * c);
    }
}