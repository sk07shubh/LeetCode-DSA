class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r = ransomNote.length();
        int m = magazine.length();
        if(r > m) return false;
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch : ransomNote.toCharArray()){
            if(mp.containsKey(ch)){
                if(mp.get(ch) == 1){
                    mp.remove(ch);
                }else{
                    mp.put(ch,mp.get(ch)-1);
                }
                
            }else{
                return false;
            }
        }
        return true;


    }
}