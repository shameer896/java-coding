class Solution {

    void printTriangle(int n) {
        // code here
        for(int i =n-1;i>=0;i--)
        {
            for(int j=0;j<n-1-i;j++)
            System.out.print(" ");
            
            for(int j=0;j<i*2+1;j++)
            System.out.print("*");
        
            System.out.println();
        }
    }
}
