public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int min=Math.min(n,m);

        for(int i=min;i>=1;i--)
        {
            //System.out.println(i);
            if(n%i==0 && m%i==0){
                return i;
            }
        }
        return 1;
    }
}
