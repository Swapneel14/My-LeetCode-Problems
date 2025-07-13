import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
         BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        // Multiply the two BigIntegers
        BigInteger ans = a.multiply(b);
        
        // Return the result as a string
        return String.valueOf(ans);

    }
}
