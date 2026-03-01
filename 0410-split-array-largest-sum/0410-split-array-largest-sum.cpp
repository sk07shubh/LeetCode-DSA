class Solution {
public:
    
    bool canSplit(vector<int>& nums, int k, long long maxSum) {
        long long currentSum = 0;
        int count = 1;  
        
        for(int num : nums){
            if (currentSum + num <= maxSum) {
                currentSum += num;
            }else{
                count++;
                currentSum = num;
                
                if(count > k){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    int splitArray(vector<int>& nums, int k) {
        long long low = *max_element(nums.begin(), nums.end());
        long long high = accumulate(nums.begin(), nums.end(), 0LL);
        
        while(low <= high){
            long long mid = low + (high - low) / 2;
            
            if(canSplit(nums, k, mid)){
                high = mid - 1;  
            }else{
                low = mid + 1;   
            }
        }
        
        return low;
    }
};