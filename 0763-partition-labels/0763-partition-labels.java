import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        char[] S = s.toCharArray();
        Map<Character,Integer> last = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            last.put(S[i],i);
        }
        int start = 0;
        int end = -1;
        for(int i=0;i<n;i++){
            end = Math.max(end,last.get(S[i]));
            if(i == end){
                ans.add(end - start +1);
                start = end+1;
            }
        }
        return ans;

    }
}