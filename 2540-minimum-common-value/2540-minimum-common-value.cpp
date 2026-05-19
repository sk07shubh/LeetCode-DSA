class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();

        int a = 0;
        int b = 0;

        while(a < n && b < m){
            if(nums1[a] == nums2[b]) return nums1[a];

            else if( nums1[a] < nums2[b]) a++;

            else b++;
        }
        return -1;



        

    }
};