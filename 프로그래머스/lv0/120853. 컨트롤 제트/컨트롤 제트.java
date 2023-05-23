class Solution {
    public int solution(String str) {
        String[] sArray = str.split(" ");
        int result = 0;
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i].equals("Z")) {
                result -= Integer.parseInt(sArray[i - 1]);
                continue;
            }
            result += Integer.parseInt(sArray[i]);
        }
        return result;
    }
}