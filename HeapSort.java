/*
 Write a program to sort the elements
of the array using HeapSorting.
*/ 
import java.io.*;
class HeapSort
{
	static void create(int heap[])
	{
		int i,n;
		n = heap[0]; // no. of elements
		for(i=n/2;i>=1;i--)
		down_adjust(heap,i);
	}
	static void down_adjust(int heap[],int i)
	{
		int j,temp,n,flag=1;
		n = heap[0];
		while(2*i<=n && flag==1)
		{
		 	j = 2*i;
		 	if(j+1<=n && heap[j+1] > heap[j])
		 	j = j + 1;

		 	if(heap[i] > heap[j])
		 	flag=0;

		 	else
		 	{
		 		temp = heap[i];
		 		heap[i] = heap[j];
		 		heap[j] = temp;
		 		i=j;
		 	}
		}
	}

	public static void main(String args[])throws IOException
	{
		int heap[],size=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array");
		size = Integer.parseInt(br.readLine());
		heap = new int[size+1];
		heap[0] = size;
		System.out.println("Enter array elements");
		for(int i=1;i<=size;i++)
		heap[i] = Integer.parseInt(br.readLine());

		create(heap);
		while(heap[0] >  1)
		{
			int last = heap[0];
			int temp = heap[1];
			heap[1] = heap[last];
			heap[last] = temp;
			heap[0]--;
			down_adjust(heap,1);

		}
		System.out.println("The Sorted elemenets are");
		for(int i=1;i<=size;i++)
		System.out.print(heap[i]+"  ");

	}
}