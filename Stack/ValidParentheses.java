package Stack;

import java.util.*;
class ValidParentheses {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(s.size()!=0)
            {
                if(str.charAt(i)==')' && s.peek()=='(')
                {
                    s.pop();
                }
                else if (str.charAt(i)==']' && s.peek()=='[')
                {
                    s.pop();
                }
                else if (str.charAt(i)=='}' && s.peek()=='{')
                {
                    s.pop();
                }
                else
                {
                    s.push(str.charAt(i));
                }
            }
            else
            {
                s.push(str.charAt(i));
            }
        }
        if(s.size()==0)
        {
            return true;
        }
        else
            return false;
    }
}