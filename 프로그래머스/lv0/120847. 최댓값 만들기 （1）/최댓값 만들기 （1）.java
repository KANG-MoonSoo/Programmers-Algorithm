class Solution {
    public int solution(int[] numbers) {
        int first = 0;
        int second = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (first < numbers[i]){
                first = numbers[i];
                index = i;
            }
        }
        numbers[index] = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (second < numbers[i]){
                second = numbers[i];
            }
        }
        return first * second;
    }
}