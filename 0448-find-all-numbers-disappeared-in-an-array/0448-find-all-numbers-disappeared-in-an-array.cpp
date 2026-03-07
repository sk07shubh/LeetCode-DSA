class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n = nums.size();

        vector<int>result;

        unordered_map<int,int> freq;

        for(int x : nums){
            freq[x]++;
        }

        for(int i=1 ; i<=n ; i++ ){
            if(freq[i] == 0){
                result.push_back(i);
            }
        }
        return result;     
       
        
    }
};