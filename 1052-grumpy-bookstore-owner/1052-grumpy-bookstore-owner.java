class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;

        int alreadySatisfied = 0;

        // Customers who are already satisfied
        for(int i = 0; i < n; i++){
            if(grumpy[i] == 0){
                alreadySatisfied += customers[i];
            }
        }

        // First window: extra customers we can save
        int sum = 0;

        for(int i = 0; i < minutes; i++){
            if(grumpy[i] == 1){
                sum += customers[i];
            }
        }

        int maxSum = sum;

        // Sliding window
        for(int i = minutes; i < n; i++){

            if(grumpy[i] == 1){
                sum += customers[i];
            }

            if(grumpy[i - minutes] == 1){
                sum -= customers[i - minutes];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return alreadySatisfied + maxSum;
    }
}