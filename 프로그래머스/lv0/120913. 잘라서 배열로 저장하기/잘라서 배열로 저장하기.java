class Solution {
    public String[] solution(String str, int n) {
        int cnt = (str.length() + n - 1) / n;
        String[] ans = new String[cnt];

        for(int i = 0; i < cnt; i++){
            int start = n * i;
            int end = 0;
            if(start + n >= str.length()){
                end = str.length();
            } else {
                end = start + n;
            }
            ans[i] = str.substring(start, end);
        }
        return ans;
    }
}