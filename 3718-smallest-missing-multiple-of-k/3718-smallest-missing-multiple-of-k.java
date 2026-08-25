import java.util.HashSet;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set1 = new HashSet<>();

        for(int x : nums){
            if(x % k == 0){
                set1.add(x);
            }
        }        
        int i = 1;
        int mul = k;
        while(set1.contains(mul)){
            mul = k * i;
            i++;
        }
        return mul;
    }
}