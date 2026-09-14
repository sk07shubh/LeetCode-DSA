class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if(k == 0){
            return result;
        }
        int i = -1;
        int j = -1;
        if(k < 0){
            i = n - Math.abs(k);
            j = n - 1;
        }else{
            i = 1;
            j = k;
        }
        int winSum = 0;
        for(int idx=i;idx<=j;idx++){
            winSum += code[idx];
        }
        for(int idx=0;idx<n;idx++){
            result[idx] = winSum;

            winSum -= code[i%n];
            winSum += code[(j+1)%n];
            i++;
            j++;
        }
        return result;
    }
}