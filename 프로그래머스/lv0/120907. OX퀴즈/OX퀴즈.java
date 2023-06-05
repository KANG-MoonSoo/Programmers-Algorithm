class Solution {
    public String[] solution(String[] quiz) {
       for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");

            int sum = Integer.parseInt(arr[0]);

            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j].equals("+")){
                    sum += Integer.parseInt(arr[j + 1]);
                }
                else if (arr[j].equals("-")) {
                    sum -= Integer.parseInt(arr[j + 1]);
                }
                if (arr[j].equals("=")){
                    if (Integer.parseInt(arr[arr.length-1]) == sum){
                        quiz[i] = "O";
                    }else {
                        quiz[i] = "X";
                    }
                }
            }
        }
        return quiz;
    }
}