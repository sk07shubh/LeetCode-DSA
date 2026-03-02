class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        if(nums1.size() > nums2.size()){
           return findMedianSortedArrays(nums2,nums1);
        }
        int m = nums1.size();
        int n = nums2.size();

        int l = 0;
        int r = m;

        while(l <= r){
            int N1 = l + (r - l)/2;
            int LeftEL = (m+n+1)/2;
            int N2 = LeftEL - N1;

            int x1 = (N1 == 0) ? INT_MIN : nums1[N1-1];
            int x2 = (N2 == 0) ? INT_MIN : nums2[N2-1];

            int x3 = (N1 == m) ? INT_MAX : nums1[N1];
            int x4 = (N2 == n) ? INT_MAX : nums2[N2];

            if(x1 <= x4 && x2 <= x3){
                if((m+n)%2 != 0){
                    return max(x1,x2);
                }else{
                    return (max(x1,x2) + min(x3,x4))/2.0;
                }
            } 

            if(x1 > x4){
                r = N1 -1;
            }else{
                l = N1 + 1;
            }
        }
        return -1;
        
    }
};