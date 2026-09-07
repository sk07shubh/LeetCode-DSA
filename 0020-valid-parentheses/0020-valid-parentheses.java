
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;

                if(st.peek() == '(' && ch != ')' || st.peek() == '{' && ch != '}' || st.peek() == '[' && ch != ']'){
                    return false;
                }
                st.pop();
            }
            
            
        }
        return st.isEmpty();
        
    }
}