class Solution {
    public int solution(int a, int b) {
        if (Integer.parseInt(Integer.toString(a) + Integer.toString(b)) > 2 * a * b){
            return Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        }
        return 2 * a * b;
    }
}