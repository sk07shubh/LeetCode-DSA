class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;

            int count = 0;
            int row = 0;
            int col = m - 1;

            // Count elements <= mid
            while(row < n && col >= 0){
                if(matrix[row][col] <= mid){
                    count += col + 1;
                    row++;
                }else{
                    col--;
                }
            }

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}