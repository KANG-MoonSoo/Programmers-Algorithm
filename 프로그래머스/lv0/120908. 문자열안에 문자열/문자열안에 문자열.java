class Solution {
    public int solution(String str1, String str2) {
        String[] arr = str1.split(str2);
        if (arr.length == 1){
            if (arr[0].length() == str1.length()){
                return 2;
            }
        }
        return 1;
    }
}