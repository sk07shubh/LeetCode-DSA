class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        int n = nums.size();

        unordered_map<int,int> freq;
        unordered_map<int,int> first;
        unordered_map<int,int> last;

        for(int i=0 ; i<n ; i++){
            int x = nums[i];
            freq[x]++;

            if(first.find(x) == first.end()){
                first[x] = i;
            }

            last[x] = i;

        }

        int degree = 0;
        for(auto z : freq){
            degree = max(degree , z.second);
        }

        int ans = n;

        for(auto y : freq){
            if( y.second == degree){
                int num = y.first;
                ans = min(ans , last[num] - first[num] + 1);
            }
        }
        return ans;

        
    }
};