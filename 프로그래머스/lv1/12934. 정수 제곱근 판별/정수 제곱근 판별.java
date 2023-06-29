class Solution {
    public long solution(long n) {
        double nd = Math.sqrt(n);
        while (nd >= 1){
            nd--;
        }
        if (nd == 0){
            return (long) Math.pow(Math.sqrt(n) +1, 2);
        }else
            return -1;
    }
}