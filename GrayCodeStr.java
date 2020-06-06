import java.io.*;
 public class GrayCodeStr
  {
 public static void main(String[] args)throws Exception
 {
	 BufferedReader dd =new BufferedReader(new InputStreamReader(System.in));
     		 int n=Integer.parseInt(dd.readLine());
     		 int a[][]=new int [(int)Math.pow(2,n)][n];

     		 a[1][n-1]=1;

             String s[]=new String[(int)Math.pow(2,n)];

             for(int i=0;i<(int)Math.pow(2,n);i++)
             {
				 s[i]="0";
			 }
             for(int i=0;i<(int)Math.pow(2,n);i++)
             {
             for(int j=0;j<n-1;j++)
             {
				 s[i]+="0";
			 }
			 }

//			 s[1]=s[1].substring(0,(n-2))+'1';



     		 System.out.println();

             int c=n-1,c1;

             for (int i=2;i<Math.pow(2,n);i*=2)
             {
				 c1=1;
//	           System.out.print("i = "+i+"\t");

				 for(int j=i; j<(2*i); j++)
				 {
// 	           System.out.print("j = "+j+"\t");
                     for(int k=c;k<=n-1;k++)
					 {
					 a[j][k]=a[j-c1][k];
					 }
					 a[j][c-1]=1;

					 c1+=2;
				 }
				 c--;

			 }
/*						 System.out.println();
			for(int i=0;i<(int)Math.pow(2,n);i++)
			     		 { System.out.print(i+"\t");
			for(int j=0;j<n;j++)
			     		 {
							 System.out.print(a[i][j]);
						 }
						 System.out.println();}
*/

			for(int i=0;i<(int)Math.pow(2,n);i++)
			     		 {         System.out.print("i = "+i+"\t");

							 System.out.println(s[i]);
					 }

 }
}