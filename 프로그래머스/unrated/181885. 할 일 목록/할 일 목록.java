class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]){
                length++;
            }
        }
        String[] ans = new String[length];
        int index = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]){
                ans[index] = todo_list[i];
                index++;
            }
        }
        return ans;
    }
}