public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        if(target==1)
        return "NO";
        int i=0,j=0;
        while(i<n)
        {
            j=i+1;
            while(j<n)
            {
                if(book[i]+book[j]==target)
                return "YES";
                j++;
            }
            i++;
        }
        return "NO";
    }
}
