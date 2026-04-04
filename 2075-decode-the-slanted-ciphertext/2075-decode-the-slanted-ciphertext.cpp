class Solution {
public:
    string decodeCiphertext(string encodedText, int rows) {
        int n = rows;
        int l = encodedText.length();
        int m = l / n;
        string OriginalText = "";
        
        for(int col=0; col<m; col++){
            for(int i=col; i<l; i += (m + 1)){
                OriginalText += encodedText[i];
            }
        }
        while(!OriginalText.empty() && OriginalText.back() == ' '){
            OriginalText.pop_back();
        }
        return OriginalText;


    }
}
;