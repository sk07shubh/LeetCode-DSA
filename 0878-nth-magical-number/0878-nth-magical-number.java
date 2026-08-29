class Solution { 
    public long gcd(int a , int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

    public int nthMagicalNumber(int n, int a, int b) {
        long left = 1;
        long right = (long)n * a * b;
        long ans = 0;
        int mod = 1_000_000_007;
        long LCM = a/gcd(a,b) * b;
        while(left <= right){
            long mid = left + (right - left) /2;
            long aDivNums = mid / a;
            long bDivNums = mid / b;
            long abDivNums = mid /LCM ;
            long totalNums = aDivNums + bDivNums - abDivNums;
            if(totalNums >= n){
                ans = mid;
                right = mid - 1;
            }
            else 
                left = mid + 1;
        }
        return (int)(ans % mod) ;
    }
}
    