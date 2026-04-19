class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        int n = pushed.size();

        stack<int> st;
        int idx = 0;

        for(int i=0; i<n; i++){
            st.push(pushed[i]);
            while(!st.empty() && st.top() == popped[idx]){
                st.pop();
                idx++;
            }

        }
        if(st.empty()) return true;
        else return false;
    }
};