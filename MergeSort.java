/*
 Write a program to sort the elements
of the array using MergeSort.
*/
 import java.io.*;
class MergeSort
{
	static int size;
	void merge(int a[],int l,int m,int u)
	{
			int c[] = new int[size];
			int i,j,k;
			i=l;j=m+1;k=0;
			while(i<=m && j<=u)
			{
				if(a[j] > a[i])
				c[k++] = a[i++];
				else if(a[i] > a[j])
				c[k++] = a[j++];
				else
				{
				c[k++] = a[i++];
				j++;
				}

			}

			while(i<=m)
			c[k++] = a[i++];
			while(j<=u)
			c[k++] = a[j++];

			for(i=l,j=0;i<=u;i++,j++)
			a[i] = c[j];
	}
	void merge_sort(int a[],int i,int j)
	{
		int k=0;
		if(i<j)
		{
			k = (i+j)/2;
			merge_sort(a,i,k);
			merge_sort(a,k+1,j);
			merge(a,i,k,j);
		}
	}

	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[];
		System.out.println("Enter the size of the array");
		size = Integer.parseInt(br.readLine());
		a = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<=size-1;i++)
		a[i] = Integer.parseInt(br.readLine());
		MergeSort obj = new MergeSort();
		obj.merge_sort(a,0,size-1);

		System.out.println("The Sorted array is");
		for(int i=0;i<=size-1;i++)
		System.out.print(a[i]+"  ");
		System.out.println();
	}
}