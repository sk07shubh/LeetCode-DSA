import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int seqSum = nums[0];
        int i;
        for(i=1;i<n;i++){
            if(nums[i] == nums[i-1] + 1){
                seqSum += nums[i];
            }else{
                break;
            }
        }

        Set<Integer> st = new HashSet<>();
        for(int x : nums){
            st.add(x);
        }


        while(st.contains(seqSum)){
            seqSum++;
        }
        return seqSum;

        
        
    }
}