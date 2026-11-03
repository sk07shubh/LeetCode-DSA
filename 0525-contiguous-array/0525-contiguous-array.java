class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxLen = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            sum += nums[i] == 1 ? 1 : -1;
            if(mp.containsKey(sum)){
                maxLen = Math.max(maxLen,i - mp.get(sum));
            }else{
                mp.put(sum,i);
            }

        }
        return maxLen;
    }
}