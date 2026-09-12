class Solution {

    public boolean ispalindrome(int i, int j, String s)
    {
        while(i <j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }

            i+=1;
            j-=1;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j)
        {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if(left != right)
            {
                return ispalindrome(i+1 , j ,s) || ispalindrome(i,j-1,s);
            }
            else
            {
                i+=1;
                j-=1;
            }
        }

        return true;
    }
}