class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int a=0;
        int b=0;
        int[] ans = new int[n-k+1];
        int idx = 1;

        Deque<Integer> max=new ArrayDeque<>();
        for(b=0;b<k;b++){
            while(!max.isEmpty() && nums[max.peekLast()] < nums[b]){
                max.pollLast();
            }
        max.addLast(b);
        }
        int MAX = nums[max.peekFirst()];
        ans[0] = MAX;
        

        while(b<nums.length){

            while(!max.isEmpty() && nums[max.peekLast()] < nums[b]){
                max.pollLast();
            }
            max.addLast(b);
            
            if(max.peekFirst()==a){
                max.pollFirst();
            }
            MAX = nums[max.peekFirst()];
            ans[idx++] = MAX;
            a++;
            b++;
        }
        return ans;
    }
}