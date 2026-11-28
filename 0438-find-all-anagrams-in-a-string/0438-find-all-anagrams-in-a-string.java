import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();

        Map<Character, Integer> mp = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        List<Integer> ans = new ArrayList<>();

        for (char c : p.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int a = 0;
        int b = 0;

        while (b < n) {
            char c = s.charAt(b);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (b - a + 1 > m) {
                char remove = s.charAt(a);
                window.put(remove, window.get(remove) - 1);

                if (window.get(remove) == 0) {
                    window.remove(remove);
                }

                a++;
            }

            if (b - a + 1 == m && window.equals(mp)) {
                ans.add(a);
            }

            b++;
        }

        return ans;
    }
}