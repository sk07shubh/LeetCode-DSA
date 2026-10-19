class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum = 0;
        long minSum = 0;
        long maxSum = 0;

        for (int diff : differences) {
            sum += diff;
            minSum = Math.min(minSum, sum);
            maxSum = Math.max(maxSum, sum);
        }

        long ans = (upper - (long)lower) - (maxSum - minSum) + 1;

        if (ans < 0) return 0;
        return (int)ans;
    }
}