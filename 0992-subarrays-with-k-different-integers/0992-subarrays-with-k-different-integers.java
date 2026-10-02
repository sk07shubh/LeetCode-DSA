class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return lessthan(nums,k) - lessthan(nums,k-1);
    }
    private int lessthan(int[] nums,int k){
        if(k == 0) return 0;
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>(); 
        int a = 0;
        int b = 0;
        int count = 0;

        while(b<n){
            mp.put(nums[b],mp.getOrDefault(nums[b],0) + 1);

            while(mp.size() > k){
                if(mp.get(nums[a]) == 1){
                    mp.remove(nums[a]);
                }else{
                    mp.put(nums[a],mp.get(nums[a])- 1);
                }
                a++;
            }
            count += b - a + 1;
            b++;
        }
        return count;
    }
}