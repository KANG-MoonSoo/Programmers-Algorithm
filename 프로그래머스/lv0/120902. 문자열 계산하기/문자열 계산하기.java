class Solution {
    public int solution(String str) {
        String[] arr = str.split(" ");
        int sum = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i].equals("+")){
                sum += Integer.parseInt(arr[i + 1]);
            } else if (arr[i].equals("-")) {
                sum -= Integer.parseInt(arr[i + 1]);
            }
        }
        return sum;
    }
}