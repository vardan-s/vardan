class Solution {
    public int searchInsert(int[] nums, int target) {
        int d=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target)
            {
                d=1;
                return i;
                
            }
        }
        if(d==0)
        {
            for(i=0;i<nums.length;i++)
            {
                if(nums.length==1)
                {
                    if(nums[i]<target)
                    return i+1;
                    else
                    return i;
                }
                else if((i+1)==(nums.length))
                {
                    return i+1;
                }
                if (nums[i+1]>target)
                {
                    if(nums[i]<target)
                    {
                        return i+1;
                    }
                    else if(nums[i]>target)
                    {
                        return i;
                    }
                }
                else if(nums[i+1]<target)
                {
                    continue;
                }
            }
        }
        return 0;
    }
    
}