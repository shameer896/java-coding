class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        // Your code here
        int k=1;
        Arrays.sort(arr);
        if(arr[n-1]<=0)
        return k;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0 && arr[i]==k)
                k++;
        }
        return k;
    }
}
