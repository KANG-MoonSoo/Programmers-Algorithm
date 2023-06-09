class Solution {
    public int solution(int[] sides) {
        int max = 0;
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]){
                max = sides[i];
            }
        }
        int min = max - Math.abs(sides[0] - sides[1]);
        int cnt = 0;
        for (int i = 0; i <= max; i++) {
            if (i + min > max){
                cnt++;
            }
        }
        cnt += min - 1;
        return cnt;
    }
}