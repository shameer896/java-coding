import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n=a.length;
        int sum=a[0];
        int left=0,right=0;
        int maxLen=0;
        while(right<n)
        {
            while(sum>k && left<=right)
            {
                sum-=a[left];
                left++;
            }

            if(sum==k)
            maxLen=Math.max(maxLen,right-left+1);
            
            right++;

            if(right<n)
            sum+=a[right];
            
        }
        return maxLen;
    }
}
