class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String str = "";
        for (int i = 0; i < my_string.length(); i++) {
            if ('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9'){
                str += my_string.charAt(i);
            }else {
                str += " ";
            }
        }
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")){
                continue;
            }else {
                sum += Integer.parseInt(arr[i]);
            }
        }
        return sum;
    }
}