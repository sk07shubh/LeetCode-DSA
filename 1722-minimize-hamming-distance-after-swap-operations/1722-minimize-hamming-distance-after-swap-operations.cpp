class Solution {
public:
    vector<int> parent;

    int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    void unite(int a, int b){
        parent[find(a)] = find(b);
    }

    int minimumHammingDistance(vector<int>& source, vector<int>& target, vector<vector<int>>& swaps) {
        int n = source.size();
        parent.resize(n);

        for(int i = 0; i < n; i++) parent[i] = i;

        // make groups
        for(auto &e : swaps)
            unite(e[0], e[1]);

        // group elements
        unordered_map<int, multiset<int>> groups;

        for(int i = 0; i < n; i++)
            groups[find(i)].insert(source[i]);

        int ans = 0;

        for(int i = 0; i < n; i++){
            int root = find(i);

            if(groups[root].count(target[i])){
                groups[root].erase(groups[root].find(target[i]));
            } else {
                ans++;
            }
        }

        return ans;
    }
};