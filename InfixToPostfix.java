import java.io.*;
public class InfixToPostfix {

public static void main(String [] args)throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=0;

      do{

		  int i,l,p1,p2,j;
        String infix;
        char x=' ',y=' ';


        System.out.println("enter a infix expression");

            infix=br.readLine();
            l=infix.length();

            char postfix[]=new char[l];
    	StackItP ss = new StackItP(l);
		if (ss.count(infix)==0)
		{
			System.out.println(" Invalid expression");
			System.exit(1);

		}

		j=0;

		for(i=0;i<l;i++)
		{
			x=infix.charAt(i);

			if (x!='(' && x!=')' && x!='^' && x!='*' && x!='/' && x!='+' && x!='-')

		     postfix[j++]=x;

		     else if(x=='(')
		      ss.push(x);

		     else if(x==')')
		     {
				 while ( (y=ss.pop()) !='(')

                       postfix[j++]=y;

		  }

			else
			{
				p1=ss.prec(x);
				p2=ss.prec(ss.stacktop());

              if(p1>p2)

			  ss.push(x);

              else
              {
				  while(p2>=p1)
				  {
					  postfix[j++]=ss.pop();

					  p2=ss.prec(ss.stacktop());

				  }

				  ss.push(x);

			  }
		  } // else


	} // for

	while((ss.gettop())!= -1)
	postfix[j++]=ss.pop();



System.out.println( " Infix expression : "+ infix );
System.out.println( " Postfix expression : " );

for(i=0; i< postfix.length;i++)

System.out.print(postfix [i]);

System.out.println();

  System.out.println("enter 0 to continue /n Or enter any other value to exit ");
    n = Integer.parseInt(br.readLine());

   }while(n==0);

}// main

} // class












