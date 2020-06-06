import java.io.*;
 public class findcolrow
{
 public static void main(String[] args)throws IOException
 {  BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));

     System.out.println("ENTER THE NO.");
     int n=Integer.parseInt(dd.readLine());
     int col=1,a1=0;
      while( col<=n )
      {
		  a1+=col;
		  if((n-a1+col)%col==0   && ((n-a1+col)/col)>0 && a1>0)
		  {System.out.print(n+" = ("+((n-a1+col)/col)+" , "+col+") \t");
		   System.out.println(" &&  a1  = "+ a1+"\t &&  d  = "+ col);}
	      col++;
	   }
  }
}