class Solution {
    public int[] solution(int start, int end) {
        int[] arr = new int[start - end + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start;
            start--;
        }
        return arr;
    }
}