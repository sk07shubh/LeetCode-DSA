import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        int[] last = new int[26];

        for(int i=0;i<n;i++){
            last[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = -1;

        for(int i=0;i<n;i++){
            end = Math.max(end,last[s.charAt(i) - 'a']);
            if(i == end){
                ans.add(end - start +1);
                start = end+1;
            }
        }
        return ans;

    }
}