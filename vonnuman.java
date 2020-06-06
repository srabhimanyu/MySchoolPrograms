import java.io.*;

 public class vonnuman
   {

	   String von(int n)
	   {
		   if(n==0)
		   return "{}";

		   else if(n==1)
		   return "{{}}";

		   String one = von(n-1);

		   return (one.substring(0, one.length()-1)+","+one+"}" );


  }
 public static void main(String[] args)throws IOException
 {

	 BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));

	 System.out.println("enter a no.. ");
	         int n= Integer.parseInt(dd.readLine());
         System.out.println(new vonnuman().von(n));


	  }


  }
