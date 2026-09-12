class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
        return;
        else if(m==0)
        {
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
            }
            return;
        }
        int l=nums1.length-1;
        int i=0;
        while(l>m-1)
        {

            nums1[l]=nums2[i];
            l--;
            i++;
        }
        for(int k = 0; k < nums1.length - 1; k++)
        {
            for(int j = 0; j < nums1.length - 1 - k; j++)
            {
                if(nums1[j] > nums1[j + 1])
                {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
        return;
    }
}