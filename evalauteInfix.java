/*
 Write a program to input any infix
expression and evaluate it.
Enter the infix expression
(a* b)/( b*c )+e
The Infix expression is
((a* b)/ (b* c)+e )
The Postfix String is ab*bc* /e+
Enter the value of a
100
Enter the value of b
10Enter the value of b
10Enter the value of c
10Enter the value of e
10The Result is 20.0
 
Algo
Step1 : Declare the required variable v for operators stored according to their precedence values,
		str is for infix expression, result is for postfix expression stack[] is for stack[],
		Stack1[] for storing the values of the operands,top is for the element at top of
		the stack and ch is for current scanned symbol,op1 is for the first operand, op2 is for
		the second operand and R is for the result.
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
Step11: recieve -1 in top
Step12: start a loop i from 0 to result.length() -1 and repeat through step 17
Step13: store the current scanned symbol in ch at index no i
Step14: if ch contains operand. Input its value and push it at Stack1[++top] go to step13 otherwise go to step 15
Step15: pop out two operands op2 first and then op1
Step16: apply operator ch on op2 and op1 and store the result in R
Step17: push the Result R into the Stack1
Step18: Print the Result R
Step19: End
*/
import java.io.*;
class  evalauteInfix
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
		 System.out.println("The Infix expression is "+str);
		 System.out.println("The Postfix String is "+result);
		 top=-1;
		 String stack1[] = new String[str.length()];
		 double op1=0.0,op2=0.0,R=0.0;
		 for(int i=0;i<=result.length()-1;i++)
		 {
			 char ch = result.charAt(i);
			 if(v.indexOf(ch) == -1)
			 {
			 System.out.println("Enter the value of "+ch);
			 stack1[++top] = br.readLine().trim();
		 	 }
		 	 else
		 	 {
				 op2 = Double.parseDouble(stack1[top--]);
				 op1 = Double.parseDouble(stack1[top--]);
				 R = eval(op1,op2,ch);
				 stack1[++top] = R+"";
			 }
		 }
		 System.out.println("The Result is "+R);

	}
	static double eval(double op1,double op2,char ch)
	{
		if(ch == '-')
		return op1 - op2;
		else if(ch == '+')
		return op1 + op2;
		else if(ch == '*')
		return op1 * op2;
		else if(ch == '/')
		return op1 / op2;
		else
		return Math.pow(op1,op2);
	}
}