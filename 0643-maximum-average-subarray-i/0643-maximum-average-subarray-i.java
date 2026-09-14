class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int a = 0;
        int b = k-1;
        double maxAvg = Double.NEGATIVE_INFINITY;
        int preSum = 0;
        for(int i=0;i<n;i++){
            preSum += nums[i];
            nums[i] = preSum;

        }

        while(b < n){
            int sum = -1;
            if(a == 0){
                sum = nums[b];
            }else{
                sum = nums[b] - nums[a-1];
            }
            double avg = (double)sum/k;
            maxAvg = Math.max(maxAvg,avg);
            a++;
            b++;
        }
        return maxAvg;
    }
}