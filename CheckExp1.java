import java.io.*;
public class CheckExp1 {

public static void main(String [] args)throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      int n=0;

      do{

        int l,f=1;
        String s;
        char x=' ',y=' ';


        System.out.println("enter an expression");

            s=br.readLine();
            l=s.length();

    	Stack1 ss = new Stack1(l);
		// starting push operation
		for(int i=0;i<l;i++)

		{
			x=s.charAt(i);

			if(x=='[' || x=='{' || x=='(')

			ss.push(x);

			else if (x==']' || x=='}' || x==')')

          { y=ss.pop();

           if((y=='[' && x==']' ) ||( y=='{' && x=='}') || ( y=='(' && x==')'))

           continue ;

           else{
			   f=0;
			   break;
		   }
			}
	   }

       if (ss.gettop()!=-1 || f==0)

    System.out.println(" Invalid expression");

   else
    System.out.println(" Valid expression");


  System.out.println("enter 0 to continue /n Or enter any other value to exit ");
    n = Integer.parseInt(br.readLine());

   }while(n==0);

}

}
