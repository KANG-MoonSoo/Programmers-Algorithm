class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        int ans = 0;
        max = sides[0];
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]){
                max = sides[i];
            }
        }
        for (int i = 0; i < sides.length; i++) {
            if (max == sides[i]){
                sides[i] = 0;
                break;
            }
        }
        for (int i = 0; i < sides.length; i++) {
            sum += sides[i];
        }
        if (max >= sum){
            ans = 2;
        }else {
            ans = 1;
        }
        return ans;
    }
}