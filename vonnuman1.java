import java.io.*;

 public class vonnuman1
   {

     static String str="";
	  static void von(int n)
	   {
		   for(int i=0;i<=n; i++)
		   {
			   if(i<=1)
			   str="{}";
			   else
			   str=str+",{"+str+"}";

			}

	 System.out.println("{"+str+"}");




     }



 public static void main(String[] args)throws IOException
 {

	 BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));

	 System.out.println("enter a no.. ");
	         int n= Integer.parseInt(dd.readLine());
         von(n);


	  }


  }
