class Solution {
public:

    bool canShip(vector<int>& weights,int capacity,int days){
        int n = weights.size();
        int load = 0;
        int reqDays = 1;
        for(int i=0 ; i<n ; i++){
            if(load + weights[i] > capacity){
                reqDays++;
                load = weights[i];
            }else{
                load += weights[i];
            }            
        }
        return reqDays <= days;
    }

    int shipWithinDays(vector<int>& weights, int days) {
        int n = weights.size();

        int Max = 0;
        for(int x : weights){
            Max = max(Max,x);
        }
        

        int Sum = 0;
        for(int x : weights){
            Sum += x;
        }

        int left = Max;
        int right = Sum;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(canShip(weights,mid,days)){
                right = mid-1;
            }else{
                left = mid+1;
            }
            

        }
        return left;
        
    }
}; 