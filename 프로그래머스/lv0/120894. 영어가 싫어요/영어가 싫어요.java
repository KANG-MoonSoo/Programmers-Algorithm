class Solution {
    public long solution(String numbers) {
        String ans = "";
        String str = "";
        for (int i = 0; i < numbers.length(); i++) {
            str += numbers.charAt(i);
            if (str.equals("one")){
                ans += "1";
                str = "";
            }
            if (str.equals("two")) {
                ans += "2";
                str = "";
            }
            if (str.equals("three")) {
                ans += "3";
                str = "";
            }
            if (str.equals("four")) {
                ans += "4";
                str = "";
            }
            if (str.equals("five")) {
                ans += "5";
                str = "";
            }
            if (str.equals("six")) {
                ans += "6";
                str = "";
            }
            if (str.equals("seven")) {
                ans += "7";
                str = "";
            }
            if (str.equals("eight")) {
                ans += "8";
                str = "";
            }
            if (str.equals("nine")) {
                ans += "9";
                str = "";
            }
            if (str.equals("zero")) {
                ans += "0";
                str = "";
            }
        }
        return Long.parseLong(ans);
    }
}