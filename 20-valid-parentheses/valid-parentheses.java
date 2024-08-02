import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> paranthesis = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c == '(' || c == '{' || c == '['){
                paranthesis.push(c);
            } else if(c == ')' && !paranthesis.isEmpty() && paranthesis.peek() == '('){
                paranthesis.pop();

            } else if(c == '}' && !paranthesis.isEmpty() && paranthesis.peek() == '{'){
                paranthesis.pop();

            } else if(c == ']' && !paranthesis.isEmpty() && paranthesis.peek() == '['){
                paranthesis.pop();

            } else{
                return false;
            }
        }
        return paranthesis.isEmpty();
    }
}