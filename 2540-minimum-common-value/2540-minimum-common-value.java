class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int a = 0;
        int b = 0;

        if(nums2[0] > nums1[m-1] || nums1[0] > nums2[n-1]) return -1;

        while(a < m && b < n){
            if(nums1[a] == nums2[b]){
                return nums1[a];
            }else if(nums1[a] < nums2[b]){
                a++;
            }else{
                b++;
            }
        }
        return -1;
        
    }
}