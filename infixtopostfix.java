/*
 Write a program to accept a infix
expression and convert it into postfix.
Input:
Enter the infix Expression
(a+ b)/( c*d )
Output:
The Original Expression is
(a+ b)/( c*d )
The PostFix Expression is
ab+cd* / 

Algo
Step1 : Declare the required variable v for operators stored according to their precedence values,
		str is for infix expression, result is for postfix expression stack[] is for stack[],
		top is for the element at top of the stack and ch is for current scanned symbol
Step2 :	Take input for the infix expression in str
Step3 :	start a loop from 0 to str.length()-1 and repeat through step 9
Step4 :	store the current scanned symbol in ch at index no i
Step5 :	if ch contains '(' then push it into the stack go to step 4 otherwise go to step6
Step6 : if ch contains ')' then go to step 7 otherwise go to 8
Step7 : start a while loop and pop out all the symbols which are present at the top of the stack and attach all these to
		the postfix string till '(' is not encountered
Step8 :	if the current scanned symbol is an operand attach it to the postfix string go to step 4 otherwise go to step 9
Step9 : if the current scanned symbol is an operator then perform the following
		a)start a while loop and pop out all the symbols which are having more precedence than the current scanned operator
		and attach all these in the postfix string
		b)push the current scanned symbol into the stack
Step10 :
		a)Print the Infix expression
		b)Print the postfix expression
Step11: End
*/
import java.io.*;
class infixtopostfix
{
	public static void main(String args[])throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String v = "-+*/^";
		 String str="",result="";
		 char stack[];int top=-1;
		 System.out.println("Enter the infix expression");
		 str = br.readLine();
		 str = "("+str+")";
		 stack = new char[str.length()];

		 for(int i=0;i<=str.length()-1;i++)
		 {
			 char ch = str.charAt(i);

			 if(ch == '(')
			 stack[++top] = ch;
			 else if(ch == ')')
			 {
					while((ch = stack[top--]) != '(')
					result = result + ch;
			 }
			 else if(v.indexOf(ch)==-1)
			 {
				 result = result + ch;
			 }
			 else
			 {
				 	while((v.indexOf(stack[top]) > v.indexOf(ch)))
				 	result = result + stack[top--];
				 	stack[++top] = ch;
			 }

		 }

		 System.out.println("The Original expression is "+str);
		 System.out.println("The Postfix expression is "+result);

	}
}