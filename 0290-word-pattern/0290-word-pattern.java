class Solution {
    public boolean wordPattern(String pattern, String s){
        int p = pattern.length();
        int S = s.length();
        String[] words=s.split(" ");

        if(p != words.length)return false;

        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();

        for(int i=0;i<p ;i++){
            char ch=pattern.charAt(i);
            String word=words[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word))return false;
            }else{
                if(set.contains(word))return false;
                map.put(ch,word);
                set.add(word);
            }
        }

        return true;
    }
}