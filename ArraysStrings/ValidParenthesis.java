package ArraysStrings;

import java.util.Stack;

public class ValidParenthesis {
	public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        
        for(Character c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                
                if(c==']')
                {
                    if(!stack.isEmpty() && stack.peek()=='['){
                        stack.pop();
                    }
                    else
                        return false;
                }
                
                 if(c=='}')
                {
                    if(!stack.isEmpty() && stack.peek()=='{'){
                        stack.pop();
                    }
                    else
                        return false;
                }
                
                 if(c==')')
                {
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }
                    else
                        return false;
                }
                
            }     
    }
        return stack.isEmpty();
}
	
	public static void main(String[] args) {
		String s="[";
		ValidParenthesis v=new ValidParenthesis();
		v.isValid(s);
	}
}
