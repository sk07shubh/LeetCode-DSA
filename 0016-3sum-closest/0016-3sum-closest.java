class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;;

        Arrays.sort(nums);
        int ans = -1;
        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int a = i + 1;
            int b = nums.length - 1;
            

            while (a < b) {
                int sum = nums[i] + nums[a] + nums[b];
                int diff = Math.abs(sum - target);
                

                if (diff < minDiff){
                    ans = sum;
                    minDiff = Math.min(minDiff,diff);
                }
                if (sum < target) {
                    a++;
                } else if(sum > target){
                    b--;
                }else{
                    return sum;
                }
            }
        }

        return ans;
    
    }
}