class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> st = new HashSet<>();
        int count = 0;
        for(char ch : jewels.toCharArray()){
            st.add(ch);
        }
        for(char ch : stones.toCharArray()){
            if(st.contains(ch)){
                count++;
            }
        }
        return count;
    }
}