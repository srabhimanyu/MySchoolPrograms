import java.io.*;


 public class vertiprntng
 {
 public static void main(String[] args)throws IOException
 {

	 BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));


	 System.out.println("enter a string");

         String s=ob.readLine();
          String a[]= s.split(" ");
          int n= a.length;
          int m=0;

          for(int i=0;i<n;i++)

           {
			   if(a[i].length()> m)

			  m= a[i].length();    }

	for(int i=0;i<m;i++)

           {
			  for(int j=0;j<n;j++)

           {              if(   i>= a[j].length()   )

			  	 System.out.print("    ");

			  	 else
			  	      System.out.print(a[j].charAt(i)+"   ");

				  }

				 System.out.println();

			 }


                      }
}