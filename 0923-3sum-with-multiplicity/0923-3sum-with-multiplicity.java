import java.util.Arrays;

class Solution {
    public int threeSumMulti(int[] arr, int target) {

        Arrays.sort(arr);

        int n = arr.length;
        long count = 0;
        final long MOD = 1_000_000_007;

        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;
            int pairTarget = target - arr[i];

            while (j < k) {

                long sum = arr[j] + arr[k];

                if (sum < pairTarget) {
                    j++;
                }
                else if (sum > pairTarget) {
                    k--;
                }
                else if (arr[j] == arr[k]) {
                    long windowSize = k - j + 1;
                    count += windowSize * (windowSize - 1) / 2;
                    break;
                }
                else {
                    long jCount = 1;
                    long kCount = 1;

                    while (j + 1 < k && arr[j] == arr[j + 1]) {
                        jCount++;
                        j++;
                    }

                    while (k - 1 > j && arr[k] == arr[k - 1]) {
                        kCount++;
                        k--;
                    }

                    count += jCount * kCount;
                    j++;
                    k--;
                }
            }
        }

        return (int) (count % MOD);
    }
}