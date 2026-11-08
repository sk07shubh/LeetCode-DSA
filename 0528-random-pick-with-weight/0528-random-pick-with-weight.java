class Solution {
    int[] prefix;
    int total;

    public Solution(int[] w){
        prefix = new int[w.length];
        int sum = 0;
        for(int i=0;i<w.length;i++){
            sum += w[i];
            prefix[i] = sum;
        }
        total = sum;
    }

    public int pickIndex(){
        int target = (int)(Math.random()*total)+1;

        int l = 0,r = prefix.length-1;
        while(l < r){
            int mid = l+(r-l)/2;

            if(prefix[mid] >= target){
                r = mid;
            }else{
                l = mid+1;
            }
        }

        return l;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */