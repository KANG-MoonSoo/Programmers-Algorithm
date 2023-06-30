class Solution {
    public int solution(int num) {
        long newNum = num;
        if (num == 1){
            return 0;
        }
        int ans = 0;
        while (newNum > 1){
            if (newNum % 2 == 0){
                newNum /= 2;
                ans++;
            }else {
                newNum = newNum * 3 + 1;
                ans++;
            }
        }if (ans >= 500){
            return -1;
        }
        return ans;
    }
}