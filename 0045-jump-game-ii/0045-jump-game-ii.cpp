class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        int end = 0;
        int maxIdx = 0;
        int jumps = 0;

        for(int i=0; i<n-1; i++){
            maxIdx = max(maxIdx , nums[i] + i);
            if(i == end){
                jumps++ ;
                end = maxIdx;
            } 
        }
        
        return jumps;
    }
};