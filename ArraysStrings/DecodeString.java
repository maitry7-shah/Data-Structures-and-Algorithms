package ArraysStrings;

import java.util.Stack;

public class DecodeString {
	public String decodeString(String s) {
		Stack<Character> stack=new Stack<Character>();
		StringBuilder sb=new StringBuilder();
		StringBuilder sbCount=new StringBuilder();
		StringBuilder result = new StringBuilder();
		
		for(Character c:s.toCharArray()){
			if(c==']')
			{
				while(!stack.isEmpty()){
					char temp=stack.pop();
					if(temp!='[')
					{
						sb.append(temp);
						continue;
					}

					while(!stack.isEmpty() && stack.peek()!='[' && stack.peek()-'0'>=0 && stack.peek()-'0'<=9)
						sbCount.append(stack.pop()-'0');

					break;
				}

				sb.reverse();
				int count=Integer.parseInt(sbCount.reverse().toString());
				sbCount=new StringBuilder();
				while(count>0){
					result.append(sb);
					count--; 
				}

				if(stack.isEmpty())
					sb=new StringBuilder();
				else
				{
					sb=new StringBuilder(result);	
					result=new StringBuilder();
				}
			}
			else
				stack.push(c);
		}
		sb=new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());

		}
		result.append(sb.reverse());
		return result.toString();
	}

	public static void main(String[] args) {
		String s="sd2[f2[e]g]i";
		DecodeString d=new DecodeString();
		System.out.println(d.decodeString(s));
	}
}
