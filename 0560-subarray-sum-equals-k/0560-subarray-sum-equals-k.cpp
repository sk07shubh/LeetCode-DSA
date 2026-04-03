class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n = nums.size();
        unordered_map<int, int> mp;

        int CurrSum = 0;
        int count = 0;
        mp[0] = 1;
        for (int x : nums) {
            CurrSum += x;
            if (mp.find(CurrSum - k) != mp.end()) {
                count += mp[CurrSum - k];
            }
            mp[CurrSum]++;

        }
            return count;
    }
};