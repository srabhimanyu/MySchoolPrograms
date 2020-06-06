import java.io.*;

 public class Trial1
  {  static int c=0,n1;
	 static void part( int n,int m,String p,int z)
	   {
		   if (n==0 && z==n1)  c++;

		   	 for(int i=(int)Math.min(n,m);i>=1;i--)

	              part(n-i,i,p+""+i,z+1);

		}

 public static void main(String[] args)throws IOException
 {
	 BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" INPUT ");
        int n= Integer.parseInt(dd.readLine());
            n1= Integer.parseInt(dd.readLine());
           part(n,n,"",0);
        System.out.println(" OUTPUT ");
        System.out.println(c);
 }
}