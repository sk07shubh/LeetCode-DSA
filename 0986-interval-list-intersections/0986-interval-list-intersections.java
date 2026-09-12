import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        List<int[]> ans = new ArrayList<>();

        int a = 0;
        int b = 0;

        while (a < firstList.length && b < secondList.length) {

            int start = Math.max(firstList[a][0], secondList[b][0]);
            int end = Math.min(firstList[a][1], secondList[b][1]);

            if (start <= end) {
                ans.add(new int[]{start, end});
            }

            if (firstList[a][1] < secondList[b][1]) {
                a++;
            } else {
                b++;
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}