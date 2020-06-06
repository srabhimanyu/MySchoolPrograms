import java.io.*;
public class CheckExp {


 	char a[];
   int top,size;

	   CheckExp(int N)
	    {
	         top=-1;
	         size=N;
	         a = new char[size];
	    }
	   void push(char c)
	    {
	         if(top == size-1)
	         {
	         System.out.println("Over flow");
	         return;
	         }
	        else
	         a[++top]=c;
	    }
	   char pop()
	    {
	         if(top == -1)
	         {
				 System.out.println("Underflow");
	               return (' ');
	         }
	         else
	         return a[top--];
	    }


	    int gettop()
	    {
			return (top);

	    }




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

    	CheckExp ss = new CheckExp(l);
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

