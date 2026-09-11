import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            int need = target - nums[i];
            if(mp.containsKey(need)){
                return new int[] {mp.get(need),i};
            }else{
                mp.put(nums[i],i);
            }
        }
        return new int[]{};
        
    }
}