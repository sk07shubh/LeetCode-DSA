import java.util.HashMap;
import java.util.Map;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        int b = 0;
        int ansCount = 0;
        int sum =0;

        while(b<n){
            sum += nums[b];
            if(preSum.containsKey(sum - k)){
                ansCount += preSum.get(sum - k);
            }
            preSum.put(sum,preSum.getOrDefault(sum,0) + 1);
            b++;
        }
        
        return ansCount;
    }
}