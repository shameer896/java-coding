class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(nums[i]);
        }
        for(int i=0;i<k;i++)
        {
            int temp=a.get(nums.length-1);
            a.remove(nums.length-1);
            a.add(0,temp);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=a.get(i);
        }
    }
}
