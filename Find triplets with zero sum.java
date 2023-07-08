class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        for(int i=0;i<n-2;i++)
        {
            int k=n-1;
            for(int j=i+1;j<n-1;k--)
            {
                //System.out.println(i+"  "+j+"   "+k);
                if(k==j)
                {
                    j++;
                    k=n;
                }
                else if((arr[i]+arr[j]+arr[k])==0)
                return true;
                
            }
        }
        return false;
    }
}
