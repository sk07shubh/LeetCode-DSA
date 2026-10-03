class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        int[] preSum = new int[n+1];
        Deque<Integer> min = new ArrayDeque<>();
        int idx = 0;
        int b = 0;
        int minLen = n+1;
        int sum = 0;
        while(b <= n){
            
            if(b>0) preSum[b] = preSum[b-1]+nums[b-1];
            
            while(!min.isEmpty() && preSum[min.peekLast()] > preSum[b]){
                min.pollLast();
            }
            min.addLast(b);
            while(!min.isEmpty() && preSum[b] - preSum[min.peekFirst()] >= k){
                minLen = Math.min(minLen,b - min.peekFirst());
                min.pollFirst();
            }
            b++;
        }
         return minLen == n+1 ? -1 : minLen;
    }
}