class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int a[]=new int[n];
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a[arr[i]]++;
        }
        for(int j=0;j<a.length;j++)
        {
            if(a[j]>1)
            {
                list.add(j);
            }
        }
        if(list.isEmpty())
        {
            list.add(-1);  
        }
      return list;
    }
}
