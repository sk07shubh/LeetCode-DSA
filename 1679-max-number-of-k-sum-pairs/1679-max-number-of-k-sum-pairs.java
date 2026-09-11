import java.util.HashMap;
import java.util.Map;
class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int opr = 0;

        for(int x : nums){

            int need = k - x;
            if(mp.getOrDefault(need,0) > 0){
                mp.put(need,(mp.get(need))-1);
                opr++;
            }else{
                mp.put(x,(mp.getOrDefault(x,0))+1);
            }
        }
        

        return opr;
    }
}