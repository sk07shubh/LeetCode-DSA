class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        int n = nums.size();
        priority_queue<int, vector<int>, greater<int>> minHeap;

        for(int x : nums){
            minHeap.push(x);
        }
        vector<int>result(n);
        
        for(int i=0 ;i<n;i++){
            result[i] = minHeap.top();
            minHeap.pop();
        }
        return result;
        
    }
};