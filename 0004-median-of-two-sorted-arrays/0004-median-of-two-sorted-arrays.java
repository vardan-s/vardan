class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int sum=l1+l2;
        int a1[]=new int[sum];
        for(int i=0;i<l1;i++)
        {
            a1[i]=nums1[i];
        }
        for(int i=0;i<l2;i++){
            a1[l1]=nums2[i];
            l1++;
        }
        Arrays.sort(a1);
        if(a1.length % 2 == 1)
        {
        return a1[a1.length / 2];
        }
        else
        {
            int mid = a1.length / 2;
            return (a1[mid - 1] + a1[mid]) / 2.0;
            }
    }

}