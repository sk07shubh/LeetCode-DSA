class Solution {
public:
    void rotate(vector<int>& nums, int k) {
         k = k % nums.size();

    int start = 0, end = nums.size() - 1;
    int temp;

    while(start < end){
        temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        start++;
        end--;
    }
    int first = 0, last = k -1;
    while(first < last){
        temp = nums[first];
        nums[first]= nums[last];
        nums[last]= temp;

        first++;
        last--;

    }
    int left = k, right = nums.size() -1;
    while (left<right){
        temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
    }
        
    }
};