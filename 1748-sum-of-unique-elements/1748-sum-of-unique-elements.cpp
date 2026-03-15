class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        int n = nums.size();

        int sum = 0;
        unordered_map<int,int> freq;
        for(int x : nums){
            freq[x]++;            
        }
        for(auto [key,val] : freq){
            if(val == 1){
                sum += key;
            }
        }
        return sum;
        
    }
};