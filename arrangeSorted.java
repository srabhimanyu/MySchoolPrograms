/*
 Write a program to arrange the
elements of the integer array in order
during
the insertion time only.(class X and XII
both) 
*/
import java.io.*;
class arrangeSorted
{
	static int a[],size;	
	public arrangeSorted(int N)
	{
		size = N;
		a = new int[size];
	}
	void insert(int N,int j)
	{
		int k=j-1;
		while(k>=0)
		{
			if(a[k] > N)
			a[k+1] = a[k];
			else
			break;
			k = k - 1;
		}
		a[k+1] = N;
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 0;
		System.out.println("Enter the size of the array");
		N = Integer.parseInt(br.readLine());
		arrangeSorted obj = new arrangeSorted(N);
		System.out.println("Enter array elements");
		for(int i=0;i<=size-1;i++)
		{
			if(i == 0)
			{
				System.out.println("Enter the first element");
				a[0] = Integer.parseInt(br.readLine());
			}
			else
			{
				System.out.println("Enter the next element");
				N = Integer.parseInt(br.readLine());
				obj.insert(N,i);
				System.out.println();
				System.out.println("The current array is");
				for(int j=0;j<=i;j++)
				System.out.print(a[j]+"  ");
				System.out.println();
				
			}
		}
	}
}