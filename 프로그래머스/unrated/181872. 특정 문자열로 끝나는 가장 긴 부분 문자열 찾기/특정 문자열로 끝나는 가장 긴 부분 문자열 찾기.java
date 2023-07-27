class Solution {
    public String solution(String myString, String pat) {
         String[] arr = myString.split(pat, -1);
        String ans = "";
        for (int i = 0; i < myString.length()-arr[arr.length-1].length(); i++) {
            ans += myString.charAt(i);
        }
        return ans;
    }
}