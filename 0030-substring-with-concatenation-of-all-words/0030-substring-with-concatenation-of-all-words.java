class Solution {
    public List<Integer> findSubstring(String s,String[] words) {
        int n = s.length();
        int wordLen = words[0].length();
        int totalWords = words.length;

        Map<String,Integer> wordMap = new HashMap<>();
        for(String word : words){
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }

        List<Integer> ans = new ArrayList<>();

        for(int start=0;start<wordLen;start++){
            int a = start;
            int b = start;
            int count = 0;
            Map<String,Integer> winMap = new HashMap<>();

            while(b + wordLen <= n){
                String word=s.substring(b,b + wordLen);
                b += wordLen;

                if(!wordMap.containsKey(word)){
                    winMap.clear();
                    count = 0;
                    a = b;
                    continue;
                }

                winMap.put(word,winMap.getOrDefault(word,0)+1);
                count++;

                while(winMap.get(word)>wordMap.get(word)){
                    String leftWord=s.substring(a,a+wordLen);
                    winMap.put(leftWord,winMap.get(leftWord)-1);
                    a += wordLen;
                    count--;
                }

                if(count==totalWords){
                    ans.add(a);

                    String leftWord=s.substring(a,a+wordLen);
                    winMap.put(leftWord,winMap.get(leftWord)-1);
                    a += wordLen;
                    count--;
                }
            }
        }

        return ans;
    }
}