class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        int n = nums.size();

        priority_queue<int> maxheap;

        for(int x : nums){
            maxheap.push(x);
        }
        for(int i=0 ; i<k-1 ; i++){
            maxheap.pop();
        }
        return maxheap.top();
        
    }
};