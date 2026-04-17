class Solution {
public:
    int reverseNum(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }

    int minMirrorPairDistance(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int, vector<int>> indices;

        for (int i = 0; i < n; i++)
            indices[nums[i]].push_back(i);

        int ans = INT_MAX;

        for (int i = 0; i < n; i++) {
            int rev = reverseNum(nums[i]);

            if (indices.count(rev)) {
                auto& vec = indices[rev];
                auto it = upper_bound(vec.begin(), vec.end(), i);
                if (it != vec.end())
                    ans = min(ans, *it - i);
            }
        }

        return ans == INT_MAX ? -1 : ans;
    }
};