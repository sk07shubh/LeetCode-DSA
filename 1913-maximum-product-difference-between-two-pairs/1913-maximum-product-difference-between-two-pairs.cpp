class Solution {
public:
    int maxProductDifference(vector<int>& nums) {
        int n = nums.size();

        sort(begin(nums),end(nums));

        int result = (nums[n-1] * nums[n-2]) - (nums[0] * nums[1]);

        return result;
    }
};