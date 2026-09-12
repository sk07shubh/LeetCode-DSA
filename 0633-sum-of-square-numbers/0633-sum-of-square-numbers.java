class Solution {
    public boolean judgeSquareSum(int c) {

        int a = 0;
        int b = (int) Math.sqrt(c);
        
        while(a<=b){
            long SQsum = (long)a*a + (long)b*b;
            if(SQsum == c){
                return true;
            }else if(SQsum < c){
                a++;
            }else{
                b--;
            }
        }
        return false;
    }
}