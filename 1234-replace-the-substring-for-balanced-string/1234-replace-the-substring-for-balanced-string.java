class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int target = n / 4;

        int q = 0, w = 0, e = 0, r = 0;

        for(char c : s.toCharArray()){
            if(c == 'Q') q++;
            else if(c == 'W') w++;
            else if(c == 'E') e++;
            else r++;
        }

        if(q == target && w == target && e == target && r == target){
            return 0;
        }

        int a = 0;
        int minLen = n;

        for(int b = 0; b < n; b++){

            if(s.charAt(b) == 'Q') q--;
            else if(s.charAt(b) == 'W') w--;
            else if(s.charAt(b) == 'E') e--;
            else r--;

            while(q <= target &&
                  w <= target &&
                  e <= target &&
                  r <= target){

                minLen = Math.min(minLen, b - a + 1);

                if(s.charAt(a) == 'Q') q++;
                else if(s.charAt(a) == 'W') w++;
                else if(s.charAt(a) == 'E') e++;
                else r++;

                a++;
            }
        }

        return minLen;
    }
}