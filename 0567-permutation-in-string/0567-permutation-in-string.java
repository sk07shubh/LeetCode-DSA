import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        Map<Character,Integer> mp = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(s1.charAt(i),mp.getOrDefault(s1.charAt(i),0) + 1);
        }

        int a = 0;
        int b = 0;
        while(b<m){
            window.put(s2.charAt(b),window.getOrDefault(s2.charAt(b),0)+1);
            if(b-a+1 > n){
                if(window.get(s2.charAt(a)) ==1){
                     window.remove(s2.charAt(a));
                }else{
                    window.put(s2.charAt(a),window.get(s2.charAt(a)) - 1);
                }
                a++;
            }
            if(window.equals(mp)){
                return true;
            }
            b++;
        }
        return false;
    }
}