class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        

        int k=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==val)
                k++;
            else
                nums[i-k]=nums[i];
        }
        return l-k;
    }
}