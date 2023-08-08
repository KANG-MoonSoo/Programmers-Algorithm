import java.math.BigDecimal;
class Solution {
    public String solution(String a, String b) {
       BigDecimal num1 = new BigDecimal(a);
        BigDecimal num2 = new BigDecimal(b);
        BigDecimal result = num1.add(num2);
        return result.toString();
    }
}