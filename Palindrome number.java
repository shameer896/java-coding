public class Solution {
    public static boolean palindromeNumber(int n){

        String input = Integer.toString(n);

        String reversed = new StringBuffer(input).reverse().toString();

        return input.equalsIgnoreCase(reversed);

  }
}
