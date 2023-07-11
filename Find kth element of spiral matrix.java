class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	int l=0,r=m-1;
	int t=0,d=n-1;
	int i;
	ArrayList<Integer> a= new ArrayList<Integer>();
	while(l<=r && t<=d)
	{
	    for(i=l;i<=r;i++)
	    {
	        a.add(A[t][i]);
	        //System.out.println(A[t][i]);
	    }
	    t++;
	    for(i=t;i<=d;i++)
	    {
	        a.add(A[i][r]);
	        //System.out.println(A[i][r]);
	    }
	    r--;
	    for(i=r;i>=l;i--)
	    {
	        a.add(A[d][i]);
	        //System.out.println(A[d][i]);
	    }
	    d--;
	    for(i=d;i>=t;i--)
	    {
	        a.add(A[i][l]);
	        //System.out.println(A[i][l]);
	    }
	    l++;
	}
	return a.get(k-1);
    }
}
