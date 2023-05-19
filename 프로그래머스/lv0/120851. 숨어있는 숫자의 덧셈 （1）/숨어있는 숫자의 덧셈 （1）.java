class Solution {
    public int solution(String str) {
        String room = "";
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                room += str.charAt(i);
            }
        }
        int ans = 0;
        for (int i = 0; i < room.length(); i++) {
             int n = room.charAt(i) - '0';
             ans += n;
        }
        return ans;
    }
}