
class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;

        long totSum = 0;

        for(int num : nums){
            totSum += num;
        }

        int target = (int)(totSum % p);

        if(target == 0) return 0;

        int preSum = 0;
        int minLen = n;

        Map<Integer, Integer> mp = new HashMap<>();

        mp.put(0, -1);

        for (int i=0;i<n;i++) {

            preSum = (int)(((long)preSum + nums[i]) % p);

            int needed = (preSum - target + p) % p;

            if(mp.containsKey(needed)){

                minLen = Math.min(minLen,i - mp.get(needed) );
            }
            mp.put(preSum, i);
        }

        return minLen == n ? -1 : minLen;
    }
}
