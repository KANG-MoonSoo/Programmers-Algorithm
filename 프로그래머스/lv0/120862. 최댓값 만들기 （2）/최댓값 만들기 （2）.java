class Solution {
    public int solution(int[] numbers) {
        if (numbers.length < 2){
            return numbers[0] * numbers[1];
        }
        int ans = 0;
        int min1 = 10000;
        int min2 = 10000;
        int max1 = -10000;
        int max2 = -10000;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min1 > numbers[i]){
                min1 = numbers[i];
                index = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (index == i){
                continue;
            }
            if (min2 > numbers[i]){
                min2 = numbers[i];
            }
        }
        index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max1 < numbers[i]){
                max1 = numbers[i];
                index = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (index == i){
                continue;
            }
            if (max2 < numbers[i]){
                max2 = numbers[i];
            }
        }
        if (min1 * min2 > max1 * max2){
            ans = min1 * min2;
        }else {
            ans = max1 * max2;
        }
        return ans;
    }
}