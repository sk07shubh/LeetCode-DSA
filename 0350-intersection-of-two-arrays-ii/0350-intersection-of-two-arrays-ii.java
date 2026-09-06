class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         int[] seen = new int[1001];

        for(int x : nums1){
            seen[x]++;
        }
        int k = 0;
        int[] ans = new int[nums2.length];
        for(int x : nums2){
            if(seen[x] > 0){
                ans[k++] = x;
                seen[x]--;
            }
        }
        return Arrays.copyOf(ans, k);
    }
}