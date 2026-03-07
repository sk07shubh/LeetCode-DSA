class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n = nums.size();

        vector<int>result;
        vector<int> seen(n+1,0);

        for(int x : nums){
            seen[x]++;
        }

        for(int i=1 ; i<=n ; i++){
            if(seen[i] == 0){
                result.push_back(i);
            }
        }

        return result;           
        
    }
};