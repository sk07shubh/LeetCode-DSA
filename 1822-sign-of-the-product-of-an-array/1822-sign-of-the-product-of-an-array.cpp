class Solution {
public:
    int signFunc( int x){
        if(x > 0){
            return 1;
        }else if( x < 0){
            return -1;
        }else{
            return 0;
        }
    }

    int arraySign(vector<int>& nums) {

        int n = nums.size();
        int Product = 1;

        for(int x : nums){
            if(x > 0){
                Product *= 1;
            }else if(x < 0){
                Product *= -1;
            }else{
                Product *= 0;
                break;
            }
        }
        return signFunc(Product);
        
            
    }
};