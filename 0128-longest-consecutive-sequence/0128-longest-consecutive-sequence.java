class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        Arrays.sort(nums);
        int larg=1,lastsmall=Integer.MIN_VALUE,cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==lastsmall)
            {
                cnt+=1;
                lastsmall=nums[i];
            }
            else if(nums[i]!=lastsmall)
            {
                cnt=1;
                lastsmall=nums[i];
            }
            larg=Math.max(cnt,larg);
        }
    return larg;
    }
}