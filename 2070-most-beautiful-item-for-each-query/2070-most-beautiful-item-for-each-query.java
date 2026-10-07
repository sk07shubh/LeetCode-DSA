class Solution {
    public int[] maximumBeauty(int[][] items,int[] queries) {
        int n = items.length;

        Arrays.sort(items,(a,b) -> Integer.compare(a[0],b[0]));

        int maxBeauty = 0;

        for(int i = 0;i < n;i++){
            maxBeauty = Math.max(maxBeauty,items[i][1]);
            items[i][1] = maxBeauty;
        }

        int[] ans = new int[queries.length];
        int idx = 0;

        for(int q : queries){
            int left = 0;
            int right = n - 1;

            while(left <= right){
                int mid = left + (right - left)/2;

                if(items[mid][0] <= q){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }

            if(right >= 0){
                ans[idx] = items[right][1];
            }

            idx++;
        }

        return ans;
    }
}