class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = 0;
        int[] alt = new int[n+1];
        for(int i=1;i<n+1;i++){
            alt[i] += alt[i-1] + gain[i-1];
            max = Math.max(max,alt[i]);
        }
        return max;
    }
}