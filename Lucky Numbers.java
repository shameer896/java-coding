class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    static boolean solve( int num , int div ) {
        
        if( num%div == 0 ) return false;
        if( num%div == num ) return true;
        int quo = num/div;
        int rem = num%div;
        
        int res = (quo*div)+(rem - quo);
        
        return solve( res , div+1 );
        
    }
    
    
    public static boolean isLucky(int n)
    {
        // Your code here
        return solve( n , 2 );
    }
}
