class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        if(target < nums[0])
        {
            return 0;
        }
        else if(target > nums[nums.length-1])
        {
            return nums.length;
        }
        for(int i=0; i<nums.length-1; i++)
        {
            if(target > nums[i] && target < nums[i+1] )
            {
                return i+1;
            }
        }
        return 0;    
    }
}
