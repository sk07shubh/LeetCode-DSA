class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];

        int totSum = 0;
        for(int x : nums){
            totSum += x;
        }
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
       

        int j = 0;
        for(int q : queries){
            int maxLen = 0;

            int len = 0;
            int sum = totSum;
            
            int idx = n-1;
            int a = 0;
            int b = n-1;
            while(a<=b){
                int mid = a + (b-a)/2;
                if(prefix[mid] <= q ){
                    a = mid+1;
                }else{
                    b = mid-1;
                }

            }
            maxLen = Math.max(maxLen,b+1);
            ans[j++] = maxLen;
        }
        return ans;
    }
}