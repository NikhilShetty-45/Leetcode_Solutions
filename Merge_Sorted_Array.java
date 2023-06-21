class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        int N=m+n;
        for(int i=0; i<N; i++)
        {
            if(nums1[i]==0 && j<n)
            {
                nums1[i]= nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);    
    }
}
