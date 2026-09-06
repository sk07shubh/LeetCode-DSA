class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] seen = new int[1001];

        for(int x : nums1){
            seen[x] = 1;
        }
        int k = 0;
        int[] ans = new int[nums2.length];
        for(int x : nums2){
            if(seen[x] == 1){
                ans[k++] = x;
                seen[x] = 0;
            }
        }
        return Arrays.copyOf(ans, k);
    }
}