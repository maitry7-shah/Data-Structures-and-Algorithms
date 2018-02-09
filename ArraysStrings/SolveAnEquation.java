package ArraysStrings;

import java.util.Stack;

public class SolveAnEquation {
	public static int solution(String input) {
		int result=0;
		int op1=0;int op2=0;

		Stack<Character> s=new Stack<Character>();
		char[] a=input.toCharArray();
		result=a[0]-'0';
		for(int i=1;i<a.length;i++) {
			if(a[i]=='+' || a[i]=='-'|| a[i]=='/'  || a[i]=='*'){
				s.push(a[i]);
			}
			else
			{
				op1=a[i]-'0';

			if(!s.isEmpty()) {
				Character op=s.pop();
				if(op=='-') result=result-op1;
				else if(op=='+') result=result+op1;
				else if(op=='*') result=result*op1;
				else if(op=='/') result=result/op1;
			}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String a="5*4+6-9*3";
		System.out.println(solution(a));
	}
}
