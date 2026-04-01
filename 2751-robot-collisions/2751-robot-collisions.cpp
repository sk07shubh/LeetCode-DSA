class Solution {
public:
    vector<int> survivedRobotsHealths(vector<int>& positions, vector<int>& healths, string directions) {
        int n = positions.size();

        vector<int> ActIdx(n);
        for(int i=0; i<n; i++){
            ActIdx[i] = i; 
        }

        sort(begin(ActIdx),end(ActIdx), [&] (int &i, int &j){
            return positions[i] < positions[j];
        });

        vector<int> result;
        stack<int> st;

        for(int Idx : ActIdx){
            if(directions[Idx] == 'R'){
                st.push(Idx);
            }else{
                while(!st.empty() && healths[Idx] > 0){
                    int topIdx = st.top();
                    st.pop();
                    
                    if(healths[Idx] < healths[topIdx]){
                        healths[Idx] = 0;
                        healths[topIdx]--;
                        st.push(topIdx);
                    }else if(healths[topIdx] < healths[Idx]){
                        healths[topIdx] = 0;
                        healths[Idx]--;
                    }else{
                        healths[topIdx] = 0;
                        healths[Idx] = 0;
                    }
                }
            }

        }
        for(int i=0; i<n; i++){
            if(healths[i] > 0){
                result.push_back(healths[i]);
            }
        }
        return result;
    }
};