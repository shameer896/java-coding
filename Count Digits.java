import java.util.*;

public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int m=n;
        int count=0;
        while(n!=0)
        {
            int temp=n%10;
            //System.out.println(temp);
            if(temp!=0 && m%temp==0)
            count++;
            n=n/10;
        }
        return count;

    }
}
