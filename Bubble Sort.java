public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        int sorted=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    sorted=1;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(sorted==0)
            break;
        }
    }

}
