import java.io.*;
public class InfToPos {

public static void main(String [] args)throws Exception
	{
		String opr="-+*/^";
		char stack[];
		int s=0,top=-1;
		String expr="",rexpr="";

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          int count=0;

        System.out.println("enter a infix expression");
        expr="("+br.readLine()+")";
        s=expr.length();
        stack=new char[s];

        for(int i=0; i<expr.length(); i++)
        {
			char ch=expr.charAt(i);
			char ch1=' ';
			if(ch=='(')
			stack[++top]=ch;
			else if (ch==')')
			{
				while(true)
				{
					ch1=stack[top--];
					if(ch1=='(')
					break;
					rexpr=rexpr+ch1;
					count+=1;
				}
			}

			else if(opr.indexOf(ch1)==-1)
			 rexpr=rexpr+ch;

			else{
				while(opr.indexOf(stack[top])>=opr.indexOf(ch))
					rexpr=rexpr+stack[top--];

					stack[++top]=ch;
				}


		}

		System.out.println("The original is  "+expr);
        System.out.println("The resultant is  "+rexpr);



	}


}

