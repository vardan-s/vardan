class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a,sum,c;
        
        for(a=0;a<nums.length;a++){
            c=nums[a];
            for(int j=a+1;j<nums.length;j++)
            {
                if(a==j)
                {
                    continue;
                }
                sum=c+nums[j];
                if(sum==target)
                {
                   
                    return new int[]{a, j};
                                   }
                                   
            }
           

        }  
        return new int[]{};
    }
}