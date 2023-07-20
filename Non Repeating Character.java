class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        char arr[]=S.toCharArray();
        ArrayList<Character> a = new ArrayList<Character>();
        for(int i=0;i<arr.length;i++)
         {
             a.add(S.charAt(i));
         }
        for(int i=0;i<arr.length;i++)
        {
            if(Collections.frequency(a,arr[i])==1)
            {
                return arr[i];
            }
             
        }
        return '$';
    }
}
