class Solution {
    int MOD = (int) 1e9 + 7;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int subSeq = 0;

        long[] pow = new long[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }
        int a = 0 , b = n-1;
        while(a<=b){
            if(nums[a] + nums[b] <= target){
                subSeq = (int)((subSeq + pow[b-a]) % MOD); 
                a++;
            }else{
                b--;
            }
        }
        return subSeq%MOD;
    }
}