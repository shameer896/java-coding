public class Solution {

    public static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }

    public static int calcGCD(int n, int m){
        // Write your code here.
        int min=Math.min(n,m);
        int max=Math.max(n,m);

        return gcd(min,max);
    }
}
