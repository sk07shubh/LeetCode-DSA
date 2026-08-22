class Solution {
    public boolean checkDivisibility(int n) {
        int digSum = 0;
        int digPro = 1;
        int num = n;
        while(num!=0){
            digSum += num%10;
            digPro *= num%10;
            num /= 10;
        }
        if(n%(digSum + digPro)== 0) return true;
        else return false;
        
        

    }
}