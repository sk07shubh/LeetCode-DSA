import java.lang.Math;
class Solution {
    public int BnrySearch(int[] nums,int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int result = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] < target){
                left = mid+1;
            }else{
                result = mid;
                right = mid-1;
            }
        }
        return left;
    }
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int firstPosIdx = BnrySearch(nums,1);
        int firstZeroIdx = BnrySearch(nums,0); 

        return Math.max(firstZeroIdx , n - firstPosIdx);
        
    }
}