import java.util.ArrayList;

public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l>=r) return;
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    public static void merge(int arr[],int l,int mid,int r){

        ArrayList<Integer> a = new ArrayList<>();
        int left=l;
        int right=mid+1;
        //System.out.println("**"+r+"**");

        while(left<=mid && right<=r)
        {
            if(arr[left]<=arr[right]){
            a.add(arr[left]);
            left++;
            }
            else
            {
                a.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
            {
                a.add(arr[left]);
                left++;
            }
            while(right<=r)
            {
                a.add(arr[right]);
                right++;
            }
            for(int i=l;i<=r;i++)
            {
                arr[i]=a.get(i-l);
            }
    }
}
