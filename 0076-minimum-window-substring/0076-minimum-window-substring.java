class Solution {
    public String minWindow(String s, String t) {
        int S = s.length();
        int T = t.length();

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        int tCount = 0;
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int r = 0;
        int minLen = S + 1;
        String ans = "";

        while (r < S) {

            if (sMap.getOrDefault(s.charAt(r), 0) < tMap.getOrDefault(s.charAt(r), 0)) {
                tCount++;
            }

            if (tMap.containsKey(s.charAt(r))) {
                sMap.put(s.charAt(r), sMap.getOrDefault(s.charAt(r), 0) + 1);
            }
            while (tCount == T) {
                if (r - l + 1 < minLen) {
                    ans = s.substring(l, r + 1);
                    minLen = r - l + 1;
                }

                if (tMap.containsKey(s.charAt(l))) {
                    sMap.put(s.charAt(l), sMap.get(s.charAt(l)) - 1);

                    if (sMap.get(s.charAt(l)) < tMap.get(s.charAt(l))) {
                        tCount--;
                    }

                    if (sMap.get(s.charAt(l)) == 0) {
                        sMap.remove(s.charAt(l));
                    }
                }

                l++;
            }
            r++;
        }
        return ans;
    }
}