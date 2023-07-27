class Solution {
    public String solution(String my_string, int s, int e) {
        String s1 = my_string.substring(0, s);
        String s2 = my_string.substring(s, e+1);
        String s3 = my_string.substring(e+1, my_string.length());
        StringBuilder sbS2 = new StringBuilder(s2);
        String reverseS2 = sbS2.reverse().toString();
        return s1 + reverseS2 + s3;
    }
}