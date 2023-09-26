public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=1;i<size;i++)
        {
            int j=i;
            int temp=arr[i];
            while(j>0 && arr[j-1]>temp)
            {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
