class Solution {
public:
    int mostFrequent(vector<int>& nums, int key) {
        int n = nums.size();

        unordered_map<int,int> freq;

        for(int i=0 ; i< n-1 ;i++){
            if( nums[i] == key){
                freq[nums[i+1]]++;                
            }
        }
        
        int maxCount = 0;
        int result = -1;
        
        for(auto [key,val] : freq){
            if(val > maxCount){
                maxCount = val;
                result = key;
            }
        }
        return result;
        
    }
};