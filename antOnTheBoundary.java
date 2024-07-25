class Solution {
    public int returnToBoundaryCount(int[] nums) 
    {
        int n= nums.length;
        int sum = nums[0],count=0;
        for(int i =1; i<n; i++)
        {
           sum = sum + nums[i];
           if(sum == 0)
           {
                count++;
           } 
        }
        return count;
    }
}
