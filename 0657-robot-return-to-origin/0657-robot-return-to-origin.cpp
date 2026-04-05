class Solution {
public:
    bool judgeCircle(string moves) {
        int n = moves.length();
        int x = 0;
        int y = 0;

        for(int move : moves){
            if(move == 'L') x--;
            if(move == 'R') x++;
            if(move == 'U') y++;
            if(move == 'D') y--;

        }
        return x == 0 && y == 0;


        
    }
};