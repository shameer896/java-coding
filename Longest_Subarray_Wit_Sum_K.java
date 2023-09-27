import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int n=nums.length;

		Map<Integer,Integer> presum=new HashMap<Integer,Integer>();
		int sum=0;
		int maxlen=0;
		for(int i=0;i<n;i++)
		{
			sum+=nums[i];

			if(sum==k)
			{
				maxlen=Math.max(maxlen, i+1);
			}

			int rem=sum-k;

			if(presum.containsKey(rem))
			{
				int len=i- presum.get(rem);
				maxlen=Math.max(len, maxlen);
			}

			if(!presum.containsKey(sum))
			presum.put(sum,i);
		}
		return maxlen;
	}
