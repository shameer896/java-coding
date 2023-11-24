public class Solution {

    static int devisors(int n){
        int sum=0;
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
            {
                sum+=i;
                if(i!= n/i)
                sum+=(n/i);
            }
        }
        return sum;
    }

    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=devisors(i);
        }
        return sum;
    }
}
