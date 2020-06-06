import java.io.*;
public class CircularPat {

	public static void main(String [] args)throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the odd no");

		int n=Integer.parseInt(br.readLine());

		int ar[][]=new int[n][n];
		int  k=1,i,j;
		for(int t=0;t<=(n/2);t++)
		{
			i=n/2;j=t;
		 for(int a=1;a<=((n/2)-t+1);a++)   ar[i--][j++]=k++;  i+=2;
		 for(int a=1;a<=((n/2)-t);a++)     ar[i++][j++]=k++;  j-=2;
		 for(int a=1;a<=((n/2)-t);a++)     ar[i++][j--]=k++;  i-=2;
		 for(int a=1;a<=((n/2)-t-1);a++)   ar[i--][j--]=k++;
	    }

	    for (i=0;i<n;i++)
	    {
		 for (j=0;j<n;j++)
		 {
			 if (ar[i][j]>0) System.out.print(ar[i][j]+"\t");
			 else      System.out.print("\t");
		 }             System.out.println();
	    }
	}
}