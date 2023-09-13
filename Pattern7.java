class Solution {

    void printTriangle(int n) {
        // code here
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            System.out.print(" ");
            
            for(int j=0;j<i*2+1;j++)
            System.out.print("*");
        
            System.out.println();
        }
    }
}
