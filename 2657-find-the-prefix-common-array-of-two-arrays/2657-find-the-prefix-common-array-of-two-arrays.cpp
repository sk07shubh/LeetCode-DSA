class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        int n = A.size();
        unordered_set<int> SetA;
        unordered_set<int> SetB;

        int count = 0;
        vector<int> C;

        for(int i=0; i<n; i++){
            
            SetA.insert(A[i]);
            SetB.insert(B[i]);

            if(A[i] == B[i]){
                count++;
            }else{
                if(SetA.count(B[i])) count++;
                if(SetB.count(A[i])) count++;  
            }
            C.push_back(count);        
        }
        return C;

        
        
    }
};