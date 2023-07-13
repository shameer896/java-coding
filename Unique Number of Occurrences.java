class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here()
        ArrayList<Integer> a = new ArrayList<Integer>(); 
        int count=0;
        Arrays.sort(arr);
        int temp=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==temp)
            {
                count++;
            }
            else
            {
                if(a.contains(count))
                return false;
                else
                {
                    a.add(count);
                    count=1;
                    temp=arr[i];
                }
            }
        }
        if(a.contains(count))
        return false;
        else
        return true;
    }
}
 
