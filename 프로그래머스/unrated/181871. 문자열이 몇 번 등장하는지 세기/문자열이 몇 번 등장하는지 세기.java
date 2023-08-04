class Solution {
    public int solution(String myString, String pat) {
        int ans = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String str = myString.substring(i, i+pat.length());
            if (str.equals(pat)){
                ans++;
            }
        }
        return ans;
    }
}