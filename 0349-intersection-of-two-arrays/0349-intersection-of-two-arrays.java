import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();

        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for(int x : nums1){
            st1.add(x);
        }
        
        for(int x : nums2){
            if(st1.contains(x)) st2.add(x);
        }
        int[] intersec = new int[st2.size()];
        int i = 0;
        for(int x : st2){
            intersec[i++] = x;
        }
        return intersec;

        

        



        

    }
}