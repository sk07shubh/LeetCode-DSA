class Solution {
public:
    int n;
    bool DFS(vector<int>& arr, int i){
        
        if( i < 0 || i >= n || arr[i] < 0) return false;
        if(arr[i] == 0) return true;
        
        int jump = arr[i];
        arr[i] *= -1;

        bool a = DFS(arr , i + jump);
        bool b = DFS(arr , i - jump);

        return a || b;
    }
    bool canReach(vector<int>& arr, int start) {
        n = arr.size();

        return DFS(arr , start );        
    }
};