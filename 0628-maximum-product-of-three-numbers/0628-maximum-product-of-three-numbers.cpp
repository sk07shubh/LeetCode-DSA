class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int n = nums.size();
        if(n < 3) return -1;

        sort(begin(nums),end(nums));

        int Max1 = nums[n-1] * nums[n-2] * nums[n-3];
        int Max2 = nums[0] * nums[1] * nums[n-1];
        
        return max(Max1,Max2);
        
    }
};