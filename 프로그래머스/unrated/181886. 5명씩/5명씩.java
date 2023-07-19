class Solution {
    public String[] solution(String[] names) {
       int length = 0;
        if (names.length % 5 != 0){
            length = names.length / 5 + 1;
        }else{
            length = names.length / 5;
        }
        String[] ans = new String[length];
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0){
                ans[index] = names[i];
                index++;
            }
        }
        return ans;
    }
}