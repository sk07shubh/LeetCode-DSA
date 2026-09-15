import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i]) && Math.abs(mp.get(nums[i]) - i) <= k){
                return true;
            }
            mp.put(nums[i],i);
        }
        return false;
    }
}