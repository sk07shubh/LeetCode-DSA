import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int n = nums.size();

        Map<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        int distinct = 0;

        // First window
        for(int i = 0; i < k; i++){
            int x = nums.get(i);

            sum += x;

            if(!map.containsKey(x)){
                distinct++;
            }

            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        long maxSum = 0;

        if(distinct >= m){
            maxSum = sum;
        }

        // Sliding window
        for(int i = k; i < n; i++){

            // Add new element
            int add = nums.get(i);
            sum += add;

            if(!map.containsKey(add)){
                distinct++;
            }

            map.put(add, map.getOrDefault(add, 0) + 1);

            // Remove old element
            int remove = nums.get(i - k);
            sum -= remove;

            map.put(remove, map.get(remove) - 1);

            if(map.get(remove) == 0){
                map.remove(remove);
                distinct--;
            }

            if(distinct >= m){
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}