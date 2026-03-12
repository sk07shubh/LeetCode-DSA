class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int n = nums.size();

        int minVal = nums[0];
        int MaxDiff = -1;

        for(int j=1 ; j<n ; j++){
            if(nums[j] > minVal){
                MaxDiff = max(MaxDiff,nums[j]-minVal);
            }
            minVal = min(minVal,nums[j]);
        }
        return MaxDiff;

    }
}; 