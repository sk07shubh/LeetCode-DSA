class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] Blocks = blocks.toCharArray();
        int n  =Blocks.length;
        int Wcount = 0;
        for(int i =0 ; i < k ; i++){
            if(Blocks[i] == 'W'){
                Wcount++;
            }
        }
        int minW = Wcount;
        int left = 0;
        int right = k-1;

        while(right < n-1){

            if(Blocks[++right] == 'W'){
                Wcount++;
            }
            if(Blocks[left++] == 'W'){
                Wcount--;
            }
            minW = Math.min(minW,Wcount);
        }
        
        return minW;
    }
}